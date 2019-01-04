<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取ValueStack数据</title>
</head>
<body>
	<!-- 使用s:properties标签，获取ValueStack中的元素，value的属性取值是OGNL表达式，只能取元素中的属性 -->
	<!-- 取value的对象属性时，不加# -->
	<s:property value="name"/>
	<%--获取ValueStack指定位置的属性     [索引].属性名称    --%>
	<s:property value="[0].name"/>
	<s:property value="[1].name"/>
	<s:property value="[2].name"/>
	<s:property value="[3].name"/>
	<s:property value="[4].name"/>
	<!-- 取栈顶map的元素 -->
	<s:property value="s1.name"/>
	<!-- 当s:properties什么也不写，默认取栈顶 元素-->
	<s:property/>
	<%//模拟原理:其实全是ValueStack的findValue和findString
	  ValueStack vs5 = ActionContext.getContext().getValueStack();
	  Object obj = vs5.findValue("name");
	  Object obj2 = vs5.findValue("[1].name");
	  out.print("<br/>");
	  out.print(obj+"\t");
	  out.print(obj2);
	%>
	<s:debug/>
	
</body>
</html>