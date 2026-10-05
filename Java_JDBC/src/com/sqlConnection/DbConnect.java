package com.sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class DbConnect {
    public static void main(String[] args) {
    	Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/college";
            String user = "root";
            String password = "Rock@123";

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected");
            
//            Statement st = conn.createStatement();
            PreparedStatement st = conn.prepareStatement("SELECT * FROM college");
            
            ResultSet result = st.executeQuery();
            
            while(result.next()) {
            	System.out.println(result.getInt("id")+" "+result.getString("name")+" "+result.getInt("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
    }
}
