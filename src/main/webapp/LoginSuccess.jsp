<%--
  Created by IntelliJ IDEA.
  User: Shewale
  Date: 08-12-2021
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html";charset="US-ASCII">
    <title>Login Success page</title>
</head>
<body>
<h3>Hi <%=request.getAttribute("user")%>,Login Successful.</h3>
<a href="login.html">Login page</a>
</body>
</html>
