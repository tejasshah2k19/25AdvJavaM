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
		
		Email : <input type="text" name="email" value="${emailValue}"/>${emailError}<br><Br>
		
		Password : <input type="password" name="password"/><br><Br>
		
		Gender : Male<input type="radio" name="gender" value="male" ${genderValue=='male'?"checked":""} />
				 Female<input type="radio" name="gender" value="female"  ${genderValue=='female'?"checked":""}/>
				<span class="error">${genderError }</span>
				<br><Br>
		Language : 
				<select name="language">
					<option value="-1" >Please Select Language</option>
					<option value="java" ${languageValue=='java'?"selected":""}>Java</option>
					<option value="js"  ${languageValue=='js'?"selected":""}>JS</option>
					<option value="ts" ${languageValue=='ts'?"selected":""} >TS</option>
				</select><span class="error">${languageError}</span>
				<br><Br>
		
		Hobby : 	Cricket<input type="checkbox" name="hobby" value="cricket" ${hobbyValue.contains("cricket")?"checked":""}  />
				WhatsApp<input type="checkbox" name="hobby" value="WhatsApp"  ${hobbyValue.contains("WhatsApp")?"checked":""}/>
				IG<input type="checkbox" name="hobby" value="IG" ${hobbyValue.contains("IG")?"checked":""}/>
				
				<span class="error">${hobbyError}</span>
				<br><Br>
				
				
		Address :<textarea rows="6" cols="18" name="address"></textarea> 
		<br><br> 
		
		<input type="submit" value="Add Intern"/>
		
	
	</form>
</body>
</html>