<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 导入Struts2的标签库 --%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<s:head></s:head>
</head>
<body>
	<s:actionerror/>
	<s:form action="addStudent.action">
  		<s:textfield name="username" label="用户名" />
  		<s:textfield name="age" label="年龄"/>
  		<s:textfield name="email" label="邮箱"/>
  		<s:textfield name="password" label="密码" />
  		<s:textfield name="repassword" label="确认密码"/>
  		<s:textfield name="score" label="成绩"/>
  		<s:textfield name="url" label="个人主页"/>
  		<%--list中的取值是生成一个list集合，并往集合中放入元素 --%>
  		<s:radio name="gender" list="{'男','女'}"  label="性别"/>
  		<s:submit value="注册"/>
  	</s:form>
</body>
</html>