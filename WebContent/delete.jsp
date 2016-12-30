<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
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
			<td id="opt"><a href="search.html">Search</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="view.jsp">View All</a></td>
		</tr>
	</table>
</div >
<div id="main">
<h1>Delete </h1>
<%if((boolean)request.getAttribute("sus"))
		{%>
		<h3>Row Deleted of with id <%=request.getAttribute("id")%></h3>
	<%} 
	else
	{%><h3>Id Not Found</h3>
	<%} %>	
<form action="DServlet">
<table id="maint">
	<tr>
		<td>Id : </td>
		<td><input type="text" name ="id"/></td>
		<td><input type="Submit" value="Delete" name="job"></td>
		<td><a href="menu.html"><input type="button" value="Back"></a></td>
	</tr>
</table>
</form>
</div>
</body>
</html>