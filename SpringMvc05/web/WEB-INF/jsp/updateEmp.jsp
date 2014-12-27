<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/27
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form commandName="emp">
  员工名:<form:input path="name"/><br>
  年龄:<form:input path="age"/><br>
  性别:<form:radiobutton path="sex" value="M" label="男"/>
    <form:radiobutton path="sex" value="F" label="女"/>
  <br>
  最喜爱的城市:
  <form:radiobuttons path="city" items="${cityMap}"/><br>
  最喜欢的城市:
  <form:select path="city" items="${cityMap}">
  </form:select>
  最喜欢的运动:
  <form:select path="favor">
    <form:option value="1">爬山</form:option>
    <form:option value="2">下水</form:option>
    <form:option value="3">上天</form:option>
  </form:select>
  <br>
  最喜欢的食物:
  <form:checkbox path="foods" value="a" label="香蕉"/>
  <form:checkbox path="foods" value="b" label="苹果"/>
  <form:checkbox path="foods" value="c" label="橘子"/><br>

  简介:<form:textarea path="descr"/><br>
</form:form>
</body>
</html>
