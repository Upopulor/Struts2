<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tomcat.apache.org/myfunction" prefix="myfn" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--el表达式：${} jsp表达式： <%= %> --%>
	<%--EL --%>
	abcd -->  ABCD
	${myfn:toUpperCase("abcd")}
	<%-- OGNL表达式：它可以访问普通方法
		OGNL表达式必须写在Struts2的标签中 s:property类似jsp的表达式，把值输出到浏览器
		value中的内容不再是我们看到的字符串，而是一个OGNL表达式。如果想让他变字符串，在值外面套单引号
	 --%>
	 <s:property value="OGNL-Expression"/><br/>
	 <s:property value="'OGNL-Expression'"/><br/>
	 <s:property value="'OGNL-Expression'.length()"/><br/>
	 
	 <%--OGNL 访问静态属性  @全类名@静态属性--%>
	 <s:property value="@java.lang.Integer@MAX_VALUE"/><br/>
	 
	 <%--OGNL访问静态方法 @全类名@静态方法名 struts2框架默认是禁用静态方法调用，可以配置开启--%>
	 <%-- struts.ognl.allowStaticMethodAccess=true --%>
	 <s:property value="@java.lang.Math@random()"/><br/>
	 
	 <%--OGNL操作map和list 使用s:radio的标签，创建list集合  {}相当于创建了list集合
	 	list属性中的取值是一个OGNL表达式
	 --%>
	 <s:radio name="gender" list="{'男','女'}"></s:radio><br/>
	 <%--使用s:radio创建一个map #{}创建一个map 1和0作为value给radio的value属性复制，男女作为作为key显示到页面--%>
	 <s:radio name="gender" list="#{'1':'男','0':'女'}"></s:radio>
	 
	 
	 
	 
</body>
</html>