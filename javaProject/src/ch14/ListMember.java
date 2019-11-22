package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		//Member 인스턴스 생성
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPassword("1234");
		m1.setTel("010-1234-5678");
		m1.setEmail("kim@gmail.com");
		
		//List에 Member 인스턴스 추가
		
		list.add(m1);  //ArrayList에 Member객체를 추가
		
		System.out.println(list.size());
		
		Member m2 = new Member("hong", "1234", "홍길동", "02-989-9999", "hong@gmail.com");
		
		list.add(m2);
		list.add(new Member("choi", "1234", "최철수", "010-1234-5678", "choi@gmail.com"));
		System.out.println(list.size());   //list에 3개의 객체를 썻기에 3
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0;i<list.size();i++) {
			Member m = list.get(i);  //ArrayList의 각데이터를 가리킬 임시 참조변수
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPassword()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
		
		
		
	}

}
