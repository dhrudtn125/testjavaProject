package ch02;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double radius;
		double sum;
		System.out.print("원의 반지름을 입력 하시오 : ");
		radius = input.nextDouble();
		sum = (radius * radius) * PI; 
		System.out.println("원의 면적은 " + sum + "입니다.");
		

	}

}
