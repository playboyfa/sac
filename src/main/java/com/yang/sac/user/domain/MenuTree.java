package com.yang.sac.user.domain;

import java.util.List;

public class MenuTree
{
	private Menu menu;

	private MenuTree parentMenu;
	
	private List<MenuTree> childMenus;

	public Menu getMenu()
	{
		return menu;
	}

	public void setMenu(Menu menu)
	{
		this.menu = menu;
	}

	public MenuTree getParentMenu()
	{
		return parentMenu;
	}

	public void setParentMenu(MenuTree parentMenu)
	{
		this.parentMenu = parentMenu;
	}

	public List<MenuTree> getChildMenus()
	{
		return childMenus;
	}

	public void setChildMenus(List<MenuTree> childMenus)
	{
		this.childMenus = childMenus;
	}
	
	
}
