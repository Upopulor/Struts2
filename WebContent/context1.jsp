<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取ActionContext数据</title>
</head>
<body>
	<s:debug/>
	<%--使用s:property获取ActionContext中的数据 value属性的取值是一个OGNL表达式--%>
	<br/>获取大map中的数据 <br/>
	<!-- 在取的时候是#key名称 -->
	<s:property value="#contextMap"/><br/>	
	<%--获取大map中小map的数据   #大mapkey.小mapkey --%>
	<s:property value="#session.sessionMap"/><br/>
	<s:property value="#application.applicationMap1"/><br/>
	
</body>
</html>