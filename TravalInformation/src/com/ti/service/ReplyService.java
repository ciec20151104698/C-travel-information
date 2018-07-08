package com.ti.service;
import com.ti.dao.ReplyDealDao;

public class ReplyService {

	public String content_add(String host_article_id,String reply_id,String reply_title, String reply_content) {
		// TODO Auto-generated method stub
		String temp = "NO";
		ReplyDealDao replyadd = new ReplyDealDao();
		temp = replyadd.ContentAdd(host_article_id,reply_id,reply_title,reply_content);
		return temp;
	}

}
