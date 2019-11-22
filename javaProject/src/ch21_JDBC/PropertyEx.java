package ch21_JDBC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

//중요정보를 소스에 직접 쓰게 되면 위험하기 때문에 별도의 Property 파일로 
//저장할 필요가 있다.
public class PropertyEx {
	public static void main(String[] args) {
		Connection conn = null; //DB접속 계체 
		PreparedStatement pstmt = null;  //SQL실행 객체
		ResultSet rs = null; //select쿼리의 결과셋을 탐색 및 리턴하는 객체
		try {
			//파일의 내용을 읽기 위한 객체
			FileInputStream fis = new FileInputStream("e:\\db.prop");
			//key=value 구조 (HashMap구조)로 저장된 파일을 읽거나 쓰기위한 객체 
			Properties prop = new Properties();
			prop.load(fis);  //파일의 내용을 읽어서 prop에 로딩
			System.out.println(prop);
			//값을 불러올때 : 프로퍼티객체이름.getPropertiy(변수명)
			String password = prop.getProperty("password");
			System.out.println("password : "+password);
			//값을 기록 할때 : 프로퍼티객체.setProperty("key","value")
			prop.setProperty("pwd", "java1234");
			FileOutputStream fos = new FileOutputStream("e:\\db.prop");
			//파일에 저장 : prop.store(출력스트림,주석)
			prop.store(fos, "test");
			//HashMap을 쓰기 때문에 저장할때 순서가 바뀔 수 있다.
			System.out.println("변경된 내용이 db.prop 파일에 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
