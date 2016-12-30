package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack2.Connector;
import pack21.Queries;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		new Connector(); 
		Queries q =new Queries();
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		String usr = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		
		try {
			if(q.check(usr, pwd))
			{
				RequestDispatcher rq = request.getRequestDispatcher("menu.html");
				rq.forward(request, response);
			}
			else
			{
				out.println("<h4>Login Failed.Try Again</h4>");
				RequestDispatcher rq = request.getRequestDispatcher("Index.html");
				rq.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
