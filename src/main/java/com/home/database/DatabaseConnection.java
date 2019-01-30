package com.home.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
	private static final String DB_URL = "jdbc:ibm-u2://mars.nsanet.com:31438/NSA_SQL";
	private static final String USER = "ppmserv";
	private static final String PASS = "clear1";

	public static void getUVConnection() {

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			 Class.forName("com.ibm.u2.jdbc.UniJDBCDriver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection successful");
		} catch (Exception e) {
			System.out.println("Exception::" + e.getMessage());
		}
	}

}
