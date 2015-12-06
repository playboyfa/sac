package com.yang.sac.user.service;

import java.util.List;

import com.yang.sac.user.domain.MenuTree;
import com.yang.sac.user.domain.User;

public interface UserService
{
	void initAllRoleMenus();

	List<MenuTree> getRoleMenusByUserName(String userName);	
	
	User getUserByUserName(String userName);
	
}
