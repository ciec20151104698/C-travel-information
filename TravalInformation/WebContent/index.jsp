<%@page import="com.ti.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%UserBean user = (UserBean)request.getSession().getAttribute("USER"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>行程管理系统</title>
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>
 <frameset rows="60,*">
       <frame src="title.jsp" scrolling="no">
       <frameset cols="120,*">
          <frame src="function.jsp" scrolling="no">
          <frame src="background.jsp"  name="main" scrolling="no">
       </frameset>
  </frameset>
</html>