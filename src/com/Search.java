package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Search extends SimpleTagSupport{
	String[] detail;
	boolean success;

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String[] getDetail() {
		return detail;
	}

	public void setDetail(String[] detail) {
		this.detail = detail;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		if(success)
		{
			String[] det = getDetail();
			out.println("<table id=\"result\">");
			out.println("<tr>");
			out.println("<th>ID</th><th>Name</th><th>Salary</th>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>" +det[0]+"</td><td>"+det[1]+"</td><td>"+det[2]+"</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		else
		{
			out.println("<h3>Id not found<h3>");
		}
		
	}
}
