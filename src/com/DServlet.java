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

import pack21.Queries;

/**
 * Servlet implementation class DServlet
 */
@WebServlet("/DServlet")
public class DServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Queries q = new Queries();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("sus",false);
		request.setAttribute("id", 0);
		try {
			boolean x = q.delete(id);
			request.setAttribute("sus",x);
			if(x)
			{
				request.setAttribute("id", id);
			}
			RequestDispatcher rd = request.getRequestDispatcher("deletet.jsp");
			rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
