package com.uniwill.lms.common.dao;

import java.util.ArrayList;

import com.uniwill.lms.common.bean.CodeBean;

public interface ICommonDAO {

	public ArrayList<CodeBean> getCode(String lCd) throws Throwable;
	
	public int getCodeCount(String lCd) throws Throwable;
}
