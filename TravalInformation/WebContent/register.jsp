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



<!-- Facebook and Twitter integration 
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<!--link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'-->

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript">
function changeValidateCode() {
	document.getElementById("validateCode").src = "ValidateCodeServlet?rand="
		+ Math.random();
}</script>
</head>
<body class="style-3">

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-push-8">


				<!-- Start Sign In Form -->
				<form action="RegisterServlet" class="fh5co-form animate-box"
					data-animate-effect="fadeInRight">
					<h2>Sign Up</h2>
					<div class="form-group">
						<div class="alert alert-success" role="alert">Your info has
							been saved.</div>
					</div>
					<div class="form-group">
						<label for="name" class="sr-only">ID</label> <input type="text"
							class="form-control" id="name" name="username" placeholder="请输入用户名"
							autocomplete="off">
					</div>
					<div class="form-group">
						<label for="name" class="sr-only">Name</label> <input type="text"
							class="form-control" id="small_name" name="name" placeholder="请输入昵称"
							autocomplete="off">
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">Password</label> <input
							type="password" class="form-control" id="password" name="password"
							placeholder="请输入密码" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="re-password" class="sr-only">Re-type Password</label>
						<input type="password" class="form-control" id="re-password" name="repassword"
							placeholder="请再次输入密码" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">Gender</label> <input
							type="email" class="form-control" id="email" placeholder="请输入性别" name="sex"
							autocomplete="off">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">Email</label> <input
							type="email" class="form-control" id="email" placeholder="请输入邮箱" name="email"
							autocomplete="off">
					</div>
					<div class="form-group">
						<label for="name" class="sr-only">Verify</label> <input type="text"
							class="form-control" id="verifyCode" name="verifyCode" placeholder="请输入验证码"
							autocomplete="off">
						<span>
							<img src="ValidateCodeServlet"
							id="validateCode" title="点击换一换" onclick="changeValidateCode()">
							<a href="javascript:changeValidateCode();">看不清？</a>
						</span>
					</div>
					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember">
							Remember Me</label>
					</div>
					<div class="form-group">
						<p>
							Already registered? <a href="index3.html">Sign In</a>
						</p>
					</div>
					<div class="form-group">
						<input type="submit" value="Sign Up" class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->


			</div>
		</div>
		<div class="row" style="padding-top: 60px; clear: both;">
			<div class="col-md-12 text-center">
				<p>
					<small>&copy; All Rights Reserved. More Template</small>
				</p>
			</div>
		</div>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>

</body>
</html>