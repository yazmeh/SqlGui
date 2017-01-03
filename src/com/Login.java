package com;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		response.setContentType("text/html");
		String usr = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		
		try {
			if(q.check(usr, pwd))
			{
				HttpSession session = request.getSession();
				RequestDispatcher rq = request.getRequestDispatcher("menu.html");
				rq.forward(request, response);
			}
			else
			{
				request.setAttribute("err",1);
				RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
				rq.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
