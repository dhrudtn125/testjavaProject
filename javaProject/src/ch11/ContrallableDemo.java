package ch11;

public class ContrallableDemo {
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		
		Contrallable.reset();  // static메소드는 new를 사용하지 않고 사용가능(클래스이름.메소드이름)
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Contrallable.reset();
		
		Notebook no =new Notebook();
		no.turnOn();
		no.turnOff();
		no.repair();
		Contrallable.reset();
		
	}

}
