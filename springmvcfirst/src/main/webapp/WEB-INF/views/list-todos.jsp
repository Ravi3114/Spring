<%@ taglib uri=http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list-todos</title>
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<table class="table table-striped">
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
<div>
<a class="btn btn-sucess" href="/add-todo">Add</a>
</div>
<script src="webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</div>
</body>
</html>