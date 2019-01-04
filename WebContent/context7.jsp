<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一个表单的小例子</title>
</head>
<body>
	<s:form action="context7">
  		<s:textfield name="name" label="用户名" />
  		<s:password name="password" label="密码" />
  		<s:checkbox name="married" label="已婚" value="true" />
  		<s:checkboxlist name="hobby" list="{'摄影','旅行','足球'}" label="爱好" />
  		<s:select name="city" label="故乡"  list="#{'BJ':'北京','SH':'上海','SZ':'苏州'}" headerKey="" headerValue="---请选择---"/>
  		<s:textarea name="description" label="个人介绍" rows="5"  cols="25" />
  		<s:radio name="gender" list="#{'male':'男','female':'女'}" label="性别" value="'male'" /><%--value是一个OGNL表达式 --%>
  		<s:submit value="提交" theme="simple"/><s:reset value="重置" theme="simple" />
  	</s:form>
  	<hr/>
  	<s:form action="context7" theme="simple">
  		<s:textfield name="name" label="用户名" />
  		<s:password name="password" label="密码" />
  		<s:checkbox name="married" label="已婚" value="true" />
  		<s:checkboxlist name="hobby" list="{'摄影','旅行','足球'}" label="爱好" />
  		<s:select name="city" label="故乡"  list="#{'BJ':'北京','SH':'上海','SZ':'苏州'}" headerKey="" headerValue="---请选择---"/>
  		<s:textarea name="description" label="个人介绍" rows="5"  cols="25" />
  		<s:radio name="gender" list="#{'male':'男','female':'女'}" label="性别" value="'male'" /><%--value是一个OGNL表达式 --%>
  		<s:submit value="提交" theme="simple"/><s:reset value="重置" theme="simple" />
  	</s:form>
  	<%-- <s:debug/> --%>

</body>
</html>