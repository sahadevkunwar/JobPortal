<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
	<form action="${pageContext.request.contextPath}/admin/category/update"
		method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			<center>
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" value="${category.catId}" name="catId" /></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><input type="text" value="${category.title}"name="title" /></td>
			</tr>
			<tr>
			<!--	<td>Description</td>
				<td><input type="text" value="${category.description}" name="description" /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><input type="text" value="${category.type}" name="type" /></td>
			</tr>-->
            <div class="form-group"> 
            <label>Parent Category:</label>
			<select name="type">
				<option value="0">Main Type</option>
				<c:forEach items="${categoryList}" var="category">
					<c:if test="${category.type eq 0 }">
						<option value="${category.catId}">${category.title }</option>
					</c:if>
				</c:forEach>
			</select>
			</div>

		</table>
		<input type="submit" value="Submit" />
		</center>
	</form>
</body>
</html>