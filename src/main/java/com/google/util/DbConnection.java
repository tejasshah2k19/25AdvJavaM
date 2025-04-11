package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getDbConnection() {

		// 4 property
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jee23";
		String userName = "root";
		String password = "root";

		try {
			// driver load
			Class.forName(driverName);

			// open connection
			Connection con = DriverManager.getConnection(url, userName, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println(DbConnection.getDbConnection());
	}
}
