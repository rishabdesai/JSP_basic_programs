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
String uname = request.getParameter("uname");
String result = uname.toUpperCase();
%>

<h1>You Entered </h1> <%= result%>
</body>
</html>