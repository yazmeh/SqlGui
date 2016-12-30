<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			<td id="opt"><a href="delete.html">Delete</a></td>
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
	<h1>Insert </h1>
	<%
	if(request.getAttribute("err")!=null)
	{%>
		<h4>Fill empty fields</h4>	
	<% }
	else if((boolean)request.getAttribute("sus"))
		{%>
		<h3>Row Inserted of User <%=request.getAttribute("usr")%> with id <%=request.getAttribute("id")%> and Salary <%=request.getAttribute("sal")%></h3>
	<%} 
	else
	{%><h3>Entry Already Exists</h3>
	<%} %>	
	<form action="IServlet">
		<table id ="maint">
		<tr>
			<td>Id:</td><td><input type="text" name ="id"/></td>
		</tr>
		<tr>
		<td>Name :</td><td> <input type="text" name="name"/></td>
		</tr>
		<tr>
		<td>Salary :</td><td><input type="text" name="sal"></td>
		</tr>
		<tr>
		<td><input type="Submit" value="Insert" name="job" ></td><td><a href="menu.html"><input type="button" value="Back"></a></td>
		</tr>
		</table>
	</form>
</div>
</body>
</html>