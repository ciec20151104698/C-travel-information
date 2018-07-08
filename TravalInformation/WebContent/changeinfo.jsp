<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ti.bean.UserBean"%>
<%
	UserBean user = (UserBean)request.getSession().getAttribute("USER");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/login.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
function changeValidateCode() {
	document.getElementById("validateCode").src = "ValidateCodeServlet?rand="
			+ Math.random();
}
</script>
</head>
<%-- 
<body>
	<form action="UserInfoChangeServlet" method="post">
		<table>
			<tr>
				<td>账号：</td>
				<td><%=user.getUser_id()%></td>
			</tr>
			<tr> 
				<td>用户名：</td>
				<td><input type="text" name="user_name" id="user_name" value="<%=user.getUser_name()%>"></td>
			</tr>
			<tr>
				<td>等级：</td>
				<td><%=user.getUser_rank()%></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="text" name="user_sex" id="user_sex" value="<%=user.getUser_sex()%>"></td>
			</tr>
			<tr>
				<td>联系方式：</td>
				<td><input type="text" name="user_email" id="user_email" value="<%=user.getUser_email()%>"></td>
			</tr>
			<tr>
				<td>
					<label class="tn-form-label">验证码：</label> 
					<input class="tn-textbox-long" type="text" name="verifyCode"> 
					<span>
							<img src="ValidateCodeServlet" id="validateCode" title="点击换一换" 
							onclick="changeValidateCode()"> 
							<a href="javascript:changeValidateCode();">看不清？</a>
					</span>
				</td>
				<td><input type="submit" value="更改信息"></td>
			</tr>
		</table>
		</form>
</body>
--%>

<body bgcolor="#4a77d4">
<%--class="login_bj" --%>
	<div class="zhuce_body">
		<div class="zhuce_kong">
			<div class="zc">
				<div class="bj_bai">
					<h3>欢迎查看个人信息</h3>
					<form action="TeaAddServlet" method="post">
						<input name="tea_name" type="text" class="kuang_txt phone" readonly="true"
							placeholder="账号" value="账号：<%=user.getUser_id()%>"> 
						<input name="tea_pwd" type="text"
							class="kuang_txt email" placeholder="用户名" value="<%=user.getUser_name()%>"> 
						<input name="tea_id" type="text"
							class="kuang_txt possword" placeholder="性别" value="<%=user.getUser_sex()%>"> 
						<input
							name="tea_sex" type="text" class="kuang_txt yanzm"
							placeholder="联系方式" value="<%=user.getUser_email()%>"> 
						<input name="tea_age" type="text"
							class="kuang_txt yanzm" placeholder="等级" value="等级：<%=user.getUser_rank()%>" readonly="true"> 
						<input name="注册" type="submit" class="btn_zhuce" value="修改">

					</form>
				</div>
				<div class="bj_right">
					<p>使用以下服务</p>
					<a href="noteList.jsp" class="zhuce_qq">返回论坛</a> 
					<a href="background.jsp" class="zhuce_wb">返回主界面</a>
				</div>
			</div>
			<P>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎进入个人中心</P>
		</div>

	</div>
</body>




</html>