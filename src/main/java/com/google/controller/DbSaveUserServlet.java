package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.DbConnection;

@WebServlet("/DbSaveUserServlet")
public class DbSaveUserServlet extends HttpServlet {

	// doGet
	// doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		Integer credit = Integer.parseInt(request.getParameter("credits"));

		try {
			// db connection
			Connection con = DbConnection.getDbConnection();

			//Statement  PreparedStatement 
			// query
			PreparedStatement pstmt = con.prepareStatement("insert into users (name,mobile,credits) values (?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, mobile);
			pstmt.setInt(3, credit);
			
			int record = pstmt.executeUpdate();
			
			System.out.println(record+" record inserted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
