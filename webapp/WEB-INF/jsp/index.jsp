<%@page import="com.yang.sac.user.constants.Constants"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.yang.sac.user.constants.Constants"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html;" charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="favicon.ico">
<link rel="shortcut icon" href="favicon.ico" />
<title>SAC</title>

<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="dist/css/login/signin.css" rel="stylesheet">

<script type="text/javascript" src="plugins/jQuery/jQuery-2.1.4.min.js"></script>

<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/engine.js">
    
</script>
<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/util.js">
    
</script>
<script type='text/javascript'
	src="<%=request.getContextPath()%>/dwr/interface/UserDwr.js">
    
</script>

<script type="text/javascript">	
    function onload()
    {		
		$("#inputAccount").val('${account}');
	
		if ('' == '${msg}')
		{
		    $("#btnLogin").removeAttr("disabled");
		    return;
		}
		
		
		$("#btnLogin").attr("disabled", "disabled");
		$("#loginTip #tip").show();
	
		$("#loginTip #tip").text('${msg}').slideDown(1000).delay(2000).slideUp(300, function()
		{
		    $("#btnLogin").removeAttr("disabled");
		});
		<%
				String account = (String) request.getSession().getAttribute(
						"account");
				request.getSession().invalidate();
				request.getSession(true).setAttribute("account", account);%>
    }

    function checkSubmit()
    {
	    $("#btnLogin").attr("disabled", "disabled");
	    
		var account = $("#inputAccount").val();
		var password = $("#inputPassword").val();
	
		if ('' == account || '' == password)
		{
		    $("#loginTip #tip").show();
	
		    $("#loginTip #tip").text('<%=Constants.ERR_PARAM_EMPTY%>'
			    ).slideDown(1000).delay(2000).slideUp(300,
			    function()
			    {
					$("#btnLogin").removeAttr("disabled");
			    });
		    return false;
		}
	
		return true;
    }
</script>

</head>

<body onload="onload()">

	<div class="container login-page">
		<div class="login-box">
			<h1 class="title">SAC</h1>
			<form id="loginForm" class="form-signin" action="checkLogin.do"
				method="post" onsubmit="return checkSubmit()">
				<label for="inputAccount" class="sr-only">用户名：</label>
				<input
					type="text" name="account" id="inputAccount" class="form-control"
					placeholder="请输入用户名" autofocus>
				<label for="inputPassword"
					class="sr-only">密码：</label> 
				<input type="password" name="password"
					id="inputPassword" class="form-control" placeholder="请输入密码">
				<div id="loginTip">
					<p id="tip" class="text-danger"></p>
				</div>
				<button id="btnLogin" type="submit"
					class="btn btn-lg btn-primary btn-block">登录</button>
			</form>
			<div class="footer">
				<a>注册&nbsp&nbsp</a> <a>下载客户端</a>
			</div>
		</div>
	</div>
</body>
</html>