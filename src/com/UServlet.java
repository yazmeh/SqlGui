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
 * Servlet implementation class UServlet
 */
@WebServlet("/UServlet")
public class UServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queries q = new Queries();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		String nm= request.getParameter("name");
		float sal = Float.parseFloat(request.getParameter("sal"));
		try {
			request.setAttribute("sus", false);
			boolean x = q.updateAll(id, nm, sal);
			request.setAttribute("sus", x);
			if(x)
			{	
				String dat[] = new String[3];
				dat[0]=""+id;
				dat[1]=nm;
				dat[2]=""+sal;
				request.setAttribute("r", dat);
			}
			RequestDispatcher rd = request.getRequestDispatcher("updatet.jsp");
			rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
