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
<body>
	<form action="SaveInternServlet" method="post">
		FirstName: <input type="text" name="firstName" value="${firstNameValue}"/>
		<span class="error">${firstNameError }</span>
		<br><Br>
		
		Email : <input type="text" name="email"/><br><Br>
		
		Password : <input type="password" name="password"/><br><Br>
		
		Gender : Male<input type="radio" name="gender" value="male" ${genderValue=='male'?"checked":""} />
				 Female<input type="radio" name="gender" value="female"  ${genderValue=='female'?"checked":""}/>
				<span class="error">${genderError }</span>
				<br><Br>
		Language : 
				<select name="language">
					<option value="-1" >Please Select Language</option>
					<option value="java" >Java</option>
					<option value="js" >JS</option>
					<option value="ts" >TS</option>
				</select><span class="error">${languageError}</span>
				<br><Br>
		
		Hobby : 	Cricket<input type="checkbox" name="hobby" value="cricket"/>
				WhatsApp<input type="checkbox" name="hobby" value="WhatsApp"/>
				IG<input type="checkbox" name="hobby" value="IG"/>
				
				<span class="error">${hobbyError}</span>
				<br><Br>
				
				
		Address :<textarea rows="6" cols="18" name="address"></textarea> 
		<br><br> 
		
		<input type="submit" value="Add Intern"/>
		
	
	</form>
</body>
</html>