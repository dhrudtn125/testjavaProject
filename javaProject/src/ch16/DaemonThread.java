package ch16;

/*데몬스레드
 * 데몬(Daemon)이란 보통 리눅스와 같은 유닉스 계열의 운영체제에서 
 * 백그라운드로 동작하는 프로그램을 말한다.
 * 데몬스레드를 만들 때 방법은 스레드에 데몬 설정을 하면 된다.
 * 윈도우에서는 서비스라고 함
 * 예)워드프로세서 등을 실행할 때 일정 시간 동안 자동 저장하거나 
 * 맞춤법 검사등을 하는기능 등등...
 * 이런 데몬 스레드 같은경우는 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 
 * 처리하게 하는 용도로 만든다.
 * 데몬 스레드 는 일반 스레드 (main...)가 모두 종료가 되면 강제적으로 
 * 종료가 되는 특징을 가지고 있다.
 */
public class DaemonThread implements Runnable{

	@Override
	public void run() {
		while(true) {  //무한반복문
			System.out.println("데몬스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exception 발생시 while 문 빠져나감
			}
		}  //end while
	}  //end run
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());
		//데몬 스레드로 설정
		th.setDaemon(true);
		//스레드를 실행
		th.start();
		
		//메인스레드가 1초뒤에 종료되도록 설정
		//데몬스레드는 다른스레드가 모두 종료가 되면 자동종료
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("메인스레드가 종료 되었습니다.");
	}  //end main

}
