package cn.edu.ujn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.edu.ujn.m.Xsb;

public class DBConn {
	String url="jdbc:mysql://localhost:3306/xscj?characterEncoding=utf-8";
	String user="root";
	String password="root";
	private Connection conn;
	private PreparedStatement pstmt;

	public DBConn() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean save(Xsb xs) {
		try {
			pstmt = conn.prepareStatement("insert into xsb(xh,xm,xb,zy_id,bz) values(?,?,?,?,?)");
			pstmt.setString(1, xs.getXh());
			pstmt.setString(2, xs.getXm());
			pstmt.setString(3, xs.getXb());
			pstmt.setInt(4, xs.getZyId());
			pstmt.setString(5, xs.getBz());
			int n=pstmt.executeUpdate();
			if (n>=1) {
				return true;
				
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	

}
