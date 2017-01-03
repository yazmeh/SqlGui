<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="pack21.Queries" %>
<%@page import="pack2.Connector" %>
<%@page import="java.sql.SQLException" %>
<%@ taglib prefix="ex" uri="WEB-INF/dbtag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View All</title>
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
			<td id="opt"><a href="update.html">Update</a></td>
		</tr>
		<tr>
			<td id="opt"><a href="search.html">Search</a></td>
		</tr>
	</table>
</div >
<div id="main">
<h2>View All</h2>
		<ex:View/>
		<br>
		<br>
		<a href="menu.html"><input type="button" value="Back"></a>
</div>		
</body>
</html>