<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>SAC | 系统管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.4 -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<!-- FontAwesome 4.3.0 -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
	
<!-- Theme style -->
<link href="dist/css/sac.css" rel="stylesheet" type="text/css" />

<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link href="dist/css/skins/_all-skins.css" rel="stylesheet"
	type="text/css" />
	
<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/engine.js">
</script>

<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/util.js">
    
</script>

<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/interface/UserDwr.js">
</script>  

<script>		
	var contextPath = '<%=request.getScheme()%>' + '://' + '<%=request.getServerName()%>' +
		 ':' + '<%=request.getServerPort()%>' + '<%=request.getContextPath()%>';
	var userName = '<%=(String)request.getSession().getAttribute("account")%>';
</script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="skin-blue sidebar-mini">
	<div class="wrapper">
		<header class="main-header">
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<li><a href="#" onclick="loginout()"
							data-toggle="control-sidebar"> <i class="fa fa-sign-out"></i>
						</a></li>
					</ul>
				</div>
			</nav>
		</header>
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="dist/img/user-fa.jpg" class="img-circle"
							alt="User Image" />
					</div>
					<div class="pull-left info">
						<p>杨思发</p>
						<a href="#"><i class="fa fa-circle text-success"></i>在线</a>
					</div>
				</div>
			
				<!-- search form -->
				<form action="#" method="get" class="sidebar-form" style="display:none">
					<div class="input-group">
						<input type="text" name="q" class="form-control"
							placeholder="请输入关键字" /> <span class="input-group-btn">
							<button type="button" name="search" id="search-btn"
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form>
				
				<ul class="sidebar-menu">
					<li class="header">菜单</li>					
				</ul>
			</section>
		</aside>
		
		<div class="content-wrapper">			
			<!-- Content Header (Page header) -->
			<section class="content-header">			
				<ol class="breadcrumb">
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
			</section>
		</div>
		
		<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 0.0.9
			</div>
			<strong>Copyright &copy; 2015-2016 SAC Studio. </strong> All rights
			reserved.
		</footer>
	</div>

	<!-- jQuery 2.1.4 -->
	<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
	
	<!-- Bootstrap 3.3.2 JS -->
	<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	
	<!-- Slimscroll -->
	<script src="plugins/slimScroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<!-- FastClick -->
	<script src="plugins/fastclick/fastclick.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="dist/js/sac.js" type="text/javascript"></script>
	<script src="dist/js/app.js" type="text/javascript"></script>
</body>
</html>


