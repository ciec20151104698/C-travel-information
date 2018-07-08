package com.ti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ti.service.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String user_id = request.getParameter("username");
		String user_name = request.getParameter("name");
		String user_pwd = request.getParameter("password");
		String user_repwd = request.getParameter("repassword");
		String user_sex = request.getParameter("sex");
		String user_email = request.getParameter("email");
		String verifycode = request.getParameter("verifyCode");
		String sessionValidateCode = (String) request.getSession().getAttribute("SESSION_VALIDATECODE");
		PrintWriter out = response.getWriter();

		UserService useradd = new UserService();
		String check = "";
		//两次密码验证
		if (user_pwd.equals(user_repwd)) {
			//验证码验证
			if (!sessionValidateCode.equals(verifycode)) {
				out.print("<script type='text/javascript'>");
				out.print("alert('验证码错误');");
				out.print("window.location='register.jsp';");
				out.print("</script>");
			} else {
				check = useradd.infoadd(user_id, user_name, user_pwd,user_sex,user_email);
				//注册验证
				if (check == "YES") {
					response.sendRedirect("index.jsp");
				} else {
					out.print("<script type='text/javascript'>");
					out.print("alert('Error');");
					out.print("window.location='register.jsp';");
					out.print("</script>");
				}
			}

		} else {
			out.print("<script type='text/javascript'>");
			out.print("alert('两次密码不一致');");
			out.print("window.location='register.jsp';");
			out.print("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
