package ch15;

//SingleThread :  작업단위가 1개(main쓰래드만 존재)
//순차적으로 처리됨
public class SingleThread {
	void print() {
		//현재 실행중인 스레드 (currentThread)의 이름 
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SingleThread t = new SingleThread();
		t.print();
	}

}
