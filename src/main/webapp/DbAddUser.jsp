<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DbSaveUserServlet" method="post">
	Name :  <input type="text" name="name"/><Br><br>
	MobileNum : <input type="text" name="mobile"/><Br><br> 
	Credits: <input type="text" name="credits"/><Br><br>

	<input type="submit" value="Save"/>
</form>
</body>
</html>