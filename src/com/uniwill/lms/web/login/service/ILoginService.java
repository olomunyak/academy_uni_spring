package com.uniwill.lms.web.login.service;

import java.util.HashMap;

import com.uniwill.lms.web.login.bean.LoginBean;

public interface ILoginService {

	@SuppressWarnings("rawtypes")
	public LoginBean getMember(HashMap params) throws Throwable;

}
