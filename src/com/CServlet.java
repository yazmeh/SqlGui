package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack2.Connector;

/**
 * Servlet implementation class CServlet
 */
@WebServlet("/CServlet")
public class CServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		new Connector();
		String ch = request.getParameter("job");
		if(ch.equals("Insert"))
		{
			rd=request.getRequestDispatcher("insert.html");
			rd.forward(request, response);
		}
		else if(ch.equals("Delete"))
		{
			rd=request.getRequestDispatcher("delete.html");
			rd.forward(request, response);
		}
		else if(ch.equals("Update"))
		{
			rd=request.getRequestDispatcher("update.html");
			rd.forward(request, response);
		}
		else if(ch.equals("Search"))
		{
			rd=request.getRequestDispatcher("search.html");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("view.jsp");
			rd.forward(request, response);
		}
	}


}
