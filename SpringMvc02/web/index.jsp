<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form:form commandName="user" action="login3.from" method="post">
    <form:errors path="*"/>
    用户名:<input type="text" name="name"><br/>
    密码:<input type="password" name="ps" />
    <input type="submit" value="提交"/>
  </form:form>

  </body>
</html>
