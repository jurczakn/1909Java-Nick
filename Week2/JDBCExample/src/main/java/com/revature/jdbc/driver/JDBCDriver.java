package com.revature.jdbc.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {

	private static final String URL = "";

	private static final String USERNAME = "";

	private static final String PASSWORD = "";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
			
			String sql = "create table cookie ("
						+ "c_id serial primary key,"
						+ "flavor text,"
						+ "delciousness integer"
						+ ")";
			
			String sql2 = "insert into cookie (flavor, delciousness) values('choco chip', 10)";
			
			String sql3 = "select * from cookie";
			
			Statement stmt = conn.createStatement();
			
			//stmt.executeUpdate(sql2);
			
			ResultSet resultSet = stmt.executeQuery(sql3);
			
			System.out.println("List Cookies");
			
			while(resultSet.next()) {
				System.out.println("Cookie ID: " + resultSet.getInt(1) + " Flavor: " + resultSet.getString(2) + " Delciousness: " + resultSet.getInt(3));
			}
			
			System.out.println("OK");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
