package com.yang.sac.user.domain;

public class Menu {
    private Long menuId;

    private Long menuParentId;

    private String menuName;

    private String menuIcon;
    
    private String menuDesc;

    private String actionAddress;

    private Integer actionType;

    private Integer menuStatus;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Long menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public String getActionAddress() {
        return actionAddress;
    }

    public void setActionAddress(String actionAddress) {
        this.actionAddress = actionAddress;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

	public String getMenuIcon()
	{
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon)
	{
		this.menuIcon = menuIcon;
	}
    
    
}