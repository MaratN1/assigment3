<%--
  Created by IntelliJ IDEA.
  User: alser
  Date: 19.10.2020
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action = "/LoginServlet" method="post">
    UserName: <input type = "text" name = "username">
    Password: <input type = "password" name = "password">
    <input type = "submit" value = "login">
</form>
</body>
</html>
