<%--
  User: Jianan
  Date: 11/2/15
  Time: 22:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
  <form method="post" action="/login">
    username:<input name="username" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="submit">
  </form>
</body>
</html>
