package ch02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;//원주율
		double radius = 10.0;//반지름은 10cm
		double area;//원의 면적
		
		area = radius*radius*PI;//원의 면적을 구하는 공식은 반지름 제곱 곱하기 원주율
		
		System.out.println("원의 면적은 "+area+"입니다.");
	}

}
