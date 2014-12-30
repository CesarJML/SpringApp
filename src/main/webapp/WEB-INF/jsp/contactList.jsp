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
		<t:forEach items="${result}" var="contact">
			<tr>
				<td>ID: <t:out value="${contact.id}" /></td>
				<td>First Name: <t:out value="${contact.firstName}" /></td>
				<td>Last Name: <t:out value="${contact.lastName}" /></td>
			</tr>
		</t:forEach>
	</table>
</body>
</html>