package com.mycompany.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String listTodo(ModelMap model) {
		model.addAttribute("todos",todoService.retrieveTodos("mycompany"));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todos",method=RequestMethod.GET)
	public String showTodosPage() {
		return "todo";
	}
	
	@RequestMapping(value="/add-todos",method=RequestMethod.POST)
	public String addTodo() {
		return "todo";
	}

}
