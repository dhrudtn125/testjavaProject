package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법이 비슷 하지만 좀 더 가볍고 속도가 빠름
public class ListExam {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
			
		}
		System.out.println();
		list.add(3,4);
		System.out.println("추가 후:");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		list.remove(0);
		//삭제
		System.out.println("삭제 후: ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		
	}

}
