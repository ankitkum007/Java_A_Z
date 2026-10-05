package com.sqlConnection.Tranction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tranction_ACID {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Rock@123");
			System.out.println("connected");

			conn.setAutoCommit(false);

			String debit = "update accountholder set balance = balance - ? where accountNumber = ?";
			String creadit = "update accountholder set balance = balance + ? where accountNumber = ?";

			ps1 = conn.prepareStatement(debit);
			ps1.setInt(1, 2000);
			ps1.setInt(2, 110033);

			ps2 = conn.prepareStatement(creadit);
			ps2.setInt(1, 2000);
			ps2.setInt(2, 110022);

			ps1.executeUpdate();
			ps2.executeUpdate();

			conn.commit();
			System.out.println("Tranction successful");
		} catch (SQLException e) {
			try {
				if (conn != null) {
					conn.rollback();
					System.out.println("Tranction failed");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {
				if(ps1 != null) ps1.close();
				if(ps2 != null) ps2.close();
				if(conn != null) {
					conn.setAutoCommit(true);
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}

}
