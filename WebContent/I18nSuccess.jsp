<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2中的国际化</title>
</head>
<body>
	<%-- 在jsp页面中访问消息资源包，必须使用Struts2标签<br/> --%>
	<%--使用s:text获取消息资源包的值 --%>
	<s:text name="key"></s:text>
</body>
</html>