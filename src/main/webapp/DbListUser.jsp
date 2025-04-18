<%@page import="com.google.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<h2>List User</h2>

	<%
	ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>


<table class="table table-striped table-bordered table-hover mt-3">
  	<thead class="table-dark">
		<tr>
			<th>Name</th>
			<th>Mobile</th>
			<th>Credits</th>
		</tr>
	</thead>		
	<tbody> 
		<%
		for (UserBean u : users) {
		%>
		<tr>
			<td><%=u.getName()%></td>
			<td><%=u.getMobile()%></td>
			<td><%=u.getCredits() %></td>
		</tr>

		<%
		}
		%>
	</tbody>
	</table>


</body>
</html>