<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="ex" uri="WEB-INF/dbtag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
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
			<td id="opt"><a href="delete.html">Delete</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="search.html">Search</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="view.jsp">View All</a></td>
		</tr>
	</table>
</div >
<div id="main">
<h2>Update</h2>
<ex:Update detail="${requestScope.r}" success="${requestScope.sus}"/>
<form action="CServlet" name="myForm" onsubmit="return validateForm1()">
<table id ="maint">
		<tr>
			<td>Id:</td><td><input type="text" name ="id" placeholder="Enter Id"/></td>
		</tr>
		<tr>
		<td>Name :</td><td> <input type="text" name="name" placeholder="Enter Name"/></td>
		</tr>
		<tr>
		<td>Salary :</td><td><input type="text" name="sal" placeholder="Enter Salary"></td>
		</tr>
		<tr>
		<td><input type="Submit" value="Update" name="job" ></td><td><a href="menu.html"><input type="button" value="Back"></a></td>
		</tr>
		</table>
</form>
</div>
</body>
</html>