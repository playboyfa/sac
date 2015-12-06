<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<body>
   <H1>500  服务器错误！</H1><%=exception%>
   <H2>错误内容：</H2>
	<%
	         exception.printStackTrace(response.getWriter());
     %>
</body>
</html>