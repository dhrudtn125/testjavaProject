package ch02;
/**
 * 과제 
 * 2019-09-05
 * 오경수
 * @author mr02-24
 */
public class HelloExam2 {
	public static int sum(int a,int b) {
		return a - b;
	}
	// main() 메소드에서 실행시작
	public static void main(String[] args) {
		int i = 30;//지역변수 초기화(할당)
		int s;//지역변수 선언
		String a;//지역변수 선언
		s = sum(i,10);//sum() 메소드 호출과 동시에 초기화(할당)
		a = "오경수"; //지역변수 초기화(할당)
		
		System.out.println(s);//정수 s값 화면출력
		System.out.println(a);//문자"오경수"화면출력
		
		
	}

}
