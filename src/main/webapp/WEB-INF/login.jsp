
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AC</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2>Please login</h2>

<form method="post" action="login">
    <p>username : <input type="text" name="username"></p>
    <p>password : <input type="password" name="password"></p>
    <p><input type="submit" value="Login"></p>
</form>

<h3>
    <c:if test="${authenticate == false}">
        sorry, you've inserted wrong username or password
    </c:if>
</h3>


</body>
</html>
