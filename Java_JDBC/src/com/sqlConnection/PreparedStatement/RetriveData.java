package com.sqlConnection.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetriveData {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver load....");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Rock@123");
			System.out.println("conneccted to the db..");
			
			String sqlcommand = "SELECT * FROM college WHERE id = ?";
			pst = conn.prepareStatement(sqlcommand);
			
			System.out.println("Enter the user id to fetch the details");
			int userID = sc.nextInt();
			pst.setInt(1, userID);
			
			result = pst.executeQuery();
			
			if(result.next()) {
				System.err.println(result.getInt("id")+" "+result.getString("name")+" "+result.getInt("marks"));
			}else {
				System.out.println("Invalid user id");
			}
		} catch (SQLException  | ClassNotFoundException e) {
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
