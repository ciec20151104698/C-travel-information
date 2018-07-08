package com.ti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ti.bean.UserBean;
import com.ti.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("username");
		String user_pwd = request.getParameter("password");
		String check_two = "";
		
//		logincheck不如twice实用     取其中元素判断的话，若输入错误的用户名或密码，logincheck容易在dao中给name赋值时因无法取值而报错
//		UserBean user = new UserBean();
//		UserService check = new UserService();
//		user = check.logincheck(user_id,user_pwd);
		
		UserService checktwice = new UserService();
		check_two = checktwice.loginchecktwice(user_id,user_pwd);
		
		if(check_two=="YES") {
			UserService selectinfo = new UserService();
			UserBean userinfo = selectinfo.selectinfo(user_id);
			request.setAttribute("USER",userinfo);
			request.getSession().setAttribute("USER",userinfo);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			out.print("<script type='text/javascript'>");
			out.print("alert('用户名或密码错误~囧~');");
			out.print("window.location='login.jsp';");
			out.print("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
