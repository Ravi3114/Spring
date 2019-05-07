package com.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/studentlogin",method=RequestMethod.POST)
	public String showStudentLoginPage() {
		return "studentDetails";
	}
	
	@RequestMapping(value="/hello" ,method=RequestMethod.POST)
	public String showDetails(ModelMap mp, @RequestParam String studentName,@RequestParam String studentId,@RequestParam String schoolName) {
		mp.put("studentName",studentName);
		mp.put("studentId",studentId);
		mp.put("schoolName",schoolName);
		
		return "showStudentDetails";
	}
	
	@RequestMapping(value="/teacherlogin",method=RequestMethod.POST)
	public String showTeacherLoginPage() {
		return "teacherDetails";
	}
	
	@RequestMapping(value="/teacher",method=RequestMethod.POST)
	public String showTeacherDetails(ModelMap mp,@RequestParam String teacherName, @RequestParam String subject, @RequestParam String school) {
		mp.put("name",teacherName);
		mp.put("subject",subject);
		mp.put("school",school);
		return "showTeacherDetails";
	}
	
}
