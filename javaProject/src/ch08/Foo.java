package ch08;

public class Foo {
	//멤버 변수
	int a;
	double b;
	
	public Foo() {  //기본 생성자 
		this(1);  //다른 생성자 호출, 제일 첫라인에서 호출 해야한다
		int c= 1;  //로컬 변수
	}

	public Foo(int x) {
		a = x;  // 멤버변수 = 로컬변수
		b = 20.0;
	}
	
	public void print() {
		System.out.println("a= "+a+"b= "+b);
	}

}
