<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Iterator使用</title>
</head>
<body>	
	<table width="500px" border="1" align="center">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
	<!-- s:iterator Struts2的迭代标签
		begin,end,step和jstl的forEach标签是一样的
		value属性： 要遍历的集合，是OGNL表达式
		var属性：若写了，把var的值作为key,把当前遍历的元素作为value，存到ActionContext这个大map里面
				若不写，把当前遍历的元素压入栈顶
		status属性：遍历时的一些计数信息
			int getIndex() 从0开始 
			int getCount()	从1开始
			boolean isFirst()
			boolean isOdd()
			boolean isEven() 是否偶数行
	 -->
	<s:iterator value="students" var="s" status="st">
		<tr>
			<td><s:property value="#st.index"/></td>
			<td><s:property value="#s.name"/></td>
			<td><s:property value="#s.age"/></td>
		</tr>
	</s:iterator>
	</table><br/>
	
	<table width="500px" border="1" align="center">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
	<s:iterator value="students" status="st">
		<tr>
			<td><s:property value="#st.index"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="age"/></td>
		</tr>
	</s:iterator>
	</table><br/>
	
	<!-- OGNL的投影：添加过滤条件   以下全了解
		a.“?#”：过滤所有符合条件的集合，如：users.{?#this.age > 19}   
  		b.“^#”：过滤第一个符合条件的元素，如：users.{^#this.age > 19}    
  		c.“$#”：过滤最后一个符合条件的元素，如：users.{$#this.age > 19}
	-->
	<table width="500px" border="1" align="center">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
	<s:iterator value="students.{?#this.age>24}" status="st">
		<tr>
			<td><s:property value="#st.index"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="age"/></td>
		</tr>
	</s:iterator>
	</table><br/>
	<%--OGNL的投影：指定输出内容 
  		students.{name}========{"name1","name2","name3"}
  	--%>
  	<table width="500px" border="1" align="center">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
	<s:iterator value="students.{name}" status="st">
		<tr>
			<td><s:property value="#st.index"/></td>
			<td><s:property /></td>
			<td><s:property /></td>
		</tr>
	</s:iterator>
	</table><br/>
	<s:debug/>
</body>
</html>