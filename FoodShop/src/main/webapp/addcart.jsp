<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Cart</title>
</head>
<body>
	<jsp:useBean id="scb" class="beans.CartBean" scope="session"/>
	<jsp:setProperty name="scb" property="itemIds" param="item" />
	${scb.addToCart()}
	<jsp:forward page="categories.jsp">
		<jsp:param name="message" value="${scb.newItemCount} New Items Added."/>
	</jsp:forward>
</body>
</html>
