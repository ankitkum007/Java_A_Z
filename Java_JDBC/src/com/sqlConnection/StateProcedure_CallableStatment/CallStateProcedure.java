package com.sqlConnection.StateProcedure_CallableStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallStateProcedure {
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		ResultSet ans = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Rock@123");
			System.out.println("connected...!");
			String sql = "{call getMarks(?)}";
			
			cs = con.prepareCall(sql);
			cs.setInt(1, 70);
			
			ans = cs.executeQuery();
			
			while(ans.next()) {
				System.out.println(ans.getInt(1)+" " + ans.getString(2)+" "+ans.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) con.close();
				if(cs != null) cs.close();
				if(ans != null) ans.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	
		
	}

}
