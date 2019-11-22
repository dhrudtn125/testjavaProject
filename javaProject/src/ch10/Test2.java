package ch10;

class A2{
	void print() {
		System.out.println("a");
	}
}

class B extends A2{
	@Override
	void print() {
		super.print();
		System.out.println("b");
	}
}

public class Test2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.print();
		B b = new B();
		b.print();
	}

}
