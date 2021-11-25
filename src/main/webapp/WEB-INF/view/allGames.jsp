<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All games</title>
</head>
<body>
<h2>List of all games</h2>
<br>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <c:forEach var="emp" items="${allG}">
        <tr>
            <td>${emp.name}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>