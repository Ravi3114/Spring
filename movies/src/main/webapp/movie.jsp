<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>MovieFirstPage</title>
</head>
<body>
<h1>Enter The Movie Name</h1>
<form:form method="post" modelAttribute="movieAdd" action="addmovie">
<form:label path="mName">MovieName</form:label>
<form:input path="mName" />
<input type="submit" value="SUBMIT"/>
</form:form>
</body>
</html>