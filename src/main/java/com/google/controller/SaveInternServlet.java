package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveInternServlet")
public class SaveInternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String language = request.getParameter("language");
		String hobby[] = request.getParameterValues("hobby");
		String address = request.getParameter("address");

		// create regex - pattern
		// valid

		String alphaRegex = "[a-zA-Z]+";// min:1,max:n

		String emailRegex = "[a-zA-Z0-9_-]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}";// 2 and 3

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else if (firstName.matches(alphaRegex) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			request.setAttribute("firstNameValue", firstName);

		}
		else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else if (email.matches(emailRegex) == false) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Valid Email");
			request.setAttribute("emailValue",email);

		}
		else {
			request.setAttribute("emailValue", email);
		}

		
		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		} else {
			request.setAttribute("genderValue", gender);
		}

		if (language.equals("-1")) {
			isError = true;
			request.setAttribute("languageError", "Please Select Language");
		} else {
			request.setAttribute("languageValue", language);
		}

		if (hobby == null) {
			isError = true;
			request.setAttribute("hobbyError", "Please Select Hobby");
		} else {
			String hobbyStr = "";
			for (int i = 0; i < hobby.length; i++) {
				hobbyStr = hobbyStr + hobby[i] + " ";
			}

			request.setAttribute("hobbyValue", hobbyStr);
		}

		if (isError) {
			RequestDispatcher rd = request.getRequestDispatcher("InternReg.jsp");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("InternSuccess.jsp");
			rd.forward(request, response);
		}

	}
}
