package ch09;

class CarSpeed {
	public int getSpeed() {
		return 0;
	}
}

class BMWCar extends CarSpeed{
	public int getSpeed() {
		return 300;
	}
}

class BENZCar extends CarSpeed{
	public int getSpeed() {
		return 280;
	}
}

class AUDICar extends CarSpeed{
	public int getSpeed() {
		return 310;
	}
}
public class CarMajor {
	public static void main(String[] args) {
		BMWCar c1 = new BMWCar();
		BENZCar c2 = new BENZCar();
		AUDICar c3 = new AUDICar();
		
		System.out.println("BMW: "+c1.getSpeed()+"km");
		System.out.println("BENZ: "+c2.getSpeed()+"km");
		System.out.println("AUDI: "+c3.getSpeed()+"km");
	}
	
	

}
