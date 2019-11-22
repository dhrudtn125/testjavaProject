package ch02;

import java.util.Scanner;

public class Rectangle_pr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w;
		double h;
		double area;
		double preimeter;
		
		
		System.out.print("사각형의 가로의 길이를 입력하시오 : ");
		w = input.nextDouble();
		System.out.print("사각형의 세로의 길이를 입력하시오 : ");
		h = input.nextDouble();
		area = w * h;
		preimeter = 2*( w + h );		
		System.out.println("사각형의 넓이는 : " + area + "입니다.");
		System.out.println("사각형의 둘레는 : " + preimeter + "입니다.");
		
	}

}
