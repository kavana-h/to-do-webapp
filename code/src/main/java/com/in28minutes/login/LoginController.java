package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//instantiate automatically
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handlerLoginRequest(
			@RequestParam String name, 
			@RequestParam String password, 
			ModelMap model) {
		
		if (service.validateUser(name, password)){
			model.put("name", name); //availabele to the view
			model.put("password", password);
			return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
	}
}

/*
 * 
 * localhost:8080/spring-mvc/login
 * 
 * spring-mvc ---> Dispatcher Servlet - > front-contoller
 * 
 * /login ----> Login Controller (Handler)
 * 
 * View Resolver
 * login -> /WEB-INF/views/login.jsp
 * 
 * login.jsp - > VIEW
 * 
 *   /WEB-INF/views/login.jsp
 */