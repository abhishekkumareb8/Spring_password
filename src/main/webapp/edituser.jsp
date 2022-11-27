<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updateuser" modelAttribute="user">

		<form:label path="id">Id</form:label>
		<form:input path="id" readonly="true" />
		<br>
		<br>
		
		<form:label path="role">Role</form:label>
		<form:input path="role" readonly="true" />
		<br>
		<br>
		
		
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<br>
		<br>

		<form:label path="email">Email</form:label>
		<form:input path="email" />
		<br>
		<br>

		<form:label path="password">Password</form:label>
		<form:input path="password" />
		<br>
		<br>
		<br>
		<br>

		<input type="submit">
	</form:form>
</body>
</html>