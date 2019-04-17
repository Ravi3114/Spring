package com.mycompany.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Ravi3114") && password.equals("I@monly5");
	}
}
