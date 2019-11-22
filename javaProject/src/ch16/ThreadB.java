package ch16;

public class ThreadB extends Thread{
	//해당 스레드가 실행되면 자기자신의 모니터링 락을 획득
	//5번 반복을 하면서 0.5초씩 쉬어가면서 total에 값을 누적 
	//notify()메소드를 호출 하여 wait상태의 스레드를 깨움
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(i+"를 더합니다.");
			    total += i;
			    try {
			    	Thread.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//notify();  //wait하고 있는 스레드를 깨움
			
		}
	}

}
