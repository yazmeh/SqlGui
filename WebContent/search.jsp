<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="validate.js"></script>
</head>
<body>
<div id="im">
	<img alt="hitman" src="img/minions_header.jpg">
</div>
<div id="sidebar">
	<table id="menu">
		<tr>
			<td id="opt"><a href="menu.html">Home</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="insert.html">Insert</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="update.html">Update</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="delete.html">Delete</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="view.jsp">View All</a></td>
		</tr>
	</table>
</div >
<body>
<div id="main">
<h1>Search </h1>

<form action="CServlet" name="myForm" onsubmit="return validateId()">
<table id="maint">
	<tr>
		<td>Id : </td>
		<td><input type="text" name ="id" placeholder="Enter Id" /></td>
		<td><input type="Submit" value="Search" name="job"></td>
		<td><a href="menu.html"><input type="button" value="Back"></a></td>
	</tr>
</table>
</form>
<%if((boolean)request.getAttribute("sus"))
		{
		String[] an = (String[])request.getAttribute("r");%>
		<table id="result">
			<tr>
				<th>ID</th><th>Name</th><th>Salary</th>
			</tr>
			<tr>
				<td><%=an[0]%></td><td><%=an[1]%></td><td><%=an[2]%></td>
			</tr>
			
		</table>
	<%} 
	else
	{%>
		<h3>Id does not Exists</h3>
	<% } %>	
</div>
</body>
</html>