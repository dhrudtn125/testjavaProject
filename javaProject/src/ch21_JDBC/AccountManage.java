package ch21_JDBC;

import java.util.List;
import java.util.Scanner;

public class AccountManage {
	AccountDAO dao = new AccountDAO(); 
	void delete() {
		Scanner scan =new Scanner(System.in);
		System.out.print("삭제 하실 계좌번호를 입력하세요  : ");
		String num = scan.next();
		int result = dao.deleteAcc(num);
		
		if(result == 1) {
			System.out.println("삭제가 완료되었습니다.");
		}else {
			System.out.println("계좌번호를 확인하세요.");
		}
		
	}
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("은행 : ");
		String bank = scan.next();
		System.out.println("계좌번호 : ");
		String num = scan.next();
		System.out.println("예금주 : ");
		String name =scan.next();
		System.out.println("금액 : ");
		int money = scan.nextInt();
		AccountDTO dto = new AccountDTO(bank, num, name, money);
		dao.insertAcc(dto);
		System.out.println("저장되었습니다.");
	}
	
	void list() {
		List<AccountDTO> items = dao.listAcc();
		System.out.println("=====================================");
		System.out.println("은행\t계좌번호\t\t예금주\t금액");
		System.out.println("=====================================");
		for(AccountDTO dto : items) {
			System.out.print(dto.getBank()+"\t"); 
			System.out.print(dto.getNum()+"\t");
			System.out.print(dto.getName()+"\t");
			System.out.printf(String.format("%,d",dto.getMoney())+"\n");
			
		}
	}
	
	
	public static void main(String[] args) {
		AccountManage acc = new AccountManage();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("메뉴를 선택하세요(1:목록 2:계좌생성 3:계좌삭제 0:종료) : ");
			int code = scan.nextInt();
			switch(code) {
			case 0: System.out.println("종료합니다.");
			        System.exit(0); break;
			case 1: acc.list();break;
			case 2: acc.insert();break;
			case 3: acc.delete();break;
			default : System.out.println("잘못입력하였습니다 숫자를 확인하여 주세요.");
			}
		}
	}

}
