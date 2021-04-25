<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Items</title>
</head>
<body>
	<jsp:useBean id="ib" class="beans.ItemBean"/>
	<jsp:setProperty name="ib" property="*" />
	${ib.fetchItems()}
	
	<form method="post" action="addcart.jsp">
		<c:forEach var="i" items="${ib.items}">
			<input type="checkbox" name="item" value="${i.id}"/> ${i.name} <br/>
		</c:forEach>
		<input type="submit" value="Add Cart"/>
	</form>
</body>
</html>
