package com.ti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ti.util.DBUtil;

public class ContentDealDao {

	public String ContentAdd(String user_name,String main_title, String main_content) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "insert into tb_article(user_id,article_title,article_content,user_type) values (?,?,?,?)";
		String idset = "UPDATE tb_article SET article_id=id WHERE article_title=? and article_content=?";
		String temp = "NO";
		PreparedStatement pstm = null;
		PreparedStatement pstm_idset = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, user_name);
			pstm.setString(2, main_title);
			pstm.setString(3, main_content);
			pstm.setString(4, "master");
			pstm.executeUpdate();
			
			pstm_idset = conn.prepareStatement(idset);
			pstm_idset.setString(1, main_title);
			pstm_idset.setString(2,main_content);
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

}
