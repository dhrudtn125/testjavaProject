package ch11;

public class Computer implements Contrallable {

	@Override
	public void turnOn() {
		System.out.println("Computer를 켠다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끈다.");

	}

}
