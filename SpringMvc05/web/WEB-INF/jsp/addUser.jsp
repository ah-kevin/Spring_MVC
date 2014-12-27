<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/27
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form commandName="user" action="add.from" method="post">
  用户名:
  <form:input path="username"/>
  <form:errors path="username" cssStyle="color:red"/><br>
  密码:<form:password path="password" showPassword="true"/>
  <form:errors path="password" cssStyle="color:red"/><br>
  电话号码:
  <form:input path="telephone"/>
  <form:errors path="telephone" cssStyle="color:red"/><br>
  <input type="submit" value="注册"/>
</form:form>

</body>
</html>
