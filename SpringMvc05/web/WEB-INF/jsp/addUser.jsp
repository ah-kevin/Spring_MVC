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
  <form:errors path="*" cssStyle="color:red"/><hr>
  用户名:<input type="text" name="username" ><br>
  密码:<input type="password" name="password"><br>
  <input type="submit" value="注册"/>
</form:form>

</body>
</html>
