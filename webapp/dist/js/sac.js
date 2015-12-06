
function loginout()
{
    $(
	function()
	{  
	    location.href = "loginout.do";
	}); 

}

(function()
{
    dwr.engine.setAsync(false);
    getRoleMenusByUserName(userName);
    dwr.engine.setAsync(true);
})();

function getRoleMenusByUserName(name)
{	
    UserDwr.getRoleMenusByUserName(name, queryMenu);
}

function queryMenu(date)
{
    if (null == date || date.length == 0)
    {
	return;
    }
    
    var root = $(".sidebar .sidebar-menu");

    var ii = 0;
    
    for (ii = 0; ii < date.length; ii++)
    {
	parseMenus(root, date[ii])
    }    
    
    date = null;
}

function parseMenus(node, mn)
{
    var menu = mn.menu;
    var childMenus = mn.childMenus;

    node.append("<li><a href=\"#\"><i></i><span></span></a></li>");
    
    var node_li = $("li", node).last();
    node_li.attr("menuName", menu.menuName);
    node_li.attr("id", menu.menuId);
    node_li.attr("parentId", menu.menuParentId);
    node_li.find("a i").addClass("fa " + menu.menuIcon);
    node_li.find("a span").text(menu.menuName);
    
    if (null == childMenus)
    {
	node_li.attr("isLeaf", "1");
	node_li.attr("action", menu.actionAddress);
	return;
    }

    node_li.attr("isLeaf", "0");
    node_li.attr("class", "treeview");    
    node_li.find("a").append("<i class=\"fa fa-angle-left pull-right\"></i>");    
    node_li.append("<ul></ul>");        
    
    var ulNode = node_li.find("ul");
    
    ulNode.addClass("treeview-menu");
    ulNode.attr("parentId", menu.menuId);
    
    // ul
    // 添加ul li ul li
    var jj = 0;
    for (jj = 0; jj < childMenus.length; jj++)
    {
	// li
	parseMenus(ulNode, childMenus[jj]);
    }
}

