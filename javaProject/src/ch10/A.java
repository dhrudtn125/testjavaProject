package ch10;

public class A {
	String name = "kim";  // non static member
	static int n = 20;  //static member
	
	public void print () {// non static member
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {  // static member
		int a = 10;  //지역변수
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		//A aa = new A();
		//System.out.println(name);
		System.out.println(n);
		//print();
		
	}

}
