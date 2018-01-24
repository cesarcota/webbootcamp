

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AC</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">\
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">

</head>

<div id="fullscreen_bg" class="fullscreen_bg"/>

<div class="container">

    <form class="form-signin" method="post" action="login">
        <h1 class="form-signin-heading text-muted">Sign In</h1>
        <input type="text" class="form-control" name="username" placeholder="username" required="" autofocus="">
        <input type="password" class="form-control" name="password" placeholder="password" required="">
        <button class="btn btn-lg btn-primary btn-block" type="submit">
            Sign In
        </button>
    </form>

</div>

</body>
</html>