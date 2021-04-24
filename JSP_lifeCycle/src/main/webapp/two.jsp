<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second Page</title>
</head>
<body>

<%
	Date d = new Date();
	out.println("<h4>Current Time : "+ d +"</h4>");
%>
<%	count++; %>


<%!
	private int count = 0;
	public void jspInit() {
		System.out.println("jspInit() is called.");
	}
	public void jspDestroy() {
		System.out.println("jspDestroy() is called.");
	}
	public int square(int n) {
		return n * n;
	}
%>

<% if(count % 2 == 0) { %>
	<h3>Even Count : <%= count %></h3>
<% } else { %>
	<h3>Odd Count : <%= count %></h3>
<% } %>

<h4>Square of Number is <%= square(count) %></h4>

<!-- Client side comment. Visible in view source. -->

<%-- Server side comment. Not visible in view source. --%>