<%--
  User: Tibo Pfeifer
  Date: 19/10/2021
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter une oeuvre catalogue</title>
</head>
<body>
    <form action="add-work" method="post">
        <label>
            Titre : <input type="text" name="title" />
        </label><br>
        <label>
            Année de sortie : <input type="text" name="release" />
        </label><br>
        <label>
            Genre : <input type="text" name="genre" />
        </label><br>
        <label>
            Artiste principal  : <input type="text" name="artist" />
        </label><br>
        <label>
            Résumé : <input type="text" name="summary" />
        </label>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
