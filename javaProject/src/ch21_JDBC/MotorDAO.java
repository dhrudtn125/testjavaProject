package ch21_JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MotorDAO {
	public Connection dbConn() {
		Connection conn=null;
		try {
			FileInputStream fis = new FileInputStream("e:\\db.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return conn;
	}
	public List<MotorDTO> ListMotor(){
		List<MotorDTO> items = new ArrayList();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = dbConn();
			String sql ="select*from motor";
			pstmt = conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				String li_number = rs.getString("li_number");
				String company = rs.getString("company");
				int year = rs.getInt("year");
				int eff = rs.getInt("eff");
				MotorDTO dto = new MotorDTO(li_number, company, year, eff);
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally { 
			try {
				if(rs!=null) rs.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return items;
	}
	
	public void insertMotor(MotorDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dbConn();
			String sql = "INSERT INTO motor(li_number,company,YEAR,eff) "
					+ " VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getLi_number());
			pstmt.setString(2, dto.getCompany());
			pstmt.setInt(3, dto.getYear());
			pstmt.setInt(4, dto.getEff());
			pstmt.executeUpdate();
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
		}//end finally()
		
	}//end insertMotor()
	
	public int deleteMotor(String li_number) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dbConn();
			String sql = "select motor where li_number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, li_number);
			result = pstmt.executeUpdate();
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
			
		}  //end finally
		return result;
	}
	
	public MotorDTO search(String li_number) {
		MotorDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=DB.dbConn();
			String sql = "select *from Motor where li_number =?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, li_number);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				String company = rs.getString("company");
				int year = rs.getInt("year");
				int eff = rs.getInt("eff");
				dto = new MotorDTO(li_number, company, year, eff);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally { 
			try {
				if(rs!=null) rs.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

}
