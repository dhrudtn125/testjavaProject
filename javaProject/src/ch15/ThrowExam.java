package ch15;

public class ThrowExam {
//예외처리방법
	//1)try~catch 직접처리
	//2)throws : 예외처리 클래스를 시스템에 위임
	//메소드 이름옆에 throws 예외처리 클래스 (여러개 가능)
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);  //Interrupt(cpu 간섭)
		}
	}

}
