package com.ti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ti.util.DBUtil;
import com.ti.bean.UserBean;

public class UserDao {

	public UserBean logincheck(UserBean temp) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql="select * from tb_user where user_id=? and user_pwd=?";
		PreparedStatement pstm =null;
		ResultSet rs = null ;
		UserBean user =null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,temp.getUser_id());
			pstm.setString(2,temp.getUser_pwd());
			rs = pstm.executeQuery();
			while(rs.next()) {
				user=new UserBean();
				user.setUser_id(rs.getString("user_id"));
				user.setUser_pwd(rs.getString("user_pwd"));
				user.setUser_name(rs.getString("user_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.CloseDB(conn,pstm,rs);
		}
		return user;
	}

	public String infoadd(UserBean newuser) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "insert into tb_user(user_id,user_pwd,user_name,user_sex,user_email,user_rank) values (?,?,?,?,?,?)";
		String temp = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,newuser.getUser_id());
			pstm.setString(2,newuser.getUser_pwd());
			pstm.setString(3,newuser.getUser_name());
			pstm.setString(4,newuser.getUser_sex());
			pstm.setString(5,newuser.getUser_email());
			pstm.setString(6,"1");
			pstm.executeUpdate();
			temp="YES";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.CloseDB(conn,pstm,rs);
		}
		return temp;
	}

	public String loginchecktwice(UserBean newuser) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_user where user_id=? and user_pwd=?";
		String temp = "NO";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,newuser.getUser_id());
			pstm.setString(2,newuser.getUser_pwd());
			rs = pstm.executeQuery();
			while(rs.next()) {
				temp="YES";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.CloseDB(conn,pstm,rs);
		}
		return temp;
	}

	public UserBean selectinfodao(String user_id) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_user where user_id=?;";
		UserBean user = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,user_id);
			rs = pstm.executeQuery();
			while(rs.next()) {
				user = new UserBean();
				user.setUser_id(rs.getString("user_id"));
				user.setUser_pwd(rs.getString("user_pwd"));
				user.setUser_name(rs.getString("user_name"));
				user.setUser_sex(rs.getString("user_sex"));
				user.setUser_email(rs.getString("user_email"));
				user.setUser_rank(rs.getString("user_rank"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.CloseDB(conn,pstm,rs);
		}
		return user;
	}

	public void update(UserBean temp) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "update tb_user SET user_name=?,user_sex=?,user_email=? WHERE user_id=?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(4,temp.getUser_id());
			pstm.setString(1,temp.getUser_name());
			pstm.setString(2,temp.getUser_sex());
			pstm.setString(3,temp.getUser_email());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.CloseDB(conn,pstm,rs);
		}
	}

}
