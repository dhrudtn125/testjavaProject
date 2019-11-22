package ch06;

public class VoidExam {
	
	static void hello() {  //void :리턴값이 없을때 씀
		System.out.println("안녕하세요");
		return;  //리턴 값이 없을때 return,생략 가능
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();  //메소드 호출(method call)
		System.out.println("프로그램 끝");
	}

}
