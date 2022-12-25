<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>

	<c:forEach var="emp" items="${empDetails}">
	
	<c:set var="id" value="${emp.id}"/>
	<c:set var="name" value="${emp.name}"/>
	<c:set var="address" value="${emp.address}"/>
	<c:set var="phone_no" value="${emp.phone_no}"/>
	<c:set var="gender" value="${emp.gender}"/>
	<c:set var="age" value="${emp.age}"/>
	<c:set var="department" value="${emp.department}"/>
	<c:set var="username" value="${emp.username}"/>
	<c:set var="password" value="${emp.password}"/>
	
	<tr>
		<td>Employee ID</td>
		<td>${emp.id}</td>
	</tr>
	<tr>
		<td>Employee Name</td>
		<td>${emp.name}</td>
	</tr>
	<tr>
		<td>Employee Address</td>
		<td>${emp.address}</td>
	</tr>
	<tr>
		<td>Employee Phone Number</td>
		<td>${emp.phone_no}</td>
	</tr>
	<tr>
		<td>Gender</td>
		<td>${emp.gender}</td>
	</tr>
	<tr>
		<td>Employee Age</td>
		<td>${emp.age}</td>
	</tr>
	<tr>
		<td>Employee Department</td>
		<td>${emp.department}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${emp.username}</td>
	</tr>
	<tr>
		<td>Password</td>
		<td>${emp.password}</td>
	</tr>
	
	
	</c:forEach>
	
	</table>
	
	<c:url value="updateemployee.jsp" var="empupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="phone_no" value="${phone_no }"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="age" value="${age}"/>
		<c:param name="department" value="${department }"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password }"/>
	</c:url>
	
	<a href="${empupdate}">
	<input type="button" name="update" value="Update My data">
	</a>
	
	<br>
	
	<c:url value="deleteemployee.jsp" var="empupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="phone_no" value="${phone_no }"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="age" value="${age}"/>
		<c:param name="department" value="${department }"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password }"/>
	</c:url>
	<a href="${empupdate}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	
</body>
</html>