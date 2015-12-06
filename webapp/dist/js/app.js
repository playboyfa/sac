/*! SAC app.js
 */

'use strict';

//Make sure jQuery has been loaded before app.js
if (typeof jQuery === "undefined") {
  throw new Error("SAC requires jQuery");
}

/* SAC
 *
 * @type Object
 * @description $.SAC is the main object for the template's app.
 *              It's used for implementing functions and options related
 *              to the template. Keeping everything wrapped in an object
 *              prevents conflict with other plugins and is a better
 *              way to organize our code.
 */
$.SAC = {};

/* --------------------
 * - SAC Options -
 * --------------------
 * Modify these options to suit your implementation
 */
$.SAC.options = {
  //Add slimscroll to navbar menus
  //This requires you to load the slimscroll plugin
  //in every page before app.js
  navbarMenuSlimscroll: true,
  navbarMenuSlimscrollWidth: "3px", //The width of the scroll bar
  navbarMenuHeight: "200px", //The height of the inner menu
  //General animation speed for JS animated elements such as box collapse/expand and 
  //sidebar treeview slide up/down. This options accepts an integer as milliseconds,
  //'fast', 'normal', or 'slow'
  animationSpeed: 100,
  //Sidebar push menu toggle button selector
  sidebarToggleSelector: "[data-toggle='offcanvas']",
  //Activate sidebar push menu
  sidebarPushMenu: true,
  //Activate sidebar slimscroll if the fixed layout is set (requires SlimScroll Plugin)
  sidebarSlimScroll: true,
  //Enable sidebar expand on hover effect for sidebar mini
  //This option is forced to true if both the fixed layout and sidebar mini
  //are used together
  sidebarExpandOnHover: false,
  //Bootstrap.js tooltip
  enableBSToppltip: true,
  BSTooltipSelector: "[data-toggle='tooltip']",
  //Enable Fast Click. Fastclick.js creates a more
  //native touch experience with touch devices. If you
  //choose to enable the plugin, make sure you load the script
  //before SAC's app.js
  enableFastclick: true,
  //Control Sidebar Options
  enableControlSidebar: true,
  controlSidebarOptions: {
    //Which button should trigger the open/close event
    toggleBtnSelector: "[data-toggle='control-sidebar']",
    //The sidebar selector
    selector: ".control-sidebar",
    //Enable slide over content
    slide: true
  },
  //The standard screen sizes that bootstrap uses.
  //If you change these in the variables.less file, change
  //them here too.
  screenSizes: {
    xs: 480,
    sm: 768,
    md: 992,
    lg: 1200
  }
};


/* ------------------
 * - Implementation -
 * ------------------
 * The next block of code implements SAC's
 * functions and plugins as specified by the
 * options above.
 */
$(function () {
  //Extend options if external options exist
  if (typeof SACOptions !== "undefined") {
    $.extend(true,
            $.SAC.options,
            SACOptions);
  }

  //Easy access to options
  var o = $.SAC.options;

  //Set up the object
  _init();

  
  //Activate the layout maker
  $.SAC.layout.activate();
  
  //Enable sidebar tree view controls
  $.SAC.tree('.sidebar');

  //Enable control sidebar
  if (o.enableControlSidebar) {
    $.SAC.controlSidebar.activate();
  }

  //Add slimscroll to navbar dropdown
  if (o.navbarMenuSlimscroll && typeof $.fn.slimscroll != 'undefined') {
    $(".navbar .menu").slimscroll({
      height: o.navbarMenuHeight,
      alwaysVisible: false,
      size: o.navbarMenuSlimscrollWidth
    }).css("width", "100%");
  }

  //Activate sidebar push menu
  if (o.sidebarPushMenu) {
    $.SAC.pushMenu.activate(o.sidebarToggleSelector);
  }

  //Activate Bootstrap tooltip
  if (o.enableBSToppltip) {
    $('body').tooltip({
      selector: o.BSTooltipSelector
    });
  }


  //Activate fast click
  if (o.enableFastclick && typeof FastClick != 'undefined') {
    FastClick.attach(document.body);
  }
  
  $.SAC.defaultMenuClick('.sidebar');

  /*
   * INITIALIZE BUTTON TOGGLE
   * ------------------------
   */
  $('.btn-group[data-toggle="btn-toggle"]').each(function () {
    var group = $(this);
    $(this).find(".btn").on('click', function (e) {
      group.find(".btn.active").removeClass("active");
      $(this).addClass("active");
      e.preventDefault();
    });

  });
});

