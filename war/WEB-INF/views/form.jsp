<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Add Employee</title>
	</head>
	<body>
		<h1>Add Employee</h1>
		<form:form modelAttribute="employee">
			<div>ID: <form:input path="id"/></div>
			<div>Name: <form:input path="name"/></div>
			<div><input type="submit" value="Submit"></input></div>
		</form:form>
	</body>
</html>
