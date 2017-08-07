<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
<h2>${user.first_name}</h2>

<table>
	<tr>
		<th>id</th>
		<th>first name</th>
		<th>last name</th>
		<th>email</th>
	</tr>
	<tr>
		<td>${user.id}</td>
		<td>${user.id}</td>
		<td>${user.last_name}<td>
		<td>${user.email}</td>
	</tr>
	
	
</table>

</body>
</html>
