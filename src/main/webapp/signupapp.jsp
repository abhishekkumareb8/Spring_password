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
	<form:form action="saveapp" modelAttribute="application">
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