<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Investment Plan</title>
</head>
<body>
<body>
<div id ="header">
<%@ include file = "header.jsp" %></div>
<form name = "investmentPlan" action = "InvestmentPlanController" method = "post">
<center>
 <%@include  file="index.html" %> 
<input type="hidden" name="action" value="updating"></input>
<%--<input type="submit" value="Get the InvestmentPlan"></input></br>--%>
<a href="Home.jsp">Click here</a>To go to home page
</center>
</form>
</body>
</body>
</html>
