package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegServlet")
public class StudentRegServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String collegeName = request.getParameter("collegeName");

		// validation
		boolean isError = false;// no error
		String error = "";

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
		}

		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			error += "Please Enter LastName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
		}

		if (collegeName == null || collegeName.trim().length() == 0) {
			isError = true;
			error += "Please Enter collegeName<br>";
		}
		
		
		if(isError == true) {
			request.setAttribute("error", error);
			
			RequestDispatcher rd = request.getRequestDispatcher("StudentReg.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}

	}
}
