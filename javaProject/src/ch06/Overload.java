package ch06;

public class Overload {

	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("java");

	}

	static void print(String str) {
		System.out.println(str);
		
	}

	static void print(double d) {
		System.out.println(d);
		
		
		
	}

	static void print(int i) {
		System.out.println(i);
		
		
	}
//	static void print(Object obj) {  //파라미터를 object로 하면 메소드 1개로 처리가 가능하지만 속도가 현저히 떨어진다(최상위 클래스임)
//		System.out.println(obj);
//	}

}
