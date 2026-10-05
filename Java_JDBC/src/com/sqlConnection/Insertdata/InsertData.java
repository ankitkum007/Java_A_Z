package com.sqlConnection.Insertdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preSta = null;
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver load...!");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Rock@123");
			System.out.println("connection establist");
			
			String sqlQuery = "insert into stud (name, address, age) values (?, ?, ?)";
			preSta = connection.prepareStatement(sqlQuery);
			
			preSta.setString(1, "mukesh");
			preSta.setString(2, "bihar");
			preSta.setString(3, "23");
			
			int rowInserted = preSta.executeUpdate();
			
			if(rowInserted > 0) {
				System.out.println("data is inserted");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection != null) connection.close();
				if(preSta != null) preSta.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
