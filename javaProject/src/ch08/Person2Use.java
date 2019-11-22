package ch08;

public class Person2Use {
	public static void main(String[] args) {
		Person2 p1 = new Person2() ;
		p1.showInfo();
		
		Person2 p2 = new Person2("김철수");
		p2.showInfo();
		
		Person2 p3 = new Person2("박지성",40) ;
		p3.showInfo();
		
		Person2 p4 = new Person2("박찬호",50,"미국 LA") ;
		p4.showInfo();
	}

}
