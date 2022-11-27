<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="updateapp" modelAttribute="application">

       <form:label path="id">ID</form:label>
		<form:input path="id" />
		<br>
		<br>

		<form:label path="appName">App Name</form:label>
		<form:input path="appName" />
		<br>
		<br>

		<form:label path="appUserName">App User Name</form:label>
		<form:input path="appUserName" />
		<br>
		<br>

		<form:label path="appEmail">App Email</form:label>
		<form:input path="appEmail" />
		<br>
		<br>

		<form:label path="appPass">App Password</form:label>
		<form:input path="appPass" />
		<br>
		<br>

		<input type="submit">
	</form:form>
</body>
</html>