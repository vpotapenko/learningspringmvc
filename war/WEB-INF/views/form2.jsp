<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head>
		<title>Add Employee</title>
	</head>
	<body>
		<h1>Add Employee</h1>


		<form:form modelAttribute="employee" action="form2Post">

            <form:errors path="*">
                <div><spring:message text="some errors detected"/></div>
            </form:errors>

			<div>ID: <form:input path="id"/></div>
			<div>Name: <form:input path="name"/></div>
            <div><form:errors path="name" /></div>
			<div><input type="submit" value="Submit"></div>
		</form:form>
	</body>
</html>
