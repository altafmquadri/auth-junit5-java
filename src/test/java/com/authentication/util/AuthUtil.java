package com.authentication.util;

import com.authentication.Auth.Authentication;
import com.authentication.model.User;

public class AuthUtil {
	
	public static void seed() {
		Authentication.users.add(User.builder().name("Altaf").password("test123").build());
		Authentication.users.add(User.builder().name("Nasr").password("test456").build());
		Authentication.users.add(User.builder().name("Salman").password("test789").build());
	}
}
