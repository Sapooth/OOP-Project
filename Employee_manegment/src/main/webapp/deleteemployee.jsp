<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone_no = request.getParameter("phone_no");
		String gender = request.getParameter("gender"); 
		String age = request.getParameter("age");
		String department = request.getParameter("department");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	%>
	
	<h1>Employee Profile Delete</h1>
	
		<form action="delete" method="post">
	 	Employee ID<input type="text" name="empid" value="<%= id%>" readonly><br>
		Name <input type="text" name="name" value="<%= name%>" readonly><br>
		Address <input type="text" name="address" value="<%= address%>" readonly><br>
		Phone No <input type="text" name="phone_no" value="<%= phone_no%>" readonly><br>
		Gender <input type="text" name="gender" value="<%= gender%>" readonly><br>
		Age <input type="text" name="age" value="<%= age%>" readonly><br>
		Department <input type="text" name="department" value="<%= department%>" readonly><br>
		User Name <input type="text" name="username" value="<%= username%>" readonly><br>
		Password <input type="password" name="password" value="<%= password%>" readonly><br>
		
		<input type="submit" name="submit" value="Delete My Data"><br>
		</form>




</body>
</html>