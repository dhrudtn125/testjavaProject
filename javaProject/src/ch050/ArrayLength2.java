package ch050;

import java.util.Scanner;

public class ArrayLength2 {

	public static void main(String[] args) {
		int intArray[]= new int[3];
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하시오 : ");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=scan.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.println("총합 : "+sum+" 평균 : "+sum/intArray.length);

	}

}
