package ch21_JDBC;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class AddressManage {
	AddressDAO dao = new AddressDAO();
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이메일을 입력하세요 : ");
		String email = scan.next();
		int result = dao.deleteAdd(email);
		
		if(result == 1) {
			System.out.println("삭제가 완료 되었습니다.");
		}else {
			System.out.println("이메일을 다시한번 확인하세요.");
		}
		
	}
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("이메일: ");
		String email = scan.next();
		System.out.print("주소(띄어쓰기X): ");
		String addr = scan.next();
		System.out.print("연락처: ");
		String hp = scan.next();
		AddressDTO dto = new AddressDTO(email, name, addr, hp);
		dao.insert(dto);
		System.out.println("저장되었습니다.");
	}
	
	void list() {
		List<AddressDTO> items = dao.listAdd();
		System.out.println("==============================================");
		System.out.println("이름\t주소\t이메일\t\t연락처");
		System.out.println("==============================================");
		for(AddressDTO dto : items) {
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getEmail()+"\t");
			System.out.print(dto.getHp()+"\n");
		}
	}
	
	void update() {
		Connection conn =null;
		Scanner scan = new Scanner(System.in);
		System.out.print("정보를 수정할 이메일을 입력하세요 : ");
		String email = scan.next();
		int search = dao.searchAdd(email);
		
		if(search == 1) {
			
			
		}else {
			System.out.println("이메일을 다시한번 확인하세요.");
		}
	}
	
	
	public static void main(String[] args) {
		AddressManage add = new AddressManage();
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요(1:주소목록 2:주소추가 3:주소삭제 4:주소수정 0:종료): ");
		int code = scan.nextInt();
		switch(code) {
		case 0: System.out.println("종료되었습니다.");
		        System.exit(0); break;
		case 1: add.list();break;
		case 2: add.insert();break;
		case 3: add.delete();break;
		case 4: add.update();break;
		default : System.out.println("입력한 번호를 다시 확인해 주십시오.");
		}
		
	}

}
