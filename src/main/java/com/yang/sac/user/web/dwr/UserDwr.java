package com.yang.sac.user.web.dwr;

import java.util.List;

import com.yang.sac.commons.SpringUtils;
import com.yang.sac.user.domain.MenuTree;
import com.yang.sac.user.service.UserService;
import com.yang.sac.user.service.impl.UserServiceImpl;

public class UserDwr
{
	private UserService userService = SpringUtils.getBean(UserServiceImpl.class);
	
	//查询指定用户菜单
	public List<MenuTree> getRoleMenusByUserName(String userName)
	{
		return userService.getRoleMenusByUserName(userName);
	}
}
