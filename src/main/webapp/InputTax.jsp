<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

	.error{
		color: red;
	}
</style>
</head>
<body >

	<form action="CalculateTaxServlet" method="post"> 
		FirstName :  <input type="text" name="firstName" value="${firstNameValue}"/>
		
		<span class="error">${firstNameError}</span><br><Br>
		LastName :  <input type="text" name="lastName" value="${lastNameValue}"/>
		<span class="error">${lastNameError}</span><br><Br>
		
		TotalIncome : <input type="text" name="totalIncome" value="${incomeValue}"/><span class="error">${totalIncomeError}</span><br><Br>
		
		<input type="submit" value="CalculateTaxServlet"/>
	</form>
</body>
</html>