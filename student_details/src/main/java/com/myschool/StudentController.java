package com.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
    @RequestMapping(value="/student",method=RequestMethod.POST)
	public String enterDetails() {
		return "enterstudentdetails";
	}
    
    @RequestMapping(value="",method=RequestMethod.POST)
    public String showDetails(@RequestParam String studentName, @RequestParam String schoolName, @RequestParam String classStudied,ModelMap model) {
    	model.put("studentName",studentName);
    	model.put("schoolName",schoolName);
    	model.put("classStudied",classStudied);
    	return "studentdetails";
    }

}
