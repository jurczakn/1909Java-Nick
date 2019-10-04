package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revatue.pojo.User;
import com.revature.jdbc.util.ConnectionFactory;

public class UserDAO {
	
	private static Connection conn = ConnectionFactory.getConnection();
	
	public User getUserByUsername(String username) {
		
		String sql = "select * from user_table where username = ?";
		
		PreparedStatement stmt;
		
		User user = new User();
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	public void createUser(User u) {
		
		String sql = "insert into user_table (username, password) values(?, ?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,  u.getUsername());
			stmt.setString(2, u.getPassword());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void preparedUpdatePassword(User u) {
		
		String sql = "update user_table set password = ? where username = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, u.getPassword());
			stmt.setString(2, u.getUsername());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updatePassword(User u) {
		
		String sql = "update user_table set password = '" + u.getPassword() + "' where username = '" + u.getUsername() + "'";
		
		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
