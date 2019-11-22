package ch02;

import java.util.Scanner;

// 키보드로 부터의 사용자 입력 프로그램
public class ScannerDemo {
	public static void main(String[] args) {
		//Ctrl+Shift+0
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 정수값? ");
		int x = in.nextInt();//키보드로 입력한 값을 좌변에 초기화 함
		System.out.print("두번째 정수값? ");
		int y = in.nextInt();
		System.out.printf("%d x %d은 %d입니다.\n", x , y, x * y);
		
	}

}
