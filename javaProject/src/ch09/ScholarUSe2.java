package ch09;

public class ScholarUSe2 {
	
	public static void main(String[] args) {
		Scholar2 s1 = new Scholar2();
		System.out.println("--------------------------------------------");
		s1.input("김철수", "20190926", "컴공", 1, "A");
		s1.print();
		s1.input("홍길동", "20170814", "전산", 3);
		s1.print2();
		s1.input("홍길동", "20180814");
		s1.print3();
		System.out.println("--------------------------------------------");
	}

}
