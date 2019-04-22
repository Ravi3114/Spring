<%@ taglib uri=http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list-todos</title>
</head>
<body>
<table>
<caption>Your Todos are</caption>
<thead>
<tr>
<th>Description></th>
<th>TargetDate</th>
<th>Is completed</th>
</tr>

</thead>

<tbody>
<c:forEach items= "${todos}" var="todo">
 <br>
<tr>
<td>${todo.desc}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
</tr>
</c:forEach>
</tbody>

</table>

<a class="button" href="/add-todo">Add</a>
</body>
</html>