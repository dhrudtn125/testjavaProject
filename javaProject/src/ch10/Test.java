package ch10;

public class Test {
	static int a;
	int b;
	
	void print() {  // non static method 에서는 static 과 non static 가리지 않음
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(b);
		Test t1 = new Test();
		t1.print();
//		t1= null;//객체가 주소를 잃고 떠돌아다님
		System.out.println(t1.b);
		}
}
