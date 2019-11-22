package ch06;

public class Param {
	
	static int multi(int a,int b) {
		return a*b;
	}
	static int divide(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int n;
		n=multi(10,5);
		System.out.println("plus: "+n);
		n=divide(10,5);
		System.out.println("minus: "+n);

	}

}
