package ch16;

public class ThreadA {
	public static void main(String[] args) {
		//앞에서 만든 스레드B를 객체 생성후 start
		ThreadB b = new ThreadB();
		//해당 스레드가 실행되면, 해당스레드는  run메소드안에서 자신의 모니터링 락을 획득
		
		b.start();
		synchronized (b) {
			System.out.println("b가 왼료될때까지 기다립니다.");
			try {
				//wait 메소드 호출
				b.wait();
				//메인메소드는 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//notify()호출 후 깨어난후 스레드를 진행 
			System.out.println("total in : "+b.total);
		}//end synchronized()
	}

}
