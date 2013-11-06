package com.uniwill.lms.common.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.uniwill.lms.common.bean.CodeBean;

@Service("ICommonDAO")
public class CommonDAO implements ICommonDAO {
	@Autowired
	private SqlMapClient sqlMapClient;

	@SuppressWarnings("unchecked")
	public ArrayList<CodeBean> getCode(String lCd) throws Throwable {
		return (ArrayList<CodeBean>) sqlMapClient.queryForList(
				"common.getCode", lCd);
	}

	@Override
	public int getCodeCount(String lCd) throws Throwable {
		return (int) sqlMapClient.queryForObject("common.getCodeCount", lCd);
	}

}








