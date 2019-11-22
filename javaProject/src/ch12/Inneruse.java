package ch12;

public class Inneruse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {  //new 생성자 (){  };  => 무명클래스

			@Override
			public void takeOff() {
				System.out.println("takeOff");
				
			}

			@Override
			public void fly() {
				System.out.println("fly");
				
			}

			@Override
			public void land() {
				System.out.println("land");
				
			}
			
		};  //무명 내부 클래스
		f.takeOff();
		f.fly();
		f.land();
	}  //end main()

}
