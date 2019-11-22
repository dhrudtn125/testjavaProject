package ch21_JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class MemberInsert2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("e:\\oracle.prop");
		Properties prop = new Properties();
		prop.load(fis);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		Connection conn =null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, id, password);
		    Scanner scan = new Scanner(System.in);
		    System.out.print("ID: ");
		    String userid = scan.nextLine();
		    System.out.print("PASSWORD: ");
		    String pwd = scan.nextLine();
		    System.out.print("NAME: ");
		    String name = scan.nextLine();
		    
		    String sql = "insert into member(userid,passwd,name) values(?,?,?)";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, userid);
		    pstmt.setString(2, pwd);
		    pstmt.setString(3, name);
		    System.out.println("저장되었습니다.");
		    pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
