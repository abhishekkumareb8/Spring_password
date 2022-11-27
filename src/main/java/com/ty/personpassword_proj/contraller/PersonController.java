package com.ty.personpassword_proj.contraller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView saveStudent(@ModelAttribute User user) {
		u2 = service.saveuser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());
		modelAndView.setViewName("signupapp.jsp");
		return modelAndView;
	}

	@RequestMapping("saveapp")
	public ModelAndView saveApp(@ModelAttribute Application application) {
		service.saveapp(application);
		ModelAndView modelAndView = new ModelAndView();
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
		ModelAndView modelAndView = new ModelAndView();
		User user2 = service.getUserByEmail(user);
		if (user2 != null && user2.getRole().equals("user")) {
			modelAndView.addObject("name", user2.getName());
			modelAndView.addObject("user", service.getUserByEmail(user2));
			modelAndView.setViewName("view.jsp");
		} else if (user2 != null) {
			modelAndView.addObject("name", user2.getName());
			modelAndView.addObject("user", service.getAllUser());
			modelAndView.setViewName("adminview.jsp");
		} else
			modelAndView.setViewName("index.jsp");
		return modelAndView;
	}

	@RequestMapping("viewpass")
	public ModelAndView viewApplication(Application application) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("viewapp.jsp");
		modelAndView.addObject("appget", service.getAllapp());
		return modelAndView;
	}

	@RequestMapping("delete")
	public ModelAndView viewApplication(User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("delete.jsp");
		return modelAndView;
	}


	@RequestMapping("edit")
	public ModelAndView editEmployee(@RequestParam int id) {

		User user = service.getUserById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("edituser.jsp");
		return modelAndView;
	}

	@RequestMapping("updateuser")
	public ModelAndView updateUser(User user) {
		ModelAndView modelAndView = new ModelAndView();
		//	modelAndView.addObject("user", service.updateUser());
		modelAndView.setViewName("view.jsp");
		//		modelAndView.addObject("appget", new Application());
		return modelAndView;
	}

	
	
	@RequestMapping("editapp")
	public ModelAndView editStudent(@RequestParam int id) {
		Application application = service.getApp(id);
		ModelAndView modelandView = new ModelAndView();
		modelandView.addObject("application", application);
		modelandView.setViewName("editapp.jsp");
    
		return modelandView;
	}
	

	
	
	@RequestMapping("updateapp")
	public void updateStudent(@ModelAttribute Application application,HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		service.updateapp(application);
		RequestDispatcher dispatcher=req.getRequestDispatcher("viewpass");
		dispatcher.forward(req, res);
		
		
	}
	
	
	


	

}
