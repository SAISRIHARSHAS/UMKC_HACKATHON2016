<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.servlet.bean.Member" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Investment Plan</title>
</head>
<body>
<div id ="header">
<%@ include file = "header.jsp" %></div>
<form name = "investmentresult" action = "InvestmentPlanController" method = "post">
<center>
<%Member stud = (Member)request.getAttribute("stud"); %>
<%--<table border = 2>
<tr>
<td>Investment Premium</td>
<tr>
<td><%=stud.getPremiumPerMonth() %></td> 
<td>100</td>
</tr>
</table> --%>
 <%@include  file="output.html" %> 
<a href="Home.jsp">Click here</a>To go to home page
</center>
</form>
</body>
</html>