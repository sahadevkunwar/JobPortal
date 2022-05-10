<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>

</head>
<body>
	  <form action="${pageContext.request.contextPath}/employeer/addJob" method="post">
	    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
  
  <div class="form-group">
    <label  >Title</label>
    <input type="text" class="form-control" name="title"   placeholder="title here">
  </div>
  
  
<div class="form-group">
<label>Job Category:</label>
 <select name="jobcategory">
 <c:forEach items="${itemlist}" var="item" >
  <option value="${item.title}">${item.title}</option>
   </c:forEach>
 </select>
</div>

   <div class="form-group">
    <label  >Level</label>
    <input type="text" class="form-control"  name="level"  placeholder="post level">
  </div>
  
   <div class="form-group">
    <label  >No of Vacancy</label>
    <input type="text" class="form-control"  name="noofvacancy"  placeholder="No of Vacancy">
  </div>
  
   </div>
   <div class="form-group">
    <label  >Employment Type</label>
    <input type="text" class="form-control" name="employmenttype" placeholder="Employment Type">
  </div>
  
   <div class="form-group">
    <label  >Job Location</label>
    <input type="text" class="form-control" name="joblocation" placeholder="job location">
  </div>
  
   <div class="form-group">
    <label  >Salary</label>
    <input type="text" class="form-control" name="salary"  placeholder="salary">
  </div>
  
   <div class="form-group">
    <label  >Deadline</label>
    <input type="text" class="form-control" name="deadline"  placeholder="deadline">
  </div>
  
   <div class="form-group">
    <label  >Experience Required</label>
    <input type="text" class="form-control" name="experiencerequired" placeholder="experience">
  </div>
  
  <div class="form-group">
  <label>Education Level:</label>
 <select class="form-control" name="educationlevel">
  <option value="slc">SLC</option>
  <option value="+2">+2</option>
  <option value="bachelor">Bachelor</option>
  <option value="master">Master</option>
</select>
  </div>
 
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Job Description</label>
    <textarea class="form-control" name="jobdescription" rows="5"></textarea>
  </div>
        <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">Post Job</button>
    </div>
</form>
</body>
</html>