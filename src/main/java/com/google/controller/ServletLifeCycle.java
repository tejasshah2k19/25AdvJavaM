package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class ServletLifeCycle extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("ServletLifeCycle :: init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ServletLifeCycle :: service()");

		ServletConfig config = getServletConfig();
		String code = config.getInitParameter("secretCode");
		System.out.println("code => " + code);

	}

	public void destroy() {
		System.out.println("ServletLifeCycle :: destroy()");
	}
}
