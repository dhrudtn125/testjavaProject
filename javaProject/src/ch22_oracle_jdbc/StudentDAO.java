package ch22_oracle_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class StudentDAO {
	
	public Vector<StudentDTO> ListStu(){
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn = DB.hrConn();
			StringBuilder sb = new StringBuilder();
			sb.append("select*from student");
			sb.append(" order by studno");
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector row = new Vector();
				int studno = rs.getInt("studno");
				String name = rs.getString("name");
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
