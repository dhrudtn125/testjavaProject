package ch16;

public class CinemaBox {
	public synchronized void playCinemaA() {
		for(int i=0;i<=10;i++) {
			System.out.println("타짜!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	public synchronized void playCinemaB() {
		for(int i=0;i<=10;i++) {
			System.out.println("JOKER!!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
