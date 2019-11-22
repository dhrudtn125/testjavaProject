package ch05;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하시오 : ");
			int grade = scanner.nextInt();
			if(grade<0)
				break;
			total +=grade;
			count++;
		}
		System.out.println("평균은 "+total / count);
		scanner.close();

	}

}
