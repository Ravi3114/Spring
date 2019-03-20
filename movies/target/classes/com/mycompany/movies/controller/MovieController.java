package com.mycompany.movies.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class MovieController {
	@RequestMapping(value="/movie",method=RequestMethod.GET)
	public ModelAndView movie() {
	return new ModelAndView("movie","command",new Movie());
	}
@RequestMapping(value="/addmovie",method=RequestMethod.POST)
public String addmovie(@ModelAttribute("movieAdd")Movie movie,ModelMap model) {
	model.addAtribute("mName",movie.getMovieName());
	return "result";
}

}
