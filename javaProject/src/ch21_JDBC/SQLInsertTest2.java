package ch21_JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class SQLInsertTest2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("e:\\db2.prop");
		Properties prop = new Properties();
		prop.load(fis);
		
		String driver = prop.getProperty("diver");
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		
		System.out.println("driver: "+driver);
		System.out.println("url : "+url);
		System.out.println("id : "+id);
		System.out.println("password : "+password);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Class.forName(driver);
			conn=DriverManager.getConnection(url, id, password);
			String tilte = "MySQL 기초";
			String year = "2016";
			String publisher = "영진";
			int price = 20000;
			
			String sql = "INSERT INTO books(title,publisher,year,price)\r\n" + 
					"VALUES (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, tilte);
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate();
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
