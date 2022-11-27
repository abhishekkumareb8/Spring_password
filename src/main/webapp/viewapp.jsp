<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
		<tr>
			<th>ID</th>
			<th>appName</th>
			<th>Username</th>\
			<th>Email</th>
			<th>Password</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${appget}" var="application">
			<tr>
				<td>${application.id}</td>
				<td>${application.appName}</td>
				<td>${application.appUserName}</td>
				<td>${application.appEmail}</td>
				<td>${application.appPass}</td>

				<td><a href="delete?id=${ application.id}">Delete</a></td>
				<td><a href="edit?id=${ application.id}">Edit</a></td>
				<td><a href="viewpass?id=${ application.id}">View Detail</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>