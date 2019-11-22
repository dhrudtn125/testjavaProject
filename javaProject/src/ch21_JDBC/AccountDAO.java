package ch21_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

	
	public int deleteAcc(String num) {
		int result =0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			 conn = DB.dbConn();
		     String sql ="delete from account where num = ?";
		     pstmt = conn.prepareStatement(sql);
		     pstmt.setString(1, num);
		     result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<AccountDTO> listAcc() {
		List<AccountDTO> items = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DB.dbConn();
			String sql = "select * from account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String bank = rs.getString("bank");
				String num = rs.getString("num");
				String name =  rs.getString("name");
				int money = rs.getInt("money");
				items.add(new AccountDTO(bank, num, name, money));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	
	public void insertAcc(AccountDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DB.dbConn();
			String sql = "INSERT INTO ACCOUNT VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBank());
			pstmt.setString(2, dto.getNum());
			pstmt.setString(3, dto.getName());
			pstmt.setInt(4, dto.getMoney());
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
		
	}

}
