package ch05;

import java.util.Scanner;

public class MenuMath {
	public static void main(String[]args) {
		int menu = 0;
		int num = 0;
		Scanner scanner =new Scanner(System.in);
		outer :  //라벨 처리
			while(true) {
				System.out.println("(1) square(제곱)");
				System.out.println("(2) square root(제곱근)");
				System.out.println("(3) log(로그)");
				System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
				String tmp =scanner.next();
				menu = Integer.parseInt(tmp);
				String tmp = scanner.next();  //화면에서 입력받은 내용을 tmp에 저장
				menu = Integer.parseInt(tmp);
			}for(;;) {
				System.out.println("계산할 값을 입력하세요"+"(계산종료: 0, 전체종료: 99");
			    tmp = scanner.next();
			    num = Integer.parseInt(tmp);
			    if(num==0)
			    	break;
			    if(num==99)
			    	break other;
			    switch(menu) {
			    }
			    
	}		
}
