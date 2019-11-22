package ch050;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int sum=0;
		int study;
		Scanner scan= new Scanner(System.in);
		System.out.print("성적 처리할 학생수를 입력하시오 : ");
		study =scan.nextInt();
		int[] scores = new int[study];
		for(int i=0;i<scores.length;i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i]=scan.nextInt();
		}
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		}
		System.out.println("총점은 "+sum+"평균 점수는 "+sum/scores.length+"입니다.");
		

	}

}
