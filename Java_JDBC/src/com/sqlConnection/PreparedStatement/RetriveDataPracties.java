package com.sqlConnection.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetriveDataPracties {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded..");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Rock@123");
			System.out.println("connetion establest..");
			String sqlQuery = "select * from college where id = ?";

			pst = conn.prepareStatement(sqlQuery);
			
			System.out.println("Enter User ID");
			int userid = sc.nextInt();
			pst.setInt(1, userid);

			result = pst.executeQuery();

			if (result.next()) {
				System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getInt("marks"));
			} else {
				System.out.println("Invalid user id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn != null) conn.close();
				if(pst != null) pst.close();
				if(result != null) result.close();
				if(sc != null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
