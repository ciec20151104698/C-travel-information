<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.ti.dao.ReplyDealDao,com.ti.bean.ArticleBean"%>
<%@page import="com.ti.bean.UserBean"%>
<%UserBean user = (UserBean)request.getSession().getAttribute("USER");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style_list.css" rel="stylesheet" type="text/css">
</head>

<script>
	function windowHeight() {
		var de = document.documentElement;
		return self.innerHeight || (de && de.clientHeight)
				|| document.body.clientHeight;
	}
	window.onload = window.onresize = function() {
		var wh = windowHeight();
		document.getElementById("xt-left").style.height = document
				.getElementById("xt-right").style.height = (wh - document
				.getElementById("xt-top").offsetHeight)
				+ "px";
	}
</script>

<body bgcolor="#4a77d4">
	
		<div id="xt-right">
			<div class="xt-fenye">
				<div class="xt-fenye-left">欢迎进入问题反馈区</div>
				<div class="xt-fenye-right"><a href="NewContent.jsp" class="xt-link">提出问题</a></div>
			</div>
			<div class="xt-table">
				<table cellpadding="0" cellspacing="0" border="0" bgcolor="#dcdcdc"
					width="100%">
					<tr>
						<th>发布者</th>
						<th colspan="7">问题</th>
						<th colspan="2">当前固定时间</th>
					</tr>
					<%
						ReplyDealDao dao = new ReplyDealDao();
						List<ArticleBean> list = dao.selectArticle();
						for (ArticleBean tl : list) {
							String article_id = tl.getArticle_id();
					%>
					<tr class="xt-bg" onClick="window.location.href='reply.jsp?article_id=<%=article_id%>'">
						<td><%=tl.getUser_id()%></td>
						<td colspan="7"><%=tl.getArticle_title()%></td>
						<td colspan="2">当前固定时间</td>
					</tr>
					<%
						}
					%>

				</table>
			</div>
			<div class="xt-fenye">
				<div class="xt-fenye-left">当前第 1 / 270 页,每页10条，共 2696条记录</div>
				<div class="xt-fenye-right">
					<a href="#">首页</a> <a href="#">上一步</a> <a href="#">下一步</a> <a
						href="#">尾页</a> <input type="text" name="text" /> <a href="#"
						class="xt-link">跳转</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>