package Test;

import java.util.Scanner;

public class SmallProject2 {

	public static void main(String[] args) {
		int menu;
		Scanner scan =new Scanner(System.in);
		System.out.println("== MENU ==");
		System.out.println("(1) 김치찌개 ");
		System.out.println("(2) 된장찌개");
		System.out.println("(3) 육개장");
		System.out.println("(4) 불고기");
			System.out.print("원하시는 메뉴(1~4)를 선택하세요: ");
			menu = scan.nextInt();
			other :
			
				do {
			switch(menu) {
			case 1:
				System.out.println("선택하신 메뉴는 1번 김치찌개 입니다."+"\n"+"종료");
				break other;
			case 2:
				System.out.println("선택하신 메뉴는 2번 된장찌개 입니다."+"\n"+"종료");
				break other;
			case 3:
				System.out.println("선택하신 메뉴는 3번 육개장 입니다."+"\n"+"종료");
				break other;
			case 4:
				System.out.println("선택하신 메뉴는 4번 불고기 입니다."+"\n"+"종료");
				break other;
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				break other;
			default:
				System.out.println("다시 선택하여 주십시오.");}}
				
			while(menu!=0);{
			}
			

					
	}
}
