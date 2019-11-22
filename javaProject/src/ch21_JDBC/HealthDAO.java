package ch21_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class HealthDAO {
	
	public HealthDTO search(String id) {
		HealthDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.dbConn();
			String sql = "SELECT id,NAME,age,height,weight,(weight/((height/100)*(height/100))) bmi FROM health where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				double weight = rs.getDouble("weight");
				double bmi = rs.getDouble("bmi");
				dto = new HealthDTO(id, name, age, height, weight, bmi);
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
		}//end finally
		return dto;
	}//end search
}
