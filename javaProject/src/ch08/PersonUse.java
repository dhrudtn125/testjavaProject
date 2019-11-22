package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.showInfo();
		
		Person p2 = new Person("김상범");
		p2.showInfo();
		
		Person p3 = new Person("박찬호",185);
		p3.showInfo();
		
		Person p4 = new Person("박지성",175,72);
		p4.showInfo();
	}

}
