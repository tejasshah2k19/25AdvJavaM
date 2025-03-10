package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/CalculatePriceServlet")
public class CalculatePriceServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String productName = request.getParameter("productName");
		String priceStr  = request.getParameter("price");
		String qtyStr = request.getParameter("qty");
		
		String error ="";
		boolean isError = false; 
		//validation 
		System.out.println(productName);
		if(productName ==null || productName.trim().length() == 0 ) {
			error += "<br>Please Enter Product Name";
			isError = true; 
		}
		if(priceStr ==null || priceStr.trim().length() == 0 ) {
			error += "<br>Please Enter Price";
			isError = true; 
		}
		if(qtyStr ==null || qtyStr.trim().length() == 0 ) {
			error += "<br>Please Enter Qty";
			isError = true ; 
		}
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		
		if(isError == true ) {
			out.print(error);
		}else {
			int price = Integer.parseInt(priceStr);
			int qty = Integer.parseInt(qtyStr);
			int total = price * qty; 
			
			out.print("Total Amount : "+total);
		}
	
	
	}
	
}




