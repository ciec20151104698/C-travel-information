package com.ti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ti.bean.UserBean;
import com.ti.service.ReplyService;

/**
 * Servlet implementation class ReplyServlet
 */
@WebServlet("/ReplyServlet")
public class ReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reply_title = request.getParameter("reply_title");
		String reply_content = request.getParameter("reply_content");
		String host_article_id = (String)request.getSession().getAttribute("HOSTARTICLEID");
		//String host_article_id = request.getParameter("article_id");
		//String host_article_id = (String)request.getAttribute("HOSTARTICLEID");
		//System.out.println(host_article_id+"servlet");
		UserBean user = (UserBean)request.getSession().getAttribute("USER");
		
		
		ReplyService replyadd = new ReplyService();
		String temp = "";
		temp = replyadd.content_add(host_article_id,user.getUser_name(),reply_title,reply_content);
		if(temp=="YES") {
			response.sendRedirect("noteList.jsp");
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
