package ch11;

public class VehicleUse {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		Vehicle v = new Plane();
		v.speedUp();
		v.speedDown();
		v.handle();
		
		v = new Boat();
		v.speedUp();
		v.speedDown();
		v.handle();
		
	}

}
