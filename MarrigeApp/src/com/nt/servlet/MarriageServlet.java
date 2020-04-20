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
	boolean status=false;
	PrintWriter pw=null;
	
	
	//general setting
	pw=res.getWriter();
	res.setContentType("text/html");
	
	//read form data
	name=req.getParameter("pname");
	age=Integer.parseInt(req.getParameter("page"));
	gender=req.getParameter("gen");
	
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
