package ch06;

import java.math.MathContext;

public class Abs {
	//절대값 계산
	static int abs(int num) {
		return num>0 ? num : -num;  //-15가 들어오면 -num이 실행 (15)값이 나옴
	}

	public static void main(String[] args) {
		int a=-15;
		System.out.println(a);
		System.out.println(abs(a));  //call by value
		System.out.println(Math.abs(a));  //Math라는 클래스 내부의 abs()라는 같은 이름의 메소드 호출

	}

}
