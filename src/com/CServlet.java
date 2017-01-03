package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pack2.Connector;

/**
 * Servlet implementation class CServlet
 */
@WebServlet("/CServlet")
public class CServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession(false);
		RequestDispatcher rd;
		if(session!=null)
		{	
			System.out.println("in");
			new Connector();
			String ch = request.getParameter("job");
			if(ch==null)
			{
				rd=request.getRequestDispatcher("view.jsp");
				rd.forward(request, response);
			}
			if(ch.equals("Insert"))
			{
				rd=request.getRequestDispatcher("IServlet");
				rd.forward(request, response);
			}
			else if(ch.equals("Delete"))
			{
				rd=request.getRequestDispatcher("DServlet");
				rd.forward(request, response);
			}
			else if(ch.equals("Update"))
			{
				rd=request.getRequestDispatcher("UServlet");
				rd.forward(request, response);
			}
			else if(ch.equals("Search"))
			{
				rd=request.getRequestDispatcher("SServlet");
				rd.forward(request, response);
			}
			else
			{
				rd=request.getRequestDispatcher("view.jsp");
				rd.forward(request, response);
			}
		}
		else
		{
			request.setAttribute("err", 2);
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}


}
