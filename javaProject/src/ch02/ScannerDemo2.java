package ch02;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int sum;
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		a = input.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		b = input.nextInt();
	    sum = a+b;
		System.out.print("두 정수의 합은 : "+sum + "입니다.");
		
				
		

	}

}
