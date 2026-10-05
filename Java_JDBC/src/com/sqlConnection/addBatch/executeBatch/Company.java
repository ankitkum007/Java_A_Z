package com.sqlConnection.addBatch.executeBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Company {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet set = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver active");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Rock@123");
			System.out.println("connect establest");

			String query = "insert into empolyee values (?, ? ,?, ?)";
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, 101);
			pst.setString(2, "rupesh");
			pst.setString(3, "backend devloper");
			pst.setDouble(4, 70000.00);
			pst.addBatch();
			pst.setInt(1, 102);
			pst.setString(2, "mukesh");
			pst.setString(3, "c++ devloper");
			pst.setDouble(4, 80000.00);
			pst.addBatch();
			pst.setInt(1, 103);
			pst.setString(2, "ram");
			pst.setString(3, "frontend devloper");
			pst.setDouble(4, 50000.00);
			
			
			pst.executeBatch();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn != null) conn.close();
				if(pst != null) pst.close();
				if(set != null) set.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
