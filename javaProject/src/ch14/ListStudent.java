package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		//new 를 할때마다 실제로 새로운 주소를 가진 생성자에 값이 처리된다.
		list.add(new Student("2017001", "김철수", "국사", 1, "박교수"));
		
		list.add(new Student("2016002", "홍길동", "영문", 2, "최교수"));
		
		list.add(new Student("2015003", "사임당", "전산", 3, "김교수"));
		
		System.out.println("학변\t이름\t전공\t학년\t지도교수");
		
		for(Student s: list) {  //향상된 for 문
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}

}
