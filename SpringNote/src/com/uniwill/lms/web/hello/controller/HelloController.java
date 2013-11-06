package com.uniwill.lms.web.hello.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uniwill.lms.web.hello.bean.HelloBean;

@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request,
			                  HttpServletResponse response,
			                  ModelAndView modelAndView) {
		
		List<HelloBean> list = new ArrayList<HelloBean>();
		
		for(int i = 0 ; i < 10 ; i++) {
			HelloBean hb = new HelloBean();
			hb.setNum(i);
			hb.setName("Tester" + i);
			hb.setPhone("010-000-000" + i);
			
			list.add(hb);
		}
		
		modelAndView.addObject("msg", "HelloWorld!!");
		modelAndView.addObject("list", list);
		
		modelAndView.setViewName("hello/hello");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/hello2")
	public ModelAndView hello2(HttpServletRequest request,
			                   HttpServletResponse response,
			                   ModelAndView modelAndView) {
		
		modelAndView.setViewName("hello/hello2");
		
		return modelAndView;
	}
}
