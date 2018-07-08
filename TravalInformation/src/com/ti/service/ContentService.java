package com.ti.service;

import com.ti.dao.ContentDealDao;

public class ContentService {

	public String content_add(String user_name,String main_title, String main_content) {
		// TODO Auto-generated method stub
		String temp = "NO";
		ContentDealDao contentadd = new ContentDealDao();
		temp = contentadd.ContentAdd(user_name,main_title,main_content);
		return temp;
	}

	public String selectArticleId() {
		// TODO Auto-generated method stub
		return null;
	}

}
