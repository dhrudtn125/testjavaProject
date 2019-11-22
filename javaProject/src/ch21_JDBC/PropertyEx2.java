package ch21_JDBC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class PropertyEx2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt =null;
		ResultSet rs = null;
		try {
			FileInputStream fis = new FileInputStream("e:\\db2.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			System.out.println("driver : "+driver);
			System.out.println("url : "+url);
			System.out.println("id : "+id);
			System.out.println("password : "+password);
			prop.setProperty("dbName", "MySQL");
			FileOutputStream fos = new FileOutputStream("e:\\db2.prop");
			prop.store(fos, "propTest");
			System.out.println(" 변경된 내용이 성공적으로 저장 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e2) {
			    e2.printStackTrace();
			}
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
