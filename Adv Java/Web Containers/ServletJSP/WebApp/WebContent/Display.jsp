<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${k}
	<br>
	<%-- <f:import url="https://www.google.com"></f:import> --%>

	<f:forEach items="${Students}" var="s">
	${s.name}<br>
	</f:forEach>
	<%-- Database query
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/abc" user="root" password="Ram11cool" />
	<sql:query var="res" dataSource="${db}"> select * from employee</sql:query>
	<f:forEach items="${res.rows}" var="r">
		<br>
		<f:out value="${r.id}"></f:out> :<f:out value="${r.name}"></f:out> :<f:out
			value="${r.salary}"></f:out> :<f:out value="${r.dob}"></f:out>
	</f:forEach>
 --%>

	Function Tags:
	<br>
	<f:set var="str" value="This is thulasi"></f:set>
	Str length : ${fn:length(str)}

	<f:forEach items="${fn:split(str,' ') }" var="s">
		<br>
 ${s}
 </f:forEach>
 <br>
	<f:if test="${fn:contains(str,'is') }">
 correct
 </f:if>
</body>
</html>