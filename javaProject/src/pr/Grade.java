package pr;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grade;
		char result;
		
		System.out.print("성적을 입력 하세요: ");
		grade = input.nextInt();
		
		if(grade >= 90) {
			result = 'A';
			System.out.println(result+"입니다.");}
		else if (grade>=80) {
			result = 'B';
			System.out.println(result+"입니다.");}
		else if(grade>=70) {
			result = 'c';
			System.out.println(result+"입니다.");}
		else if(grade<=69) {
			System.out.println("낙제 입니다.");
		}
		
		}

}
