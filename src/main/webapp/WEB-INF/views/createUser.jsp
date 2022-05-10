<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
    <form action="${pageContext.request.contextPath}/signup" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			
			
             <div class="form-group col-md-6">
				<tr>
					<td>First Name</td>
					<td><input type="text" class="form-control" name="firstName" /></td>
				</tr>
			</div>	
			 <div class="form-group col-md-6 ">
				<tr>
					<td>Last Name</td>
					<td><input type="text" class="form-control" name="lastName" /></td>
				</tr>
				</div>
			
			 <div class="form-group col-md-6">
				<tr>
					<td>Email</td>
					<td><input type="text" class="form-control" name="email" /></td>
				</tr>
			</div>	
			<div class="form-group col-md-6">
				<tr>
					<td>UserName</td>
					<td><input type="text" class="form-control" name="username" /></td>
				</tr>
				</div>
				<div class="form-group col-md-6">
					<tr>
					<td>Password</td>
					<td><input type="password" class="form-control" name="password" /></td>
				</tr>
				</div>
				<div class="form-group col-md-6">
				<tr>
					<td>Address</td>	
					<td><input type="text" class="form-control" name="address" /></td>
				</tr>
				</div>
				<div class="form-group col-md-6">
				<tr>
					<td>UserType</td>
					<td>
					<select name="userType" >
					<option value="job_seeker">Job Seeker</option>
					<option value="job_provider">Job Provider</option>
					<option value="admin">Administrator</option>
					</select>
					</td>
				</tr>
				</div>
				<div class="form-group col-md-6">
				<tr>
					<td>Contact No</td>
					<td><input type="text" class="form-control" name="contactNo" /></td>
				</tr>
				</div>
		     
		      <div class="form-group">
    <div class="col-sm-offset-2">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
			</form>
		
</body>
</html>