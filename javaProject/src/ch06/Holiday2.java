package ch06;

import java.util.Scanner;

public class Holiday2 {
	static int y;
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("근속년수를 입력하세요 : ");
		y= scan.nextInt();
		scan.close();
	}
	static int holiDay(int year) {
		int day;
		if(year<=5)
			day = 10;
		else if(year<10)
			day = 15;
		else
			day= 20;
		return day;
	}
	static void print() {
		input();
		System.out.println("근속 "+y+"년"+"휴가는"+holiDay(y)+"일 입니다.");
	}
	public static void main(String[]args) {
		print();
	}

}
