package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	String name,gender =null;
	int age=0;
	String tage=null;
	boolean status=false;
	PrintWriter pw=null;
	
	
	//general setting
	pw=res.getWriter();
	res.setContentType("text/html");
	
	//read form data
	name=req.getParameter("pname");
	age=Integer.parseInt(req.getParameter("page"));
	gender=req.getParameter("gen");
	
	//server side form validation logic
	if(name==null||name.equals("")||name.length()==0) {
		pw.println("<b style='color:red'>Person name is required</b>");
		return;
	}//1 if
	
	if(tage==null||tage.equals("")||tage.length()==0) {
	pw.println("<b style='color:red'>Person name is required</b>");
	return;
	}
	else {
		try{
		age=Integer.parseInt(tage);
		if(age<=0||age>125) {
			pw.println("<b style='color:red'>Person age must be there in the</b>");
		}
		}
	catch(NumberFormatException nfe) {
		pw.println("<b style='color:red'>Person age must be numeric value</b>");
		return;
	}
	}
	
	
	
	//writer the b.logic
	if(gender.equalsIgnoreCase("M")) 
		status=age>=21?true:false;
	else
		status=age>=18?true:false;
	if(status)
		pw.println("<h1 style='color:red'> Mr/Miss..."+name+" U R eligible to marry but think twice");
	else
		pw.println("<h1 style='color:green'>Mr/Miss..."+name+" U R not eligible to marry enjoy life");	
	
	
	//add hyperlink
	pw.println("<a href='page.html'>home</a>");
	
	//close stream
	pw.close();

	}//doGet(-,-)
	
	
}//class
