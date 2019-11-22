package ch15;

public class ExceptionExam {
	
	public static void main(String[] args) {
		int a=10, b=0, c;
		try {  //예외가 발생할 가능성이 있는코드
			c = a/b;  //분모에 0이있는 산술연산 => 예외상황이 발생
			System.out.println(c);
			
		} catch (Exception e) {  //잘모를땐 Exception만 해도 된다.
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();  //개발자용 디버깅 메소드
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
