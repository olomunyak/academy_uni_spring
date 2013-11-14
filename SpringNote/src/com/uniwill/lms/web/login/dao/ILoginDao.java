package com.uniwill.lms.web.login.dao;

import java.util.HashMap;

import com.uniwill.lms.web.login.bean.LoginBean;

public interface ILoginDao {

	@SuppressWarnings("rawtypes")
	public LoginBean getMember(HashMap params) throws Throwable;
}
