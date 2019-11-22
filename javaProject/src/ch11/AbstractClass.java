package ch11;

public abstract class AbstractClass {  //추상 클래스 (추상메소드를 하나라도 사용하려면 abstract를 사용해야 한다)
	abstract void method1();  //추상 메소드(method body 가 없고 ;으로 끝나는 메소드)
	void method2() {  //일반 메소드 (완성된 메소드)
		System.out.println("완성된 method");
	}

}
