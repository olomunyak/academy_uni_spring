package com.uniwill.lms.web.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uniwill.lms.web.hello.service.IHelloService;

@Controller
public class HelloController {

	@Autowired
	public IHelloService iHelloService;
	
	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request,
			                  HttpServletResponse response,
			                  ModelAndView modelAndView) {
		
		modelAndView.setViewName("hello/hello");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/hello2")
	public ModelAndView hello2(HttpServletRequest request,
			                   HttpServletResponse response,
			                   ModelAndView modelAndView) {
		
		int num = Integer.parseInt(request.getParameter("sendTxt"));
		
		String str = iHelloService.getGugudan(num);
		
		modelAndView.addObject("num", num);
		modelAndView.addObject("str", str);		
		
		modelAndView.setViewName("hello/hello2");
		
		return modelAndView;
	}
}
