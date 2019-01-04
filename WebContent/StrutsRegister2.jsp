<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- 导入Struts2的标签库 --%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
    <s:actionerror/><%--动作错误 --%>
    <s:fielderror /><%--字段错误 --%>
    <%--struts2的form，提供一些与HTML一致的属性
    	action：请求的地址，直接写动作名称，不用写contextPAth
    	method：请求的方式，Struts2的from表单默认就是post，so不用写
    	enctype:表单编码的mime类型
     --%>
    <s:form action="register.action">
    	<s:textfield name="username" label="用户名" requiredLabel="true" requiredPosition="left"></s:textfield>
    	<s:password name="password" label="密码" showPassword="true"></s:password>
    	<s:textfield name="birthday" label="生日"></s:textfield>
    	<s:submit value="注册"></s:submit>
    </s:form>
    <%--struts2的form标签，它提供了和原始HTML表标签几乎一致的属性 --%>
    <%-- 
	<form action="${pageContext.request.contextPath}/register.action" method="post">
   		用户名：<input type="text" name="username" /><br/>
   		密码：<input type="password" name="password" /><br/>
   		生日：<input type="text" name="birthday" /><br/>
   		爱好：<input type="checkbox" name="hobby" value="吃饭"/>吃饭
   			<input type="checkbox" name="hobby" value="睡觉"/>睡觉
   			<input type="checkbox" name="hobby" value="写代码"/>写代码
   			<br/>
   		已婚：<input type="checkbox" name="married" value="true"/><br/>
   		<input type="submit" value="注册" />
   	</form>
   	--%>
</body>
</html>