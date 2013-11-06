package com.uniwill.lms.web.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.uniwill.lms.web.login.bean.LoginBean;

@Repository(value="ILoginDao")
public class LoginDao implements ILoginDao {
	
	@Autowired
	public SqlMapClient sqlMapClient;
	
	@Override
	public LoginBean getUserInfo(LoginBean lb) throws Throwable {
		return (LoginBean) sqlMapClient.queryForObject("login.getUserInfo", lb);
	}

}
