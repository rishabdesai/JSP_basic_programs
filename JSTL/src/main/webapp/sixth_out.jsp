<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
<div>
	Entered Number : ${param.num }
</div>

<c:choose>
		<c:when test="${param.num mod 2 == 0}">
			Even Number
		</c:when>
		<c:otherwise>
			Odd Number
		</c:otherwise>
	</c:choose>	

</body>
</html>