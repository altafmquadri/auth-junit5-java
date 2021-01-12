package com.authentication.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
	
	private String name;
	private String password;

}
