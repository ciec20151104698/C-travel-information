<%@page import="com.ti.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%UserBean user = (UserBean)request.getSession().getAttribute("USER"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>教师管理系统</title>
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>
  <body bgcolor="#4a77d4">
      <center>
         <h1 style="color: #fff;text-shadow: 0 0 10px rgba(0, 0, 0, 0.3);letter-spacing: 1px;text-align: center;">欢迎使用行程服务平台,欢迎用户<%=user.getUser_name()%></h1>
      </center>
  </body>
</html>