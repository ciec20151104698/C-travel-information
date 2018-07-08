package com.ti.service;

import com.ti.bean.UserBean;
import com.ti.dao.UserDao;

public class UserService {

	public UserBean logincheck(String user_id, String user_pwd) {
		// TODO Auto-generated method stub
		UserBean temp = new UserBean();
		temp.setUser_id(user_id);
		temp.setUser_pwd(user_pwd);
		
		UserDao check = new UserDao();
		UserBean result = check.logincheck(temp);
		
		
		return result;
	}

	public String infoadd(String user_id, String user_name, String user_pwd,String user_sex,String user_email) {
		// TODO Auto-generated method stub
		String temp = ""; 
		UserBean newuser = new UserBean();
		newuser.setUser_id(user_id);
		newuser.setUser_name(user_name);
		newuser.setUser_pwd(user_pwd);
		newuser.setUser_sex(user_sex);
		newuser.setUser_email(user_email);
		
		UserDao useradd = new UserDao();
		temp = useradd.infoadd(newuser);
		
		return temp;
	}

	public String loginchecktwice(String user_id, String user_pwd) {
		// TODO Auto-generated method stub
		String temp = ""; 
		UserBean newuser = new UserBean();
		newuser.setUser_id(user_id);
		newuser.setUser_pwd(user_pwd);
		
		UserDao usercheck = new UserDao();
		temp = usercheck.loginchecktwice(newuser);
		
		return temp;
	}

	public UserBean selectinfo(String user_id) {
		// TODO Auto-generated method stub
		UserBean userinfo = new UserBean();
		UserDao dao = new UserDao();
		userinfo = dao.selectinfodao(user_id);
		return userinfo;
	}

	public void infoUpdate(String user_id, String user_name, String user_sex, String user_email) {
		// TODO Auto-generated method stub
		UserBean temp = new UserBean();
		temp.setUser_id(user_id);
		temp.setUser_name(user_name);
		temp.setUser_sex(user_sex);
		temp.setUser_email(user_email);
		UserDao infoup = new UserDao();
		infoup.update(temp);
	}

}
