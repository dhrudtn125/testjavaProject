package ch22_oracle_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	public static Connection getConn() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java";//오라클 접속 아이디
		String pwd = "java1234";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static int memberDelete(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			conn = getConn();
			String sql = "delete from member where userid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rows=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rows;
		
	}

}
