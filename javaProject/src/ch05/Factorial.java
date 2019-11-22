package ch05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;  //팩토리얼 값이 너무 커질 수 있어 long으로 정의
		//ex) 3! = 3x2x1
		int n;
		
		System.out.print("정수를 입력하시오 : ");
		Scanner input =new Scanner(System.in);
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact =fact*i;
		}
		System.out.printf("%d!은%d입니다.",n,fact);
		
		
	}

}
