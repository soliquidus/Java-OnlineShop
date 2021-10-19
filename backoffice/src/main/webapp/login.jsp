<%--
  Created by IntelliJ IDEA.
  User: soliq
  Date: 19/10/2021
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentification Admin</title>
</head>
<body>
<form action="login" method="post">
    <label>
        Login : <input type="text" name="login"/><br>
    </label>
    <label>
        Mot de passe : <input type="password" name="password"/><br>
    </label>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
