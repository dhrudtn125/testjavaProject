package ch21_JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class MemberInsert {
	public static void main(String[] args) throws Exception{
//		String driver="oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String id = "java" ;
//		String password = "java1234";
		FileInputStream fis = new FileInputStream("e:\\oracle.prop");
		Properties prop = new Properties();
		prop.load(fis);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//Class.forName(driver);
			conn=DriverManager.getConnection(url, id, password);
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디: ");
			String userid = scan.nextLine();
			System.out.print("비밀번호: ");
			String passwd = scan.nextLine();
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String sql="insert into member(userid,passwd,name)" 
					+ "values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.executeUpdate();  //실행
			System.out.println("저장되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn!=null)conn.close();
			} catch (Exception e2) {	
				e2.printStackTrace();
			}
		}
		
	}

}
