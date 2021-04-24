<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>using JSP EL</title>
</head>
<body>

	<%--EL(Expression Language) = to reduce scriplets from JSP page
	- EL can be use to evaluate math expression, access object from different scopes 
	(PageScope, requestScope, sessionScope, applicationScope)
	- to invoke getter methos to access fields
	- EL implicit objects to access values from the special implicit variables(objects)
	--%>

	<h4> ${initParam.EL_header}</h4>

	<jsp:useBean id="cb" class="pages.CapitalBean" />
	<jsp:setProperty name="cb" property="uname" param="uname" />

	${cb.convert()}
	Result Name: ${cb.result}

</body>
</html>