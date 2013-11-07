package com.uniwill.lms.web.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uniwill.lms.web.login.service.ILoginService;

@Controller
public class LoginController {

	@Autowired
	public ILoginService iLoginService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			                  HttpServletResponse response,
			                  ModelAndView modelAndView) {
		
		modelAndView.setViewName("login/login");
		
		return modelAndView;
	}
}
