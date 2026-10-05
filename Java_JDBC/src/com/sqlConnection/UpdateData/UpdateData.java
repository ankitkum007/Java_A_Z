package com.sqlConnection.UpdateData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver load");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Rock@123");
			System.out.println("connected");

			String sql = "update empolyee set salary = ? where id = ?";
			pst = conn.prepareStatement(sql);
			System.out.println("Enter the id and salary to update the data");
			
			double salary = sc.nextDouble();
			int id = sc.nextInt();
			
			pst.setDouble(1, salary);
			pst.setInt(2, id);

			int rowUpdate = pst.executeUpdate();

			if (rowUpdate > 0) {
				System.out.println("The employee slaary updated");
			} else {
				System.out.println("No employee found");
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
