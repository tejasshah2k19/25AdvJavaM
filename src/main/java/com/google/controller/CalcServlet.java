package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String x1 = request.getParameter("n1");
		String x2 = request.getParameter("n2");

		Integer n1 = Integer.parseInt(x1);
		Integer n2 = Integer.parseInt(x2);

		Integer ans = n1 + n2;

		
		//browser response 
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		
		out.print("addition => "+ans);
		
		
	}
}
