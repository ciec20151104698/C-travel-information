<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="css/style_list.css" rel="stylesheet" type="text/css">
<body bgcolor="#4a77d4">
<div class="xt-table">
		<form action="ReplyServlet" method="post">
		<table cellpadding="0" cellspacing="0" border="0" bgcolor="#dcdcdc"
			width="100%">
			
			<tr>
				<th colspan="7">问题提交</th>
			</tr>
			<tr class="xt-bg">
				<td>标题：</td>
				<td colspan="8"><input type="text" name="title"></td>
			</tr>
			<tr class="xt-bg">
				<td>内容：</td>
				<td colspan="8"><input type="text" name="submitcontent"></td>
			</tr>
			<tr class="xt-bg">
				<td colspan="9">
				<button type="submit" id="send">提交</button>
				</td>
			</tr>
			
		</table>
		</form>
	</div>

  </body>
</html>