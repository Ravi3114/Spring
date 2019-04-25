package com.mycompany.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,false));
	}
	
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
	public String addTodo(ModelMap model,@RequestParam String desc) {
		todoService.addTodo("mycompany", desc, new Date(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todos",method=RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id) {
		todoService.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}


}
