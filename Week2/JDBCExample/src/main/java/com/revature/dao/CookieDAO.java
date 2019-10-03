package com.revature.dao;

import java.util.List;

import com.revatue.pojo.Cookie;

public interface CookieDAO {
	
	public void createCookie(Cookie cookie);
	
	public Cookie getCookie(int id);
	
	public List<Cookie> getAllCookies();
	
	public void updateCookie(Cookie cookie, int id);
	
	public void deleteCookie(Cookie cookie);

}
