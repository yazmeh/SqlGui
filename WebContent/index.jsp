<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="validate.js"></script>
</head>
<body>

<div id="im">
	<img alt="hitman" src="img/minions_header.jpg">
</div>
<div id="main">
<h1>Welcome to SqlGui Home page</h1>
<form action="Login" method="post" name="myForm" onsubmit="return validateForm2()" >
<h2>Login</h2>
<%
	if(request.getAttribute("err")!=null)
	{
		int x=Integer.parseInt(request.getAttribute("err").toString());
		if(x==1)
		{%>
		<h4>Login Failed.Try Again</h4>	
		<%}
		else if(x==2)
		{%>
		<h4>First Login Here</h4>	
		<% }
		else
			{}
	}	%>
<table id="maint">
	<tr>
		<td>User</td><td><input type="text" name="userName" placeholder="Enter Username"/></td>
	</tr>
	<tr>
		<td>Password</td><td><input type ="password" name="pwd" placeholder="Enter Password"></td>
	</tr>
	<tr>
		<td><input type="submit" name="task" value="Login"/></td><td></td>
	</tr>	
</table>
</form>

</div>
</body>
</html>