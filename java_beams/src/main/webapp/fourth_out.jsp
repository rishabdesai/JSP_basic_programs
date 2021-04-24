<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>using JSP beans</title>
</head>
<body>

<%--useBean is standard action to use javaBen into JSP page 
-It find the bean with given name in given scope and access it. If not found, it creates
-bean object and add into given scope.
-If no scope is provided then it is in default scope (page scope)
- property = bean field name
- param = request parameter (html control) name
--%>
 
<jsp:useBean id="cb" class="pages.CapitalBean" />
<jsp:setProperty name="cb"  property="uname" param="uname"/>

<%
cb.convert();
%>

Result is : <jsp:getProperty name="cb" property="result" />

</body>
</html>