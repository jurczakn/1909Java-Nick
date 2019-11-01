<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${ errorMessage !=null}">
		<strong> Oh NO!!!!!</strong> <c:out value="${ errorMessage }"></c:out>
	</c:if>

	<h2>Please log in: </h2>
	<br>
	<form action="login" method="post">
		<input type="text" name="username" placeholder="username"/>
		<br>
		<input type="password" name="password" placeholder="password"/>
		<br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>