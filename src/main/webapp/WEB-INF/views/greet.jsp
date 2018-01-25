<%--
  Created by IntelliJ IDEA.
  User: xavi
  Date: 24/01/18
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>

<body>
<div>
    <h1>Welcome to Spring 4 and Servlet 3 Based Application</h1>
    ${greet}
    <br/>
    <a href="/gloses">Anar a veure les gloses</a>
    <br/>
    <a href="<c:url value="/gloses"/>">Gloses</a>
</div>
</body>
</html>
