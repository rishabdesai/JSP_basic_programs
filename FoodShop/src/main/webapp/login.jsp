<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication</title>
</head>
<body>
	<jsp:useBean id="lb" class="beans.LoginBean"/>		 <!-- default scope is page scope  -->
	<jsp:setProperty name="lb"  property="*" />			 <!--  use *, because name of html controls and field name are same -->
	${lb.authenticate()}  <!--  use of EL  -->
	<c:choose>
		<c:when test="${lb.customer != null}">
			<c:redirect url="categories.jsp"/>
		</c:when>
		<c:otherwise>
			Invalid email or password. <br/>
			<a href="index.jsp">Login Again</a>
		</c:otherwise>
	</c:choose>
</body>
</html>


