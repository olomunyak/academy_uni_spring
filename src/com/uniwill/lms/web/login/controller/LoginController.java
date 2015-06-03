package com.uniwill.lms.web.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uniwill.lms.web.login.bean.LoginBean;
import com.uniwill.lms.web.login.service.ILoginService;

@Controller
public class LoginController {

	@Autowired
	public ILoginService iLoginService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			                  HttpServletResponse response,
			                  ModelAndView modelAndView) throws Throwable {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("sMemNo") != null) {
			
			modelAndView.setViewName("redirect:main");
		} else {
			
			modelAndView.setViewName("login/login");
		}
		
		return modelAndView;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/loginCheck")
	public ModelAndView loginChk(HttpServletRequest request,
			                     HttpServletResponse response,
			                     ModelAndView modelAndView) throws Throwable {
		
		HashMap params = new HashMap();
		
		params.put("memId", request.getParameter("memId"));
		params.put("memPw", request.getParameter("memPw"));
		
		LoginBean lb = iLoginService.getMember(params);
		
		if(lb != null) {
			
			HttpSession session = request.getSession();
			
			session.setAttribute("sMemNo", lb.getMemNo());
			session.setAttribute("sMemId", lb.getMemId());
			session.setAttribute("sMemNm", lb.getMemNm());
			
//			modelAndView.setViewName("login/login_result");
			modelAndView.setViewName("redirect:main");
			
			return modelAndView;
		} else {
			
			modelAndView.setViewName("redirect:login");
			
			return modelAndView;
		}
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest request,
			                   HttpServletResponse response,
			                   ModelAndView modelAndView) throws Throwable {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		modelAndView.setViewName("redirect:login");
		
		return modelAndView;
	}
}
