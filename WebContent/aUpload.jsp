<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts2中的多文件上传</title>
</head>
<body>
	<%--
		文件上传的必要前提
			1 请求方式必须是post
			2 enctype属性的取值必须是multipart/form-data
			3 提供一个文件选择域
	 --%>
	 <s:fielderror/>
	 <s:form action="upload2.action" enctype="multipart/form-data">
	 	<s:textfield name="username" label="用户名"/>
	 	<s:file name="photo" label="照片"></s:file>
	 	<s:file name="photo" label="照片"></s:file>
	 	<s:submit value="上传"></s:submit>
	 </s:form>
</body>
</html>