package com.authentication.Auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.authentication.util.AuthUtil;

public class AuthenticationTest {
	
	Authentication auth = new Authentication();
	
	@BeforeEach
	public void setup() {
		AuthUtil.seed();
	}
	
	@Test
	public void authenticateTest() {
		Assertions.assertEquals(true, auth.authenticate("Altaf", "test123"));
		Assertions.assertTrue("Altaf".equals(auth.getCurrentUser().getName()));
		
	}
	
	@Test
	public void failAuthenticateTest() {
		Assertions.assertEquals(false, auth.authenticate("Nasr", "test123"));
		Assertions.assertNull(auth.getCurrentUser());
	}
	
	@Test
	public void logoutTest() {
		Assertions.assertEquals(true, auth.authenticate("Salman", "test789"));
		Assertions.assertTrue("Salman".equals(auth.getCurrentUser().getName()));
		Assertions.assertNotNull(auth.getCurrentUser());
		auth.logout();
		Assertions.assertNull(auth.getCurrentUser());
	}
}
