package com.uniwill.lms.web.login.service;

import com.uniwill.lms.web.login.bean.LoginBean;

public interface ILoginService {

	public LoginBean getUserInfo(LoginBean lb) throws Throwable;

}
