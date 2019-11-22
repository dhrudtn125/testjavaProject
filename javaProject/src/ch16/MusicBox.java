package ch16;

//무작위로 메소드들이 Thread에의해 실행되면 문제 될 수 있다.
//따라서 이런 문제를 방지하기 위하여 동기화(synchronized)를 적용한다.
//모니터링 락은 메소드 실행이 종료되거나 ,wait()과 같은 메소드를 만나기 전까지 유지된다.
//다른 Thread들은 모니터링 락이 놓여질때 까지 대기한다.
public class MusicBox {
	//메시지가 10초 이하로 10번 반복 출력
	public synchronized void playMusicA() {
		for(int i=0;i<10;i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  //end for
	}  //end A
	//메시지가 10초 이하로 10번 반복 출력
	public synchronized void playMusicB() {
		for(int i=0;i<10;i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  //end for
		
	}  //end B
	
	public synchronized void playMusicC() {
		for(int i=0;i<10;i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  //end for
	}  //end C

}
