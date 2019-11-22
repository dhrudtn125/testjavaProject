package pr;

import java.util.Scanner;

public class NumberTF {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("숫자를 입력 하세요 : ");
		number = input.nextInt();
		
		if(number > 0) {
		     System.out.println("양수입니다.");}
		if(number ==0) {
			 System.out.println("0 입니다.");}
		if(number < 0) {
			 System.out.println("음수 입니다.");}
		
		
	}

}
