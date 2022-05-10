	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>

</head>
<body>
	<form  class="form-group" action="${pageContext.request.contextPath}/employeer/displayjob"
		method="get">
	
	<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<table>
		 
			<tr>
				<td>Title</td>
				<td><input type="text" value="${joblist.title}" name="title" /></td>
			</tr>
			
			<tr>
				<td>Job Category</td>
				<td><input type="text"  value="${joblist.jobcategory}" name="jobcategory" /></td>
			</tr>
			<tr>
				<td>Level</td>
				<td><input type="text"  value="${joblist.level}" name="level" /></td>
			</tr>
			<tr>
				<td>No Of Vacancy</td>
				<td><input type="text"  value="${joblist.noofvacancy}" name="noofvacancy" /></td>
			</tr>
			<tr>
				<td>Employment Type</td>
				<td><input type="text"  value="${joblist.employmenttype}" name="employmenttype" /></td>
			</tr>
			<tr>
				<td>Job Location</td>
				<td><input type="text"  value="${joblist.joblocation}" name="joblocation" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text"  value="${joblist.salary}" name="salary" /></td>
			</tr>
			<tr>
				<td>Deadline</td>
				<td><input type="text"  value="${joblist.deadline}" name="deadline" /></td>
			</tr>
			<tr>
				<td>Education Level</td>
				<td><input type="text"  value="${joblist.educationlevel}" name="educationlevel" /></td>
			</tr>
			<tr>
				<td>Experience Required</td>
				<td><input type="text"  value="${joblist.experiencerequired}" name="experiencerequired" /></td>
			</tr>
				<tr>
				<td>Job Description</td>
				<td><input type="text"  value="${joblist.jobdescription}" name="jobdescription"  cols="40" 
       rows="5" style="width:500px; height:100px;" /></td>
			</tr>
           
		</table>
	</form>
</body>
</html>
