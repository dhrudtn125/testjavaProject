package ch06;

public class CallEx {
    static void test(int b) {  //int 타입의 b를 매개변수 arguments, parameter
		System.out.println("test method 호출");
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		System.out.println("시작");
		int a=10;
		test(a);
		System.out.println("끝");
		

	}

}
