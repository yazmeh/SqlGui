package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack2.Connector;
import pack21.Queries;

/**
 * Servlet implementation class VServlet
 */
@WebServlet("/VServlet")
public class VServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queries q = new Queries();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		new Connector();
		try {
			String[][] an = q.viewAll();
			out.println("<table><tr><th>Id</th><th>Name</th><th>Salary</th><tr>");
			for(int i=0;i<an.length;i++)
				out.println("<tr><td>"+an[i][0]+"</td><td>"+an[i][1]+"</td><td>"+an[i][2]+"</td><tr>");
			out.println("</table>");
			out.println("<a href=\"menu.html\"><input type=\"button\" value=\"Back\"></a>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}


}
