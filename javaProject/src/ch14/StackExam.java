package ch14;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		//Stack 구조 : LIFO( Last In First Out)
		String[] nation = {"한국","일본","중국","미국","영국"};
		Stack<String> s = new Stack<>();
		for(String str : nation) {
			s.push(str);  //Stack에 입력
		}
		System.out.println(s.pop());  //Stack에서 pop(출력)
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());  //데이터가 더이상 없어 에러
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());  //출력
		}
	}

}
