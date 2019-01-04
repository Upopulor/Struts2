<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>checkboxList标签的使用</title>
</head>
<body>
	<s:form action="save">
		<%--checkboxlist:是在表单中生成的一些复选框，list的取值是一个OGNL表达式 --%>
		<s:checkboxlist name="hobby" list="hobbyArr"></s:checkboxlist>
		<s:submit value="提交"></s:submit>
	</s:form>
	<s:debug/>
</body>
</html>