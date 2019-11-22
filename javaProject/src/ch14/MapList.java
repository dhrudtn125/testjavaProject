package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) {
		ArrayList<Student> list2= (ArrayList<Student>)map.get("list"); 
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();  //해쉬맵 객체 생성
		List<Student> list =new ArrayList<>();
		
		//리스트에 Student추가
		list.add(new Student("2017001", "kim", "국사", 1, "Park"));
		list.add(new Student("2017001", "choi", "영문", 1, "hong"));
		list.add(new Student("2017003", "lee", "전산", 1, "min"));
		
		map.put("list", list);  //맵에 리스트 추가
		
		print(map);  //압축파일처럼 list 안에 3개의 객체가 map에 담겨져 print()쪽에 매개변수화 되어 넘겨짐
		
	}

}
