package ch15;

public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			//현재 실행중인 스레드의 이름 출력
			try {
				Thread.sleep(1000);  //cpu가 실행을 1초간 멈춤
			} catch (InterruptedException e) {
				
				e.printStackTrace();  //디버깅용 (에러 메시지를 화면에 출력)
			}
	}
	}
	

}
