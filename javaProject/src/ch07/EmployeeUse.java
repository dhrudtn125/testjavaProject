package ch07;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.input("김철수", "관리자", "과장", 3000000);
		e1.calc();
		e1.print();
		
		Employee e2 = new Employee();
		System.out.println(e2);
		e2.input("홍길동", "전산부", "부장", 4000000);
		e2.calc();
		e2.print();
	}

}
