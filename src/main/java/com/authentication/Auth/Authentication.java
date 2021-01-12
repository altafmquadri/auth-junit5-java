package com.authentication.Auth;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import com.authentication.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authentication {

	public static List<User> users = new ArrayList<>();
	private User currentUser = null;

	public Boolean authenticate(String userName, String password) {
		AtomicBoolean isAuthenticated = new AtomicBoolean(false);
		
		users.stream().filter(user -> user.getName().equals(userName) && 
				user.getPassword().equals(password))
				.findFirst().ifPresent(user -> {
					isAuthenticated.set(true);
					this.currentUser = user;
				});
		return isAuthenticated.get();
	}

	public void logout() {
		setCurrentUser(null);
	}

}
