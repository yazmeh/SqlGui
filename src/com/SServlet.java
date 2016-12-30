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
 * Servlet implementation class SServlet
 */
@WebServlet("/SServlet")
public class SServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queries q = new Queries();
		String[] an=null;
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			an = q.search(id);
			request.setAttribute("sus",an!=null);
			if(an!=null)
			{
				request.setAttribute("r",an);
			}
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
