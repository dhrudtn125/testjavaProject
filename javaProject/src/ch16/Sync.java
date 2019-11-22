package ch16;

public class Sync {
	public static void main(String[] args) {
		Atm atm = new Atm();
		//new Thread(스레드의 구현객체 , 스레드 이름
		Thread mom = new Thread(atm,"mom");
		Thread son = new Thread(atm,"som");
		mom.start();
		son.start();
	}

}
