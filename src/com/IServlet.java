package com;


import java.io.IOException;	
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack21.Queries;

/**
 * Servlet implementation class IServlet
 */
@WebServlet("/IServlet")
public class IServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queries q = new Queries();
		response.setContentType("text/html");
			String ids = request.getParameter("id");
			String nm= request.getParameter("name");
			String sals =request.getParameter("sal");
			try { 
				
				request.setAttribute("sus", false);
				int id =Integer.parseInt(ids);
				float sal = Float.parseFloat(sals);
				boolean x = q.insert(id, nm, sal);
				request.setAttribute("sus", x);
				if(x)
				{	
					String dat[] = new String[3];
					dat[0]=""+id;
					dat[1]=nm;
					dat[2]=""+sal;
					request.setAttribute("r", dat);
				}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("insertt.jsp");
			rd.forward(request, response);
		
	}

	

}
