package com.revature.driver;

import org.hibernate.SessionFactory;

import com.revature.util.SessionFactoryUtil;

public class HibernateDriver {
	
	public static void main(String[] args) {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	}

}
