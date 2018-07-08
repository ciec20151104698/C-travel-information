<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />



<script type="application/x-javascript">
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<meta name="keywords"
	content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="css/style_login.css" rel='stylesheet' type='text/css' />

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<script>
		$(document).ready(function(c) {
			$('.close').on('click', function(c) {
				$('.login-form').fadeOut('slow', function(c) {
					$('.login-form').remove();
				});
			});
		});
		function changeValidateCode() {
			document.getElementById("validateCode").src = "ValidateCodeServlet?rand="
					+ Math.random();
		}
		function validate() {
			var username = document.getElementById("username");
			var password = document.getElementById("password");
			if(username.value == "") {
				alert("用户名不能为空！");
				username.focus();
				return false;
			}
			if (password.value == "") {
				alert("密码不能为空！");
				password.focus();
				return false;
			}
			return true;
		}
	</script>
	<!--SIGN UP-->
	<h1>Welcome Traval Login</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"> </label> <label class="lbl-2"> </label> <label
				class="lbl-3"> </label>
		</div>
		<div class="clear"></div>
		<div class="avtar">
			<img src="images/avtar.png" />
		</div>
		<form action="LoginServlet" method="post">
			<input type="text" class="text" value="Username" id="username" name="username"
				onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = 'Username';}">
			<div class="key">
				<input type="password" value="Password" id="password" name="password"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Password';}">
			</div>
			<div class="signin">
				<input type="submit" value="Login">
			</div>
			
			<%--<input type="hidden" name="requestPath" value="${requestScope.requestPath }"> --%>
		</form>
		<form method="post" action="register.jsp">
			<div class="signin">
				<input type="submit" value="Register">
			</div>
		</form>
	</div>


</body>
</html>