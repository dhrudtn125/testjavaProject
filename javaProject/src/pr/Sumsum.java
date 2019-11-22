package pr;

import java.util.Random;
import java.util.Scanner;

public class Sumsum {
	public static void main(String[] args) {
		int count;
		int sum =0;
		Random ram = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수:  ");
		count = scan.nextInt();
		for(int i=1;i<=count;i++) {
			int number =ram.nextInt(100);
			System.out.println("난수 : "+number);
			sum += number;
		}
		System.out.println("난수의 합은 "+sum);
	}

}
