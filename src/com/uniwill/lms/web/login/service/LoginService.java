package com.uniwill.lms.web.login.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniwill.lms.web.login.bean.LoginBean;
import com.uniwill.lms.web.login.dao.ILoginDao;

@Service(value="ILoginService")
public class LoginService implements ILoginService {

	@Autowired
	public ILoginDao iLoginDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public LoginBean getMember(HashMap params) throws Throwable {		
		return iLoginDao.getMember(params);
	}
}
