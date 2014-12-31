<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>First name</th>
			<th>Last name</th>
		</tr>
		<t:forEach items="${result}" var="contact">
			<tr>
				<td><t:out value="${contact.id}" /></td>
				<td><t:out value="${contact.firstName}" /></td>
				<td><t:out value="${contact.lastName}" /></td>
			</tr>
		</t:forEach>
	</table>
</body>
</html>