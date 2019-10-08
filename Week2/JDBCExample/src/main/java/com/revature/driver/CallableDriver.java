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
			String sql = "{call expensive_tracks(?, ?)}";
			PreparedStatement call = conn.prepareCall("call expensive_tracks(?, ?)");
			//CallableStatement call = conn.prepareCall(sql);
			call.setDouble(1, 3.00);
			call.setObject(2, resultSet, Types.OTHER);
			//call.registerOutParameter(2, Types.OTHER);
			ResultSet ret = call.executeQuery();
			ret.next();
			resultSet = (ResultSet) ret.getObject(1);
			
			//resultSet = (ResultSet) call.getObject(2);

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
