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
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Role</th>
			<th>Delete</th>
			<th>Edit</th>
			<th>View Social Details</th>
		</tr>
		<c:forEach items="${slist}" var="application">
			<tr>
				<td>${application.id}</td>
				<td>${application.name}</td>
				<td>${application.email}</td>
				<td>${application.password}</td>
				<td>${application.role}</td>

				<td><a href="delete?id=${ application.id}">Delete</a></td>
				<td><a href="edit?id=${ application.id}">Edit</a></td>
				<td><a href="viewpass?id=${ application.id}">View Detail</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>