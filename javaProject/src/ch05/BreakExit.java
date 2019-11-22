package ch05;

import java.util.Scanner;

public class BreakExit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"));  //exit 를 입력하면 반복종료
			//문자열 비교시 equals()사용
			break;
		}  //end while
		System.out.println("종료합니다....");
		scanner.close();

	}

}
