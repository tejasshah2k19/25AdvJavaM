package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.DbConnection;

@WebServlet("/DbListUserServlet")
public class DbListUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			ResultSet rs = pstmt.executeQuery(); // run

			request.setAttribute("rs", rs);

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			while (rs.next()) // first record-> present:true : no record :false
			{
				int userId = rs.getInt("userId");
				String name = rs.getString("name");
				String mobile = rs.getString("mobile");
				int credits = rs.getInt("credits");

				out.print(userId + "  " + name + "  " + mobile + "  " + credits+"<br>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
