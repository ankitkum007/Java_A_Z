package com.sqlConnection.RemoveData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DelectData {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Successfully Driver Load");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Rock@123");
			System.out.println("Connection Established");

			String query = "delete from stud where name = ?";

			pst = conn.prepareStatement(query);

			System.out.println("Enter the id");
			String name = sc.next();
			pst.setString(1, name);

			int rows = pst.executeUpdate();
			System.out.println(rows);
			if (rows > 0) {
				System.out.println("Data ara deleted");
			} else {
				System.out.println("Invalid input");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pst != null)
					pst.close();
				if (sc != null)
					sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
