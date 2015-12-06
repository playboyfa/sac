package com.yang.sac.user.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.sac.user.dao.MenuMapper;
import com.yang.sac.user.dao.RoleMapper;
import com.yang.sac.user.dao.RoleMenuRsMapper;
import com.yang.sac.user.dao.UserMapper;
import com.yang.sac.user.dao.UserRoleMapper;
import com.yang.sac.user.domain.Menu;
import com.yang.sac.user.domain.MenuTree;
import com.yang.sac.user.domain.Role;
import com.yang.sac.user.domain.RoleMenuRs;
import com.yang.sac.user.domain.User;
import com.yang.sac.user.domain.UserRole;
import com.yang.sac.user.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	private Map<Long, Role> roleMap = new HashMap<Long, Role>();
	private Map<Long, Menu> menuMap = new HashMap<Long, Menu>();
	
	private Map<Long, Map<Long, List<Menu>>> roleMenuChildListMap = new HashMap<Long, Map< Long, List<Menu>>>();
	
	private Map<Long, Map<Long, Menu>> roleMenuMap = new HashMap<Long, Map<Long, Menu>>();
	
	private Map<Long, List<MenuTree>> roleMenuTree = new HashMap<Long, List<MenuTree>>();
			
	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private MenuMapper menuMapper;
	
	@Autowired
	private RoleMenuRsMapper roleMenuRsMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	/**根据用户名查询用户
	 * @param userName
	 * @return
	 */
	@Override
	public User getUserByUserName(String userName)
	{
		return userMapper.selectByUserName(userName);
	}

	/**
	 * 初始化所有的角色菜单
	 */
	@Override
	public void initAllRoleMenus()
	{
		loadAllRoles();
		loadAllMenus();
		loadAllRoleMenuRs();
		loadAllMenuTree();
	}
	
	public void loadAllMenuTree()
	{
		Collection<Role> roles = roleMap.values();
		
		for (Role role : roles)
		{
			roleMenuTree.put(role.getRoleId(), loadMenuTree(role.getRoleId()));
		}
	}
	
	/**获取指定用户
	 * @param userName
	 * @return
	 */
	@Override
	public List<MenuTree> getRoleMenusByUserName(String userName)
	{
		List<UserRole> rs = getUserRoleByUserName(userName);
		
		if (rs.size() < 0)
		{
			return null;
		}
		
		if (rs.size() > 1)
		{
			logger.warn("no support multi user roles");
		}
		
		return roleMenuTree.get(rs.get(0).getRoleId());
	}

	
	/**根据用户名查询用户角色
	 * @param userName
	 * @return
	 */
	private List<UserRole> getUserRoleByUserName(String userName)
	{
		return userRoleMapper.selectUserRoleByUserName(userName);
	}
	
	/**
	 * 加载所有的菜单
	 */
	private void loadAllRoleMenuRs()
	{
		List<RoleMenuRs> roleMenuRsList = roleMenuRsMapper.selectAllRoleMenuRs();
	
		//角色ID， 菜单
		for (RoleMenuRs i : roleMenuRsList)
		{
			Menu menu = menuMap.get(i.getMenuId());
			
			Map<Long, Menu> roleMenus = roleMenuMap.get(i.getRoleId());
			
			Map<Long, List<Menu>> childMenus = roleMenuChildListMap.get(i.getRoleId());
						
			if (null != menu)
			{
				roleMenus.put(menu.getMenuId(), menu);
				
				if (!childMenus.containsKey(menu.getMenuParentId()))
				{
					childMenus.put(menu.getMenuParentId(), new ArrayList<Menu>());
				}
				
				List<Menu> menus = childMenus.get(menu.getMenuParentId());
				
				menus.add(menu);
			}			
		}
	}

	private void loadAllMenus()
	{
		List<Menu> menuList = menuMapper.selectAllMenus();
		
		for (Menu i : menuList)
		{
			if (!menuMap.containsKey(i.getMenuId()))
			{
				menuMap.put(i.getMenuId(), i);
				
				continue;
			}
			logger.error(" menu id:" + i.getMenuId() + " is repeat");
		}
	}
	
	/** 递归树
	 * @return
	 */
	public List<MenuTree> loadMenuTree(Long roleId)
	{
		if (null == roleId)
		{
			return null;
		}
		
		Map<Long, List<Menu>> menuChildListMap = roleMenuChildListMap.get(roleId);
		
		if (null == menuChildListMap)
		{
			return null;
		}
		
		List<Menu> rootList = menuChildListMap.get(-1L);

		if (null == rootList)
		{
			return null;
		}
		
		List<MenuTree> trees = new ArrayList<MenuTree>();
		
		for (Menu i : rootList)
		{
			MenuTree o = new MenuTree();
			o.setMenu(i);
			
			List<Menu> childMenuList = menuChildListMap.get(i.getMenuId());

			trees.add(o);
			
			if (null == childMenuList)
			{
				continue;
			}
						
			List<MenuTree> childList = new ArrayList<MenuTree>();
			o.setChildMenus(childList);
			
			for (Menu child : childMenuList)
			{
				MenuTree ct = new MenuTree();
				ct.setMenu(child);				
				ct.setParentMenu(o);	
				
				List<MenuTree> childMenu = loadMenuTree(roleId, ct);
				
				if (null != childMenu)
				{
					ct.setChildMenus(childMenu);
				}
				childList.add(ct);
			}
		}
		
		return trees;
	}
	
	private List<MenuTree> loadMenuTree(Long roleId, MenuTree menuTree)
	{
		if (null == roleId)
		{
			return null;
		}
		
		Map<Long, List<Menu>> menuChildListMap = roleMenuChildListMap.get(roleId);
		
		List<Menu> list = menuChildListMap.get(menuTree.getMenu().getMenuId());
		
		if (null == list)
		{
			return null;
		}
		
		List<MenuTree> trees = new ArrayList<MenuTree>();		
		
		for (Menu i : list)
		{
			MenuTree o = new MenuTree();
			o.setMenu(i);
			o.setParentMenu(menuTree);
			
			List<MenuTree> childMenu = loadMenuTree(roleId, o);
			
			if (null != childMenu)
			{
				o.setChildMenus(childMenu);
			}
			trees.add(o);
		}
		
		return trees;
	}

	private void loadAllRoles()
	{
		//查询所有角色	
		List<Role> roleList = roleMapper.selectAllRoles();
		
		for(Role i : roleList)
		{
			if (!roleMenuMap.containsKey(i.getRoleId()))
			{
				roleMenuMap.put(i.getRoleId(), new HashMap<Long, Menu>());
			}
			
			if (!roleMenuChildListMap.containsKey(i.getRoleId()))
			{
				roleMenuChildListMap.put(i.getRoleId(), new HashMap<Long, List<Menu>>());
			}
			
			if (!roleMap.containsKey(i.getRoleId()))
			{
				roleMap.put(i.getRoleId(), i);
				continue;
			}
			logger.error(" role id:" + i.getRoleId() + " is repeat");
		}
	}
}
