package ch11;

public class Airplane implements Flyer{
       // 인터페이스를 상속 받으려면 구현(implements)키워드를 사용해야한다.
	@Override
	public void takeOff() {
		System.out.println("Airplain 이륙");	
	}

	@Override
	public void fly() {
		System.out.println("Airplan 비행");
	}

	@Override
	public void land() {
		System.out.println("Airplan 착륙");
	}
	
	

}
