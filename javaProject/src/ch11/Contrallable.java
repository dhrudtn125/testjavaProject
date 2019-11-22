package ch11;

public interface Contrallable {
	default void repair() {  //명시적 default 메소드로의 구현은 jdk8.0이상부터 가능
		System.out.println("장비를 수리한다.");
		
	}
	
	static void reset() {  //명시적으로 static 메소드로 의 구현이 가능 jdk8.0부터 가능
		System.out.println("장비를 초기화 한다.");
	}
	  //참고: private메소드로의 구현은 jdk9.0부터 가능, 실무에서는 아직 인터페이스에서 구현메소드를 사용안함
	void turnOn();
	void turnOff();
	

}
