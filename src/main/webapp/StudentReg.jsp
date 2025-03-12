<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<h2>Student Registration</h2>
<form action="StudentRegServlet" method="post">
	FirstName: <input type="text" name="firstName"/><br><br> 
	LastName:<input type="text" name="lastName"/><br><br> 
	Email:<input type="text" name="email"/><br><br> 
	Password:<input type="password" name="password"/><br><br> 
	CollegeName:<input type="text" name="collegeName"/><br><br> 
	
	<input type="submit" value="Save Student">
	<br>
	${error}
</form>
</body>
</html>