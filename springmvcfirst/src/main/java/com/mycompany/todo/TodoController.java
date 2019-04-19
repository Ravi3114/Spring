package com.mycompany.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	private TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showLogin(ModelMap model) {
		model.addAttribute("todos",todoService.retrieveTodos("mycompany"));
		return "list-todos";
	}
	public String handleLogin(@RequestParam String name,@RequestParam String password,ModelMap model) {
		service = null;
		model.addAttribute("name",name);
		model.addAttribute("todos",service.retrieveTodos("mycompany"));
		return "list-todos";
		
	}

}
