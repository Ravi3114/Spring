package com.mycompany.movies.controller;
 
import javax.servlet.HttpConstraintElement;.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MovieController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/movie",method=RequestMethod.POST)
	public ModelAndView showMovie(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mav=new ModelAndView("movie");
	mav.addObject("movie",new Movie());
	return mav;
	}
}
