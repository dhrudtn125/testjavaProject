package ch10;

public class Overload {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Overload o = new Overload();
		o.putData("Hello");
		o.putData(10);
		o.putData(20.0);
	}

}
