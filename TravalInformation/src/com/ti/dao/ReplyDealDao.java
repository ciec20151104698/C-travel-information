package com.ti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ti.bean.ArticleBean;
import com.ti.util.DBUtil;

public class ReplyDealDao {

	public String ContentAdd(String host_article_id,String reply_id,String reply_title, String reply_content) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "insert into tb_article(user_id,article_title,article_content,user_type) values (?,?,?,?)";
		String idset = "UPDATE tb_article SET article_id=(SELECT id from (SELECT * FROM tb_article)AS temp WHERE article_id=? and user_type=?) WHERE user_id = ? and article_title=?and article_content=?";
		String temp = "NO";
		PreparedStatement pstm = null;
		PreparedStatement pstm_idset = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, reply_id);
			pstm.setString(2, reply_title);
			pstm.setString(3, reply_content);
			pstm.setString(4, "reply");
			pstm.executeUpdate();
			
			pstm_idset = conn.prepareStatement(idset);
			pstm_idset.setString(1, host_article_id);
			pstm_idset.setString(2,"master");
			pstm_idset.setString(3, reply_id);
			pstm_idset.setString(4, reply_title);
			pstm_idset.setString(5, reply_content);
			pstm_idset.executeUpdate();
			
			temp = "YES";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.CloseDB(conn, pstm, rs);
		}
		return temp;
	}

	public List selectReply(String article) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_article where article_id=? and user_type =?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<ArticleBean> list = new ArrayList<ArticleBean>();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,article);
			pstm.setString(2,"reply");
			rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String article_id = rs.getString("article_id");
				String article_title = rs.getString("article_title");
				String article_content = rs.getString("article_content");
				String user_id = rs.getString("user_id");
				ArticleBean tl = new ArticleBean();
				tl.setArticle_id(article_id);
				tl.setArticle_title(article_title);
				tl.setArticle_content(article_content);
				tl.setUser_id(user_id);
				list.add(tl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.CloseDB(conn, pstm, rs);
		}
		return list;
	}
	public List selectArticle() {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_article where user_type =?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<ArticleBean> list = new ArrayList<ArticleBean>();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "master");
			rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String article_id = rs.getString("article_id");
				String article_title = rs.getString("article_title");
				String article_content = rs.getString("article_content");
				String user_id = rs.getString("user_id");
				ArticleBean tl = new ArticleBean();
				tl.setArticle_id(article_id);
				tl.setArticle_title(article_title);
				tl.setArticle_content(article_content);
				tl.setUser_id(user_id);
				list.add(tl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.CloseDB(conn, pstm, rs);
		}
		return list;
	}
	public ArticleBean selecthost(String article) {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_article where article_id=? and user_type =?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArticleBean tl = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, article);
			pstm.setString(2, "master");
			rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String article_id = rs.getString("article_id");
				String article_title = rs.getString("article_title");
				String article_content = rs.getString("article_content");
				String user_id = rs.getString("user_id");
				tl = new ArticleBean();
				tl.setArticle_id(article_id);
				tl.setArticle_title(article_title);
				tl.setArticle_content(article_content);
				tl.setUser_id(user_id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.CloseDB(conn, pstm, rs);
		}
		return tl;
	}
}
