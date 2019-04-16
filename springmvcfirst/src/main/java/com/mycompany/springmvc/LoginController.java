package com.mycompany.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	LoginService loginserv=new LoginService();
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLogin() {
		return "Login";
	}
	@RequestMapping(value="",method=RequestMethod.POST)
	public String handleLogin(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if(loginserv.validateUser(name, password)) {
		model.put("name",name);
		model.put("password",password);
		return "welcome";
		}else {
			return "Login";
		}
	}

}
