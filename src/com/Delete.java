package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Delete extends SimpleTagSupport {
	int id;
	boolean success;

	public void setSuccess(boolean success) {
		this.success = success;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		if(success)
		{
			out.println("<h3>Row Deleted with id "+id+"</h3>");
		}
		else
		{
			out.println("<h3>Id not found</h3>");
		}
		
	}
}
