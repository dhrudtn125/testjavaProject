package pr;

import java.util.Scanner;

public class OddPr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력 하세요 : ");
		number = input.nextInt();
		if(number%2 ==0){
			System.out.println("짝수 입니다.");}
		else{
			System.out.println("홀수 입니다.");}		
	}

}
