package ch07;

public class Car {
	String color;
	int speed;
	int gear;
	
	@Override  //상속개념
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;  //멤버변수에 로컬변수 초기화
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	
	

}
