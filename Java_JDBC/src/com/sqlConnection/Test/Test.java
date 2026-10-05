package com.sqlConnection.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {

			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String password = "Rock@123";

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("db is connected");

			conn.setAutoCommit(false);

			String q1 = "UPDATE company SET salary = salary - 25000 WHERE employee_id = 101";
			String q2 = "UPDATE company SET salary = salary + 25000 WHERE employee_id = 102";

			Statement statement = conn.createStatement();

			statement.executeUpdate(q1);
			statement.executeUpdate(q2);

			conn.commit();
			System.out.println("all tranction are done");

		} catch (SQLException e) {

			conn.rollback();

			e.printStackTrace();
		} finally {
			conn.setAutoCommit(true);
		}
	}

}
