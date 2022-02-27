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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	response.setHeader("pragma", "no-cache");//HTTP 1.0
	response.setHeader("Expires", "0");//Proxies

	if (session.getAttribute("uname") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	Welcome ${uname}
	<a href="resouces.jsp">Resource here</a>
	
		<form action="logout" method="get">
		<input type="submit" value="logout">
	</form>
</body>
</html>