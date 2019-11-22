package ch16;

public class ThreadJoin extends Thread{
	public static void main(String[] args) {  // main 스레드
		System.out.println(Thread.currentThread().getName());
		ThreadJoin e = new ThreadJoin();
		e.setName("Thread1");
		e.start();  //run스레드 호출
		try {
			e.join();  //새로운 작업을 요청하면 기다렸다가 다시실행 -싱글스레드
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
		
	}  //end main
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 실행되었습니다.");
		try {
			Thread.sleep(1000);  //cpu의 실행을 1초동안 멈춤
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
		
	}  //추상메소드 run() 

}
