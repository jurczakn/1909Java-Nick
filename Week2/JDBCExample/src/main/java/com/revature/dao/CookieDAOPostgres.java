package com.revature.dao;

import java.sql.Connection;
import java.util.List;

import com.revatue.pojo.Cookie;
import com.revature.jdbc.util.ConnectionFactory;

public class CookieDAOPostgres implements CookieDAO {

	private Connection conn = ConnectionFactory.getConnection();
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void createCookie(Cookie cookie) {

	}

	@Override
	public Cookie getCookie(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cookie> getAllCookies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCookie(Cookie cookie, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub

	}

}
