package com.revature.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.revature.jdbc.util.ConnectionFactory;

public class CallableDriver {

	//Callable Statements are a statement in JDBC
	//Used to call Stored Procedures and Functions
	public static void main(String[] args) {

		Connection conn = ConnectionFactory.getConnection();
		try {
			ResultSet resultSet = null;
			conn.setAutoCommit(false);
			String sql = "{call expensive_tracks(?, ?)}"; // used to call functions in postgres
			PreparedStatement call = conn.prepareCall("call expensive_tracks(?, ?)"); // used for stored proc in Postgres
			//CallableStatement call = conn.prepareCall(sql);  // used to call a function in postgres
			call.setDouble(1, 3.00);
			call.setObject(2, resultSet, Types.OTHER);
			//call.registerOutParameter(2, Types.OTHER);  // needed to set an out param for a function
			ResultSet ret = call.executeQuery(); //grab all out params
			ret.next(); // load the first out param into ret
			resultSet = (ResultSet) ret.getObject(1); // grab the cursor (the first out param from our procedure)
			
			//resultSet = (ResultSet) call.getObject(2);  // use to grab result set for a function

			while (resultSet.next()) {
				System.out.println("Track Title: " + resultSet.getString(1));
				System.out.println("Unit Price: " + resultSet.getDouble(2));
				System.out.println("-----------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
