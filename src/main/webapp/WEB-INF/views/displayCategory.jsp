	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>

</head>
<center>
<table  class="table table-bordered container">

		<th>S.N</th>
		<th>Category</th>
		<th>Edit</th>
		<th>Delete</th>
		<c:forEach items="${categoryList}" var="category">
			<tr>
			    <td>${category.catId}</td>
				<td>${category.title}</td>
				<td><a href="${pageContext.request.contextPath}/admin/category/edit/${category.catId}"><span class="glyphicon glyphicon-pencil"></span></a></td>
				
				<td><a href="${pageContext.request.contextPath}/admin/category/delete/${category.catId}"><span class="glyphicon glyphicon-trash"></span></a></td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>
