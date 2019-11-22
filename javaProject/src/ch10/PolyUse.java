package ch10;

public class PolyUse {
	static int age=30;
	public static void print() {
		System.out.println("나이: "+age);
	}
	public static void main(String[] args) {
		Pa a = new Pa();
		Ch b = new Ch();
		System.out.println("=====================");
		a.print();
		print();
		b.print();
		System.out.println("=====================");
	}

}
