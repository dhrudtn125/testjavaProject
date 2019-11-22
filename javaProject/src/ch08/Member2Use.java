package ch08;

public class Member2Use {
	public static void main(String[] args) {
		System.out.println("====================================================");
		Member2 m1 = new Member2();
		m1.input("김철수", "kims", "냉장고", 2000000);
		m1.getGrade();
		m1.print();
		
		Member2 m2 = new Member2("김철수","kims","컴퓨터",500000);
		m2.getGrade();
		m2.print();
		
		Member2 m3 = new Member2("라면",3000);
		m3.getGrade();
		m3.print();
		
	}

}
