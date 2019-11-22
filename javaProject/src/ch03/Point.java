package ch03;

import java.util.Scanner;

//성적계산 프로그램
//국어,영어,수학 점수를 입력받아 총점, 평균 출력
public class Point {
	public static void main(String[] args) {
		//변수선언
		String name;
		int kor,eng,mat,tot;//국어점수,영어점수,수학점수,총점
		double avg;//평균
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = input.next();
		System.out.print("국어점수 : ");
		kor = input.nextInt();
		System.out.print("영어점수 : ");
		eng = input.nextInt();
		System.out.print("수학점수 : ");
		mat = input.nextInt();
		
		input.close();
		
		tot = kor + eng + mat;
		avg = tot /3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		//System.out.println(name + "\t" + kor +"\t" + eng+"\t" + mat+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f",name,kor,eng,mat,tot,avg);
	}

}
