package ch06;

public class Test {
	static void print(double a) {
		System.out.println(a);
	}
	static void print(String a) {
		System.out.println(a);
	}
	static void print(String a,String b) {
		System.out.print(a+"\t");
		System.out.println(b);
	}
	static void print(int a) {
		System.out.println(a);
	}
	public static void main(String[]args) {
		print(10.5);
		print("hello");
		print(100);
		print("hello","bye");
	}

}
