package ch21_JDBC;

import java.util.List;
import java.util.Scanner;

public class MotorManage {
	MotorDAO dao = new MotorDAO();
	void delete() {
		Scanner scan =new Scanner(System.in);
		System.out.print("삭제할 차량번호를 입력하세요(띄어쓰기X) : ");
		String li_number = scan.nextLine();
		int result = dao.deleteMotor(li_number);
		if(result == 1) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("차량번호를 확인하세요.");
		}
	}// end delete()
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("차량번호를 입력하세요(띄어쓰기X) : ");
		String li_number = scan.nextLine();
		System.out.print("제조사 : ");
		String company = scan.nextLine();
		System.out.println("제조년도 : ");
		int year = scan.nextInt();
		System.out.println("연비 :");
		int eff = scan.nextInt();
		MotorDTO dto = new MotorDTO(li_number, company, year, eff);
		dao.insertMotor(dto);
	}  //insert()
	
	void list() {
		List<MotorDTO> items = dao.ListMotor();  
		System.out.println("번호\t\t연도\t제조사\t연비");
		System.out.println("=====================================");
		for(MotorDTO dto:items) {
			System.out.print(dto.getLi_number()+"\t\t");
			System.out.print(dto.getYear()+"\t");
			System.out.print(dto.getCompany()+"\t");
			System.out.print(dto.getEff()+"\n");
		}  //end for()
		
	}  //end list()
	
	void search() {
		MotorManage mm =new MotorManage();
		Scanner scan = new Scanner(System.in);
		System.out.print("차량번호를 입력하세요: ");
		String li_number = scan.next();
		MotorDAO dao = new MotorDAO();
		MotorDTO dto = dao.search(li_number);
		mm.print(dto);
		
	}
	
	
	void print(MotorDTO dto) {
		System.out.println("=================================");
		System.out.println("차량번호 : "+dto.getLi_number());
		System.out.println("연도 : "+dto.getYear());
		System.out.println("제조사 : "+dto.getCompany());
		System.out.println("연비 : "+dto.getEff());
		System.out.println("=================================");
	}

	
	public static void main(String[] args) {
		MotorManage car = new MotorManage();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("작업을 선택하세요 (1:목록 2:추가 3:삭제 4:조회0:종료) : ");
			int code =scan.nextInt();
			switch(code) {
			case 0:
				scan.close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 1:
				car.list(); break;
			case 2:
				car.insert(); break;
			case 3:
				car.delete(); break;
			case 4:
				car.search();break;
			default :
				System.out.println("잘못입력하였습니다."); break;
			}  //end switch
		}  //end while
	}  //end main
	

}
