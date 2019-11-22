package ch07;

public class AddressTest2 {

	public static void main(String[] args) {
		Address Ad = new Address();
		Ad.name="오경수";
		Ad.num="010-2462-3441";
		Ad.setAge(25);
		int j = Ad.getAge();
		Ad.print();

	}

}
