package com.mycompany.schoolmvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.schoolmvc.model.*;
import com.mycompany.schoolmvc.services.*;

@Controller
public class AppController {
	@Autowired 
	UserService service;
	
	@RequestMapping(value="/schoolinfo",method=RequestMethod.POST)
	public ModelAndView showDetails(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mav=new ModelAndView("schools");
		ClassS classS=new ClassS();
		StJohns stjohns=new StJohns;
		mav.addObject("schools",new Student(classS,stjohns));
		return mav;
	}

}
