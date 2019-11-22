package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent2 {
	public static void main(String[] args) {
		
		List<Student2> list = new ArrayList<>();
		
		list.add(new Student2("2017001", "김철수", "Java", 90));
		
		list.add(new Student2("2016002", "홍길동", "JSP", 80));
		
		list.add(new Student2("2015003", "사임당", "DB", 70));
		
		Student2 s1 = new Student2();
		s1.setNum("2014004");
		s1.setName("이순신");
		s1.setSub("HTML");
		s1.setScore(95);
		
		list.add(s1);
		
		System.out.println("-------------------------------------------");
		System.out.println("학번\t이름\t과목\t점수");
		for(Student2 s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getSub()+"\t"+s.getScore());
		}
		System.out.println("-------------------------------------------");
	}

}
