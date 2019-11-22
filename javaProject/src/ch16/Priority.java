package ch16;

public class Priority extends Thread{
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		//스레드의 이름을 설정
		e1.setName("Thread1");
		e2.setName("Thread2");
		System.out.println("e1의 기본우선운위: "+e1.getPriority());
		System.out.println("e2의 기본우선운위: "+e2.getPriority());
		
		//Thread.MAX_PRIORITY 최대 우선순위(10)
		//Thread.NOMAL_PRIORITY 기본우선순위(5)
		//Thread.MIN_PRIORITY 최소 우선순위(1)
		
		e1.setPriority(Thread.MIN_PRIORITY);  //최소 우선순위(1)
		e2.setPriority(Thread.MAX_PRIORITY);  //최대 우선순위(10)
		e1.start();//run()호출
		e2.start();
	}  //end main
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
			
		}
	}

}
