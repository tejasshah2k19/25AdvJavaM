<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<form action="CalculatePercentageServlet" method="post">
		StudentName: <input type="text" name="studentName" /><br><br>
		Maths:<input type="text" name="maths"/><br><br>
		Sci:<input type="text" name="sci"/><br><br>
		Eng: <input type="text" name="eng"/><br><br>
		
		<input type="submit" value="Calculate Percentage"/>
	
	</form>

</body>
</html>