package com.ty.personpassword_proj.contraller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.personpassword_proj.dto.Application;
import com.ty.personpassword_proj.dto.User;
import com.ty.personpassword_proj.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService service;
	
	User u1, u2;
	@RequestMapping("signup")
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("user", new User());
		return modelAndView;

	}
	
	@RequestMapping("saveuser")
	public ModelAndView saveStudent(@ModelAttribute User user ) {
		 u2=service.saveuser(user);
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("application", new Application());
		
		modelAndView.setViewName("signupapp.jsp");
		return modelAndView;
	}
	@RequestMapping("saveapp")
	public ModelAndView saveApp(@ModelAttribute Application application ) {
		
		service.saveapp(application);
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.jsp");
		modelAndView.addObject("userget", new User());
		return modelAndView;
	}
	@RequestMapping("loginoption")
	public ModelAndView getUser(@ModelAttribute User user) {
		ModelAndView modelAndView= new ModelAndView(); 
		User user2 = service.getUserByEmail(user);
		if(user2 !=null) {
			modelAndView.addObject("name", user2.getName());
			modelAndView.addObject("slist", service.getAllUser());
			modelAndView.setViewName("view.jsp");
		}
		else
			modelAndView.setViewName("index.jsp");
		return modelAndView;
	}

}
