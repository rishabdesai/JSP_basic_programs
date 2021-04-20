<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%--Scriptlet: to write any logic per client request --%>
	<%
	out.println("hello world");
	%>
	<br/>
	<%
	Date date = new Date();
	out.println(date.toString());
	%>
	<br/>
	
	<%
	for (int i = 1; i <= 10; i++) {
		out.println(i);
	}
	%>
	<br/>
	
	<%-- Expression : that evaluates to some value --%>
	<%= new Date().toString() %>
	<br/>
	
	<%-- Declaration : to declare as field of a class --%>
	<%! int count =0; %>
	
	<%
		++count;
		out.println("count is : "+count);
	%>
	<br/>
	
	
	

</body>
</html>