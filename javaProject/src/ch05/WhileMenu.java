package ch05;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 아메리카노");
			System.out.println("(2) 카페라떼");
			System.out.println("(3) 에스프레소");
			System.out.println("원하시는 메뉴(1~3)를 선택하세요 (종료 :0)>");
			String tmp = input.next();  //화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택 하셨습니다.(종료 : 0)");
				continue;
			}  //end else if
			
			    
			}
			System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");
		}  //end while
		input.close();
	}  //end main()

}
