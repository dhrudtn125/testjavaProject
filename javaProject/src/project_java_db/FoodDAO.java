package project_java_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21_JDBC.DB;
import ch22_oracle_jdbc.EmpDTO;

public class FoodDAO {
	
	public Vector listFood(FoodDTO2 dto2){
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.oraConn();
			String sql = "select*from Stuff";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("foodname"));
				row.add(rs.getString("price"));
				row.add(rs.getInt("kind"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
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
	public Vector listFoodRice(FoodDTO2 dto2){
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.oraConn();
			String sql = "select*from Stuff where kind=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("foodname"));
				row.add(rs.getString("price"));
				row.add(rs.getInt("kind"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
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
	public Vector listFoodNoodle(FoodDTO2 dto2){
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.oraConn();
			String sql = "select*from Stuff where kind=2";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("foodname"));
				row.add(rs.getString("price"));
				row.add(rs.getInt("kind"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
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
	public Vector listFoodSide(FoodDTO2 dto2){
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.oraConn();
			String sql = "select*from Stuff where kind=3";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("foodname"));
				row.add(rs.getString("price"));
				row.add(rs.getInt("kind"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
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
	
	public static int deleteFood(String foodname) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "delete from stuff where foodname=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, foodname);
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
	public int insertFood(FoodDTO2 dto2) {
		int result = 0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			String sql="INSERT INTO stuff VALUES (?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto2.getFoodname());
			pstmt.setInt(2, dto2.getPrice());
			pstmt.setInt(3, dto2.getKind());
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
	
	public int updateFood(FoodDTO2 dto2) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "update stuff set "
					+ "  price=? ,kind=? where foodname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto2.getPrice());
			pstmt.setInt(2, dto2.getKind());
			pstmt.setString(3, dto2.getFoodname());
			result=pstmt.executeUpdate();
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
	
	public Vector searchFood(String foodname) {
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=DB.oraConn();
			String sql = "select foodname,price,kind "
					+ " from stuff where foodname like ? order by kind";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+foodname+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("foodname"));
				row.add(rs.getInt("price"));
				row.add(rs.getInt("kind"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
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
	
	

}
