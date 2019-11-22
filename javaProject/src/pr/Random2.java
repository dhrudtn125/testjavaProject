package pr;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[]args) {
		Random generator = new Random();
		Scanner scan =new Scanner(System.in);
		
		
		int sum=0;
		System.out.print("난수의 개수 : ");
		int count =scan.nextInt();
		
		for(int i=1;i<=count;i++) {
			
			
			int number = generator.nextInt(1000);
			System.out.println("생성된 난수는 : "+number);
			sum +=number;
		}
		System.out.print("난수"+count+"개의 합은"+sum);
	}

}
