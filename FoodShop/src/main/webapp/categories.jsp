<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Categories</title>
</head>
<body>
	<jsp:useBean id="cb" class="beans.CategoryBean"/>
	
	${cb.fetchCategories()}
	
	<form method="post" action="items.jsp">
		<c:forEach var="cat" items="${cb.categories}">
			<input type="radio" name="category" value="${cat}"/> ${cat} <br/>
		</c:forEach>
		<input type="submit" value="Show Items"/>
		<a href="showcart.jsp">Show Cart</a>
		<!-- <a href="showcart2.jsp">Show Cart2</a> -->
	</form>
	<br/><br/>
	${param.message}. <br/>
	Number of items in cart ${scb.cart.size()}.
</body>
</html>

