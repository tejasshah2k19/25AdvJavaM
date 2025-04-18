package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.bean.UserBean;
import com.google.util.DbConnection;

@WebServlet("/DbListUserServlet")
public class DbListUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			ResultSet rs = pstmt.executeQuery(); // run

			ArrayList<UserBean> users = new ArrayList<UserBean>();

			while (rs.next()) // first record-> present:true : no record :false
			{
				int userId = rs.getInt("userId");
				String name = rs.getString("name");
				String mobile = rs.getString("mobile");
				int credits = rs.getInt("credits");

				UserBean userBean = new UserBean();
				userBean.setUserId(userId);
				userBean.setName(name);
				userBean.setMobile(mobile);
				userBean.setCredits(credits);

				users.add(userBean);

			}

			request.setAttribute("users", users);
			RequestDispatcher rd = request.getRequestDispatcher("DbListUser.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
