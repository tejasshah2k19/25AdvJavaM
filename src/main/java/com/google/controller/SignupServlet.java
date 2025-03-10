package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SignupSerlvet...called..........");
	
		String firstName = request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		
		//
		response.setContentType("text/html"); // i will send an html data 
		//text/html -> MIME type 
		PrintWriter out = response.getWriter();
		
		out.print(firstName+"<BR>");
		out.println(lastName+"<BR>");
		out.println(email+"<BR>");
		out.println(password+"<BR>");
		
		
		
	}
}