/* ----------------------------------
 * - Initialize the SAC Object -
 * ----------------------------------
 * All SAC functions are implemented below.
 */
function _init() {

  /* Layout
   * ======
   * Fixes the layout height in case min-height fails.
   *
   * @type Object
   * @usage $.SAC.layout.activate()
   *        $.SAC.layout.fix()
   *        $.SAC.layout.fixSidebar()
   */
  $.SAC.layout = {
    activate: function () {
      var _this = this;
      _this.fix();
      _this.fixSidebar();
      $(window, ".wrapper").resize(function () {
        _this.fix();
        _this.fixSidebar();
      });
    },
    fix: function () {
      //Get window height and the wrapper height
      var neg = $('.main-header').outerHeight() + $('.main-footer').outerHeight();
      var window_height = $(window).height();
      var sidebar_height = $(".sidebar").height();
      //Set the min-height of the content and sidebar based on the
      //the height of the document.
      if ($("body").hasClass("fixed")) {
        $(".content-wrapper").css('min-height', window_height - $('.main-footer').outerHeight());
      } else {
        var postSetWidth;
        if (window_height >= sidebar_height) {
          $(".content-wrapper").css('min-height', window_height - neg);
          var content = $(".content-wrapper .content");
          content.css('min-height', window_height - neg - $('.content-header').outerHeight());
          postSetWidth = window_height - neg;
        } else {
          $(".content-wrapper").css('min-height', sidebar_height);
          postSetWidth = sidebar_height;
        }
      }
    },
    fixSidebar: function () {
      //Make sure the body tag has the .fixed class
      if (!$("body").hasClass("fixed")) {
        if (typeof $.fn.slimScroll != 'undefined') {
          $(".sidebar").slimScroll({destroy: true}).height("auto");
        }
        return;
      } else if (typeof $.fn.slimScroll == 'undefined' && console) {
        console.error("Error: the fixed layout requires the slimscroll plugin!");
      }
      //Enable slimscroll for fixed layout
      if ($.SAC.options.sidebarSlimScroll) {
        if (typeof $.fn.slimScroll != 'undefined') {
          //Destroy if it exists
          $(".sidebar").slimScroll({destroy: true}).height("auto");
          //Add slimscroll
          $(".sidebar").slimscroll({
            height: ($(window).height() - $(".main-header").height()) + "px",
            color: "rgba(0,0,0,0.2)",
            size: "3px"
          });
        }
      }
    }
  };

  /* PushMenu()
   * ==========
   * Adds the push menu functionality to the sidebar.
   *
   * @type Function
   * @usage: $.SAC.pushMenu("[data-toggle='offcanvas']")
   */
  $.SAC.pushMenu = {
    activate: function (toggleBtn) {
      //Get the screen sizes
      var screenSizes = $.SAC.options.screenSizes;
    
      //Enable sidebar toggle
      $(toggleBtn).on('click', function (e) {
        e.preventDefault();

        //Enable sidebar push menu
        if ($(window).width() > (screenSizes.sm - 1)) {
          if ($("body").hasClass('sidebar-collapse')) {
              $("body").removeClass('sidebar-collapse').trigger('expanded.pushMenu');
          } else {
              $("body").addClass('sidebar-collapse').trigger('collapsed.pushMenu');
          }
        }
        //Handle sidebar push menu for small screens
        else {
          if ($("body").hasClass('sidebar-open')) {
            $("body").removeClass('sidebar-open').removeClass('sidebar-collapse').trigger('collapsed.pushMenu');
          } else {
            $("body").addClass('sidebar-open').trigger('expanded.pushMenu');
          }
        }
      });

      $(".content-wrapper").click(function () {
        //Enable hide menu when clicking on the content-wrapper on small screens
        if ($(window).width() <= (screenSizes.sm - 1) && $("body").hasClass("sidebar-open")) {
          $("body").removeClass('sidebar-open');
        }
      });

      //Enable expand on hover for sidebar mini
      if ($.SAC.options.sidebarExpandOnHover
              || ($('body').hasClass('fixed')
                      && $('body').hasClass('sidebar-mini'))) {
        this.expandOnHover();
      }
    },
    expandOnHover: function () {
      var _this = this;
      var screenWidth = $.SAC.options.screenSizes.sm - 1;
      //Expand sidebar on hover
      $('.main-sidebar').hover(function () {
        if ($('body').hasClass('sidebar-mini')
                && $("body").hasClass('sidebar-collapse')
                && $(window).width() > screenWidth) {
          _this.expand();
        }
      }, function () {
        if ($('body').hasClass('sidebar-mini')
                && $('body').hasClass('sidebar-expanded-on-hover')
                && $(window).width() > screenWidth) {
          _this.collapse();
        }
      });
    },
    expand: function () {
      $("body").removeClass('sidebar-collapse').addClass('sidebar-expanded-on-hover');
    },
    collapse: function () {
      if ($('body').hasClass('sidebar-expanded-on-hover')) {
        $('body').removeClass('sidebar-expanded-on-hover').addClass('sidebar-collapse');
      }
    }
  };

  /* Tree()
   * ======
   * Converts the sidebar into a multilevel
   * tree view menu.
   *
   * @type Function
   * @Usage: $.SAC.tree('.sidebar')
   */
  $.SAC.tree = function (menu) {
    var _this = this;
    var animationSpeed = $.SAC.options.animationSpeed;
    $("li a", $(menu)).on('click', function (e) {
      //Get the clicked link and the next element
      var $this = $(this);
      var parent_li = $this.parent("li");
      var checkElement = $this.next();
      
      var isLeaf= parent_li.attr("isLeaf");
      
      //Check if the next element is a menu and is visible
      if ((checkElement.is('.treeview-menu')) && (checkElement.is(':visible'))) {
        //Close the menu
        checkElement.slideUp(animationSpeed, function () {
          checkElement.removeClass('menu-open');
          //Fix the layout in case the sidebar stretches over the height of the window
          //_this.layout.fix();
        });
      }
      //If the menu is not visible
      else if ((checkElement.is('.treeview-menu')) && (!checkElement.is(':visible'))) {
        //Get the parent menu
        var parent = $this.parents('ul').first();
        //Close all open menus within the parent
        var ul = $('ul:visible', parent).first();
        ul.slideUp(animationSpeed);
        //Remove the menu-open class from the parent
        ul.removeClass('menu-open');

        //Open the target menu and add the menu-open class
        checkElement.slideDown(animationSpeed, function () {
          //Add the class active to the parent li
          checkElement.addClass('menu-open');
          //Fix the layout in case the sidebar stretches over the height of the window
          _this.layout.fix();
        });
      }

      //叶子节点
      if ('1' == isLeaf){
	      //取消所有节点状态	
	      $(".sidebar .sidebar-menu li").removeClass('active');  

	      var parentId = "-1";
	      var item_li = parent_li;
	      
	      var li_selects = new Array();
	      do
	      {
		  li_selects.unshift(item_li);
		  item_li.addClass('active');		  	  
		  parentId = item_li.attr("parentId");
		  item_li = item_li.parent().parent("li[id=" + "'" + parentId + "'" + "]");
	      }while("-1" != parentId);
	      
	      var action = parent_li.attr("action");
	      
	      action = contextPath + action;
	      
	      
	      $.ajax({
                  type:"get",
                  url: action,
                  dataType:"html",
                  beforeSend:function(){$(".content-wrapper .content").html("<h1 style='text-align:center'>页面加载中...</h1>")},                                                                        
                  success:function(result){
                      $(".content-wrapper .content").html(result); 
                  }
              });
	      
	      
	      //设置导航信息
	      var li_home_tip = $('.content-wrapper .content-header ol');
	      
	      $('li', li_home_tip).remove();
	      
	      var menuName = li_selects[0].attr('menuName');
	      li_home_tip.append("<li><a href='#'><i class='fa fa-home'></i>" + menuName + "</a></li>");
	      
	      for (var ii = 1; ii < li_selects.length; ii++)
	      {
		  var menuName = li_selects[ii].attr('menuName');
		  li_home_tip.append("<li>" + menuName + "</li>");
	      }
	      $("li", li_home_tip).last().addClass('active');
      } 

      //if this isn't a link, prevent the page from being redirected
      if (checkElement.is('.treeview-menu')) {
        e.preventDefault();
      }
    });
  };

  $.SAC.defaultMenuClick = function(menu)
  {
	 var isLeaf = '0';
	    var li_node = $("li a", menu).first();
	    do
	    {
		li_node.click();
		isLeaf = li_node.parent().attr('isLeaf');
		li_node = $("li a", li_node.parent()).first();
	    }while('0' == isLeaf);
  }
  /* ControlSidebar
   * ==============
   * Adds functionality to the right sidebar
   *
   * @type Object
   * @usage $.SAC.controlSidebar.activate(options)
   */
  $.SAC.controlSidebar = {
    //instantiate the object
    activate: function () {
      //Get the object
      var _this = this;
      //Update options
      var o = $.SAC.options.controlSidebarOptions;
      //Get the sidebar
      var sidebar = $(o.selector);
      //The toggle button
      var btn = $(o.toggleBtnSelector);

      //Listen to the click event
      btn.on('click', function (e) {
        e.preventDefault();
        //If the sidebar is not open
        if (!sidebar.hasClass('control-sidebar-open')
                && !$('body').hasClass('control-sidebar-open')) {
          //Open the sidebar
          _this.open(sidebar, o.slide);
        } else {
          _this.close(sidebar, o.slide);
        }
      });

      //If the body has a boxed layout, fix the sidebar bg position
      var bg = $(".control-sidebar-bg");
      _this._fix(bg);

      //If the body has a fixed layout, make the control sidebar fixed      
      if ($('body').hasClass('fixed')) {
        _this._fixForFixed(sidebar);
      } else {
        //If the content height is less than the sidebar's height, force max height
        if ($('.content-wrapper').height() < sidebar.height()) {
          _this._fixForContent(sidebar);
        }
      }
    },
    //Open the control sidebar
    open: function (sidebar, slide) {
      var _this = this;
      //Slide over content
      if (slide) {
        sidebar.addClass('control-sidebar-open');
      } else {
        //Push the content by adding the open class to the body instead 
        //of the sidebar itself
        $('body').addClass('control-sidebar-open');
      }
    },
    //Close the control sidebar
    close: function (sidebar, slide) {
      if (slide) {
        sidebar.removeClass('control-sidebar-open');
      } else {
        $('body').removeClass('control-sidebar-open');
      }
    },
    _fix: function (sidebar) {
      var _this = this;
      if ($("body").hasClass('layout-boxed')) {
        sidebar.css('position', 'absolute');
        sidebar.height($(".wrapper").height());
        $(window).resize(function () {
          _this._fix(sidebar);
        });
      } else {
        sidebar.css({
          'position': 'fixed',
          'height': 'auto'
        });
      }
    },
    _fixForFixed: function (sidebar) {
      sidebar.css({
        'position': 'fixed',
        'max-height': '100%',
        'overflow': 'auto',
        'padding-bottom': '50px'
      });
    },
    _fixForContent: function (sidebar) {
      $(".content-wrapper, .right-side").css('min-height', sidebar.height());
    }
  };
}
