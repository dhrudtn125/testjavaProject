package ch11;

public class AbstractExtends extends AbstractClass {
	// 추상클래스를 상속 받을경우 추상메소드를 항상 오버라이딩 해주어야 한다. 
	@Override
	void method1() {
		System.out.println("추상method를 완성한 메소드");
	}
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
//		AbstractClass a = new AbstractClass();  추상클래스는 인스턴스를 만들수 없음
		ex.method1();
		ex.method2();
	}

}
