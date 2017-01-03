package com;
import java.io.IOException;
import java.nio.channels.NetworkChannel;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import pack2.Connector;
import pack21.Queries;

public class PrintTable extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		try {
		JspWriter out = getJspContext().getOut();
		Queries q= new Queries();
		new Connector();
		
			String dat[][]=q.viewAll();
			out.println("<table id=\"result\"><tr><th>Id</th><th>Name</th><th>Salary</th><tr>");
			for(int i=0;i<dat.length;i++)
			{
				out.println("<tr>");
				out.println("<td>"+dat[i][0]+"</td>");
				out.println("<td>"+dat[i][1]+"</td>");
				out.println("<td>"+dat[i][2]+"</td>");
				out.println("<td><input type=\"Submit\"   name=\"sub\" value=\"Delete\" /></td>");
				out.println("</	tr>");
			
			}
			out.println("</table>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
