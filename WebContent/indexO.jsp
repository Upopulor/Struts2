<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>Struts2 first 1</title>
  </head>
  
  <body>
    <%-- Servlet1/serviceServlet?op=mm --%>
    <%-- 在Servlet2中，控制器会默认拦截拓展名为.action的请求 除此之外，什么都不写也可以--%>
    <a href="${pageContext.request.contextPath }/hello.action">访问Struts2的first</a>
    <a href="${pageContext.request.contextPath }/hello">访问Struts2的first无action</a><br/>
    <a href="${pageContext.request.contextPath }/action1">action</a><br/>
    <a href="${pageContext.request.contextPath }/action4">action4第三种方法</a><br/>
    <%--通配符 --%>
    <a href="${pageContext.request.contextPath}/add_User.action" >添加用户</a>
   	<a href="${pageContext.request.contextPath}/update_User.action" >更新用户</a>
   	<a href="${pageContext.request.contextPath}/delete_User.action" >删除用户</a>
   	<a href="${pageContext.request.contextPath}/find_User.action" >查询用户</a><br/>
   	
   	<%--动态方法调用 
   		动作名称！动作方法名称.action
   		动作名称！动作方法名称
   	--%>
   	<a href="${pageContext.request.contextPath}/user!addUser.action" >添加用户2</a>
   	<a href="${pageContext.request.contextPath}/user!updateUser.action" >更新用户2</a>
   	<a href="${pageContext.request.contextPath}/user!deleteUser.action" >删除用户2</a>
   	<a href="${pageContext.request.contextPath}/user!findUser.action" >查询用户2</a><br/>
   	
   	<a href="${pageContext.request.contextPath}/result.action" >Result2</a><br/>
   	<a href="${pageContext.request.contextPath}/result2.action" >Result2同包下</a><br/>
   	<a href="${pageContext.request.contextPath}//q1/result3.action" >Result3不同包下</a><br/>
   	
  </body>
</html>
