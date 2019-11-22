package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		//SportsCar 객체는 Car객체를 상속 받았기 때문에 Car객체의 멤버들(멤버변수,멤버 메소드)를 모두 사용 할 수 있다.
		obj.speed = 10;//Car 의 멤버변수 speed에 10을 초기화
		obj.setSpeed(60);
		obj.setTurbo(true);
	}

}
