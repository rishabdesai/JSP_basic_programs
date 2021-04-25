<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Cart</title>
</head>
<body>
	<jsp:useBean id="fb" class="beans.FoodBean"/>
	<c:set var="total" value="0.0"/>
	<table border="1">
		<thead style="background-color: gray;">
			<tr>
				<td>Id</td>
				<td>Item</td>
				<td>Category</td>
				<td>Price</td>
			</tr>
		</thead>
	<c:forEach var="id" items="${scb.cart}">
		<jsp:setProperty name="fb" property="id" value="${id}"/>
		${fb.fetchItem()}
		<c:set var="total" value="${total + fb.item.price}"/>
		<tr>
			<td>${id}</td>
			<td>${fb.item.name}</td>
			<td>${fb.item.category}</td>
			<td>${fb.item.price}</td>
		</tr>
	</c:forEach>
	</table>	
	<br/><br/>
	Total Bill: Rs. ${total}/-
	<br/><br/>
	<a href="logout.jsp">Sign Out</a>
</body>
</html>



