package ch10;

public class StaticMethod2 {
	static String name = "홍길동";
	static int age = 35;
	String num="010-1234-5678";
	public static void printA() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	public void printB() {
		System.out.println("전화번호: "+num);
	}
	public static void main(String[] args) {
		StaticMethod2 s = new StaticMethod2();
		System.out.println("--------------------------");
		printA();
		s.printB();
		System.out.println("--------------------------");
	}
}
