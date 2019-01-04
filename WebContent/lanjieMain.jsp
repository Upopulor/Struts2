<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检测登录的拦截器</title>
</head>
<body>
	<%--要想来到本页面，必须得先登录 --%>
	主页<hr/>
	<a href="${pageContext.request.contextPath }/showOther.action">访问另一个页面</a>
</body>
</html>