<%--
  Created by IntelliJ IDEA.
  User: alser
  Date: 19.10.2020
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%
    if(session.getAttribute("username") == null) {
        response.sendRedirect("index.jsp");
    }
%>



</body>
</html>
