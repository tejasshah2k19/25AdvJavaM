package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateTaxServlet")
public class CalculateTaxServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String incomeStr = request.getParameter("totalIncome");

		// validation

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter First Name");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			request.setAttribute("lastNameError", "Please Enter Last Name");
		}else {
			request.setAttribute("lastNameValue", lastName);
		}
		
		if (incomeStr == null || incomeStr.trim().length() == 0) {
			isError = true;
			request.setAttribute("totalIncomeError", "Please Enter Total Income");
		}else {
			request.setAttribute("incomeValue", incomeStr);
		}
		
		
		if(isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InputTax.jsp");
			rd.forward(request, response);
		}else {
			
			
			RequestDispatcher rd = request.getRequestDispatcher("PrintTax.jsp");
			rd.forward(request, response);
			
		}
		

	}
}
