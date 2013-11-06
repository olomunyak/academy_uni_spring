package com.uniwill.lms.web.login.dao;

import com.uniwill.lms.web.login.bean.LoginBean;

public interface ILoginDao {

	public LoginBean getUserInfo(LoginBean lb) throws Throwable;

}
