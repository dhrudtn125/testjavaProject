package ch16;

public class Atm extends Thread{
	private long depositMoney = 100000;
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			withDraw(10000);  //1만원 인출
		}
	}
	private synchronized void withDraw(int money) {
		String name = Thread.currentThread().getName();
		if(depositMoney > 0) {  //잔액이 있을경우
			depositMoney = depositMoney- money;
			System.out.println(name+"잔액: "+depositMoney);
		}else {  //잔액이 없을때
			System.out.println("잔액이 부족합니다.");
		}
		
		
	}

}
