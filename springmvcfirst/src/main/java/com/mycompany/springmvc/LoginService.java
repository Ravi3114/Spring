package com.mycompany.springmvc;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Ravi3114") && password.equals("I@monly5");
	}
}
