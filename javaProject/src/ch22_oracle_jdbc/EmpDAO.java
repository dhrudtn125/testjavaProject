package ch22_oracle_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import ch21_JDBC.DB;

public class EmpDAO {
	
	public static int deleteEmp(String ename) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.dbConn();
			String sql = "delete from emp where ename=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ename);
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
	
//	public static List<EmpDTO> listEmp(){
//		List<EmpDTO> items = new ArrayList<>();
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			conn =DB.dbConn();
//			String sql = "select*from emp";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				int empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//				Date hiredate = rs.getDate("hiredate");
//				int sal = rs.getInt("sal");
//				EmpDTO dto =new EmpDTO(empno, ename, hiredate, sal);
//				items.add(dto);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(rs!=null)rs.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			try {
//				if(pstmt!=null) pstmt.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			try {
//				if(conn!=null) conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		return items;
//	}
	public int insertEmp(EmpDTO dto) {
		int result = 0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="INSERT INTO emp VALUES (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
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
	public int updateEmp(EmpDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.dbConn();
			String sql = "update emp set "
					+ " ename=?, hiredate=?, sal=? where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEname());
			pstmt.setDate(2, dto.getHiredate());
			pstmt.setInt(3, dto.getSal());
			pstmt.setInt(4, dto.getEmpno());
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
	public Vector searchEmp(String ename) {
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=DB.dbConn();
			String sql = "select empno,ename,hiredate,sal "
					+ " from emp where ename like ? order by empno";
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ename+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getInt("empno"));
				row.add(rs.getString("ename"));
				row.add(rs.getDate("hiredate"));
				row.add(rs.getInt("sal"));
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
	
	public Vector listEmp() {
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.dbConn();
			String sql = "select empno,ename,hiredate,sal "
					+ " from emp order by empno";
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getInt("empno"));
				row.add(rs.getString("ename"));
				row.add(rs.getDate("hiredate"));
				row.add(rs.getInt("sal"));
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
