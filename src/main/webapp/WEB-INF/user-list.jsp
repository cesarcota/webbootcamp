<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 23/01/2018
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>User List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


</head>
<body>
<%@ include file="/WEB-INF/header.jsp" %>
<h2>List of Users</h2>

<table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Email</th>

    </tr>
    </thead>
    <tbody>
        <ul>
            <c:forEach var="user" items="${userList}">
                <tr><td>${user.username}</td> <td>${user.email}</td></tr>
            </c:forEach>
        </ul>
    </tbody>
</table>
</body>
</html>
