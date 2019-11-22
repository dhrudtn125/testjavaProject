package ch21_JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//DAO :Data Access Object, 데이터 처리(DB)를 담당하는 클래스 
//핵심적인 비지니스 로직 처리, 주로 데이터베이스 연동 관련 작업,back-end
//cf) front-end 화면 처리
public class CarDAO {
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
	}// end dbConn()
	//Car 테이블의 레코드들을 ArrayList로 리턴하는 코드 
	
	public List<CarDTO> listCar(){
		List<CarDTO> items = new ArrayList(); //다형성
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//db실행
			conn = dbConn();
			//sql실행
			String sql = "select*from car";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {  //다음 레코드가 존재하면 진행
				String license_number=rs.getString("license_number");
				String company = rs.getString("company");
				String type = rs.getString("type");
				int year = rs.getInt("year");
				int efficiency = rs.getInt("efficiency");
				CarDTO dto = new CarDTO(license_number, company, type, year, efficiency);
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {  //DB연동 관련 리소스 정리
			//open(Connection => Statement => ResultSet)
			//close(ResultSet =>Statement => Connection)
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
	public void insertCar(CarDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn=dbConn();
			String sql = "INSERT INTO car(license_number,company,TYPE,YEAR,efficiency)\r\n " + 
					" VALUES(?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getLicense_number());
			pstmt.setString(2, dto.getCompany());
			pstmt.setString(3, dto.getType());
			pstmt.setInt(4, dto.getYear());
			pstmt.setInt(5, dto.getEfficiency());
			pstmt.executeUpdate(); //sql 실행
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
			
		}//finally()
	}//insertCar()
	
	public int deleteCar(String license_number) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt=null;
		 try {
			conn = dbConn();
			String sql = "delete from car Where license_number=?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, license_number);
			// affected rows(영향을 받은 레코드 수)
			result =pstmt.executeUpdate();  //result 값은 정상삭제가 되었다면 1,삭제가 안되었다면 0이 return
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
	}  //end deleteCar

}
