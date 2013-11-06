package com.uniwill.lms.web.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request,
			                  HttpServletResponse response,
			                  ModelAndView modelAndView) {
		modelAndView.setViewName("hello/hello");
		
		return modelAndView;
	}
}
