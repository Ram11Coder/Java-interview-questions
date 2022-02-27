<%@page import="java.util.Scanner" errorPage="error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Home</title>
</head>
<body bgcolor="maroon">
	<%!int coef = 3;%>
	<%-- <%
		int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int k = num1 + num2;
	Scanner sc = new Scanner(System.in);
	sc.close();
	out.println("Result -> " + k);
	//	pageContext.setAttribute("Name", "Ram", PageContext.SESSION_SCOPE);
	//int val = 10 / 0;//Throw exception we need to mention whenevere exception go to error page
	%>

 --%>
	<%
		String url = "jdbc:mysql://localhost:3306/abc";
	String username = "root";
	String password = "Ram11cool";
	String sql = "select * from employee where id=10";
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection(url, username, password);
	Statement state = con.createStatement();
	ResultSet rs = state.executeQuery(sql);
	rs.next();
	%>

	Id :
	<%=rs.getString(1)%><br> Name :
	<%=rs.getString(2)%><br> Salary :
	<%=rs.getString(3)%><br> Dob :
	<%=rs.getString(4)%><br> Coeff number :
	<%=coef%>

	k is : ${k}
</body>
</html>