<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add game</title>
</head>
<body>
<h2>Please enter name of game</h2>
<br>
<form:form action="saveGame" modelAttribute="game">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
