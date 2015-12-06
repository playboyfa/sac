/**
 * 
 */

function setNoLeafNodeMenu(parentMenuNode, menuNode)
{
	count = parseInt(parentMenuNode.attr("retract")) + 1;
	
	var menuNoLeafNode = 
			"<a " +
			"id=\"" + menuNode.menuId + "\" " +
			"parentid=\"" + menuNode.menuParentid + "\" " + 	
			"name=\"" + menuNode.menuName + "\"" +		
			"class=\"list-group-item\" " +
			"data-toggle=\"collapse\" " +
			"data-target=\"" + "#" + "collapse_" + menuNode.menuId + "\" " +
			"aria-controls=\"" + "collapse_" + menuNode.menuId + "\" " +
			"aria-expanded=\"false\"" +
			">";

			for (var i = 0; i < count; i++)
			{
				menuNoLeafNode +=  "&nbsp ";
			}
			
	menuNoLeafNode += menuNode.menuName + "</a>";
	
	parentMenuNode.append(menuNoLeafNode);
	
	menuNoLeafNode =
			"<div " +
			"class=\"collapse list-group\" " +
			"id=\"" + "collapse_" + menuNode.menuId + "\" " +
			"retract=\"" + count + "\"" +
			"></div>";
	
	$( "#" + menuNode.menuId).after(menuNoLeafNode);
}

var selectMenuNode = null;

function setLeafNodeMenu(parentMenuNode, menuNode)
{
	count = parseInt(parentMenuNode.attr("retract")) + 1;
	
	var menuLeafNode = 		
		"<a " +
		"id=\"" + menuNode.menuId + "\" " +
		"action=\"" + menuNode.action + "\" " +
		"name=\"" + menuNode.menuName + "\" " +
		"class=\"list-group-item\"" +
		">";
		
		for (var i = 0; i < count; i++)
		{
			menuLeafNode +=  "&nbsp ";
		}
		menuLeafNode +=
			"<span class=\"glyphicon glyphicon-hand-right\" " +
				"aria-hidden=\"true\">&nbsp</span>";
		
		menuLeafNode += menuNode.menuName + "</a>"
		 
	parentMenuNode.append( menuLeafNode );
		
	$( "#" + menuNode.menuId).click(
			function()
			{
				setMenuNodeToggle(selectMenuNode);
				
				selectMenuNode = $( "#" + menuNode.menuId);
				
				setMenuNodeToggle(selectMenuNode);
				
				var title = $("#" + menuNode.menuParentid).attr("name") +
							" > " +
							$("#" + menuNode.menuId).attr("name"); 
				
				$("#navTitle #title").text(title);

				var action = selectMenuNode.attr("action");
				action = contextPath + action;
				$("#mainFrame").attr("src", action);
			}
	);
}

function setMenuNodeToggle(menuNode)
{
	if (null == menuNode)
	{
		return;
	}
	
	var className = menuNode.attr("class");
	
	if (-1 == className.indexOf("active"))
	{
		menuNode.attr("class", "list-group-item active");				
	}
	else
	{
		menuNode.attr("class", "list-group-item");
	}
}

function parseMenu(menus, rootNode)
{
	var i = 0;
	for (i = 0; i < menus.length; i++)
	{
		var menuParentNode;
		if (-1 != menus[i].menuParentid)
		{
			var parentid = "#collapse_" + menus[i].menuParentid;
			menuParentNode = $(parentid);
		}
		else
		{
			menuParentNode = rootNode;
		}
		
		if ("0" == menus[i].isLeaf)
		{
			setNoLeafNodeMenu(menuParentNode, menus[i]);
		}
		else
		{
			setLeafNodeMenu(menuParentNode, menus[i]);
		}
	}
}

function queryMenu(data)
{	
	
	var menuContent = $("#menuBar #menuContent");
	
	reSortMenu(data, -1, new Array());
	parseMenu(data, menuContent);
}

function reSortMenu(data, parentid, sortMenus)
{
	if (data.length <= 0 )
	{
		return;
	}
	
	for (var ii = 0; ii < data.length; ii++)
	{
		if (parentid == data[ii].menuParentid) 
		{		
			var item = data[ii];
			
			data = data.slice(0, ii).concat(data.slice(ii + 1, data.length));
			
			ii--;
			
			sortMenus.push(item);
			
			reSortMenu(data, item.menuId, sortMenus);
		}
	}
	
}


