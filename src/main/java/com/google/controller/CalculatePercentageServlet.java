package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatePercentageServlet")
public class CalculatePercentageServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String studentName = request.getParameter("studentName");
		String mathsStr= request.getParameter("maths");
		String sciStr = request.getParameter("sci");
		String engStr = request.getParameter("eng");
		
		
		//validation 
		boolean isError  = false;
		String error = "";
		if(studentName == null || studentName.trim().length() ==0 ) {
			isError = true; 
			error = "Please Enter Student Name";
		}
		if(mathsStr == null || mathsStr.trim().length() ==0 ) {
			isError = true; 
			error = "Please Enter Maths Mark";
		}
		
		if(isError == true) {
			
		}else {
			Integer maths = Integer.parseInt(mathsStr);
			Integer sci = Integer.parseInt(sciStr);
			Integer eng = Integer.parseInt(engStr);			
			Integer per = (maths+sci+eng)/3;
			//servlet ->data ->send ->jsp 
			
			request.setAttribute("percentage", per);
			
			RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
			rd.forward(request, response);
		}
	
	}
}
