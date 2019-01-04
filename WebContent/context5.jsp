<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts2中的一些其他标签</title>
</head>
<body>	
	<br/>------s:set---------<br/>
	<%--s:set标签 
		value属性，取值是一个OGNL表达式
		var属性：是一个普通的字符串 
		把value属性的值作为value，把var属性的值作为key，存到ActionContext大map中
	--%>
	<s:set value="'test'" var="str1"></s:set>
	<br/>------s:action---------<br/>
	<%--s:action标签 
		name属性是指定一个action动作名称它并不会真的去执行
		executeResult属性：是否执行action 取值true false 是动态包含
	--%>
	<s:action name="context1" executeResult="true"/>
	<br/>------s:if s:ifelse s:else---------<br/>
	<s:set value="'D'" var="grade"/>
	<s:if test="#grade=='D'">差</s:if>
	<s:elseif test="#grade=='C'">中</s:elseif>
	<s:else>其他</s:else>
	<br/>------s:url---------<br/>
	<%--s:url标签
		value属性：是把值直接输出到页面上
		action属性：是把动作的请求地址输出到页面上 ${pageContext.request.contextPath}/context1
	 	var属性：把action的取值作为value，把var的取值作为key，放到ActionContext中
	 	注意：它会自动根据struts配置，来转换后缀名。
	 --%>
	<s:url value="context1"/>
	<s:url action="context1" var="url">
		<%--把name作为key，把value作为值，绑定到请求连接地址后面。相当于get方式拼接请求参数 
  			注意：
  				name的取值就是一个普通的字符串
  				value的取值是一个OGNL表达式，要想转成字符串请使用''
  		--%>
  		<s:param name="name" value="'skt'"></s:param>
  	</s:url>
	<a href="${pageContext.request.contextPath}/context1">来吧 page context</a><br/>
	<a href="<s:property value='#url'/>">点击</a>
	<s:debug/>
</body>
</html>