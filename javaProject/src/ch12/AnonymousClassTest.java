package ch12;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {  // 인터페이스는 new를 할수 없지만 익명클래스가 인터페이스를 상속을 받아 오버라이드 한다

			@Override
			public void turnOn() {
				System.out.println("TV turnOn");				
			}
			@Override
			public void turnOff() {
				System.out.println("TV turnOff");				
			}			
		};  //무명 내부 클래스(익명클래스)
		ac.turnOn();
		ac.turnOff();
	}  //end main()
}  //end AnonymousClassTest
