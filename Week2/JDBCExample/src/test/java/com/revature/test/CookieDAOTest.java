package com.revature.test;

import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.postgresql.core.BaseStatement;

import com.revatue.pojo.Cookie;
import com.revature.dao.CookieDAOPostgres;
import com.revature.jdbc.util.ConnectionFactory;

@RunWith(MockitoJUnitRunner.class)
public class CookieDAOTest {
	
	private CookieDAOPostgres cookieDao = new CookieDAOPostgres();
	
	private Cookie cookie;
	
	@Mock
	private Connection conn;
	
	@Mock
	private BaseStatement stmt;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		when(conn.createStatement()).thenReturn(stmt);
		
		cookie = new Cookie();
		
		cookieDao.setConn(conn);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateCookie() {
		
		cookie.setFlavor("choco chip");
		cookie.setDeliciousness(10);
		
		cookieDao.createCookie(cookie);
		
		try {
			Mockito.verify(stmt).executeUpdate("insert into cookie (flavor, delciousness) values('choco chip', 10)");
		} catch (SQLException e) {
		}
		
		
	}

}
