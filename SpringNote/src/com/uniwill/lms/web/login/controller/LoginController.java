package com.uniwill.lms.web.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.uniwill.lms.web.login.service.ILoginService;

@Controller
public class LoginController {

	@Autowired
	public ILoginService iLoginService;
}
