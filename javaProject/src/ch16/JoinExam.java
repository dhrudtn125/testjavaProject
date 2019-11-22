package ch16;

public class JoinExam {
	public static void main(String[] args) {
		MyThread5 t5= new MyThread5();
		t5.start();
		System.out.println("스레드가 종료 될 때 까지 기다립니다 ");
		try {
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스레드가 종료되었습니다.");
	}

}
