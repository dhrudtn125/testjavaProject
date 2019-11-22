package ch22_oracle_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

 

public class QuestDAO {
	QuestDTO dto =new QuestDTO();
	
	public int deleteQue(String userid,String pwd) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "delete from quest where userid=? and pwd=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, pwd);
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
		}
		return result;
	}
	public int insertQue(QuestDTO dto) {
		int result = 0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			String sql="INSERT INTO quest(userid,name,pwd) VALUES (?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPwd());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return result;
	}
	
	public static Vector<QuestDTO> listQue(){
	Vector<QuestDTO> items = new Vector<>();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		conn =DB.oraConn();
		String sql = "select userid,name,clear_num from quest";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			String userid = rs.getString("userid");
			String name = rs.getString("name");
			int clear_num = rs.getInt("clear_num");
			QuestDTO dto =new QuestDTO(userid,name,clear_num);
			items.add(dto);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rs!=null)rs.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
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
	return items;
}
	public void getClear(QuestDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			String sql="update quest set clear_num=? where userid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,dto.getClear_num());
			pstmt.setString(2, dto.getUserid());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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