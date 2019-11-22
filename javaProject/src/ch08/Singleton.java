package ch08;

public class Singleton {
	private Singleton() {
		print();
	}
	
	private static Singleton instance;//싱글톤 처리된 생성자는
	//private static 으로 처리후 클래스명 변수명으로 명시하여 변수를 사용.
	public static Singleton getIntace() {
		//생성자가 private 처리가 되었을땐 이렇게 public static 으로 처리한메소드로 우회접근한다.
		if(instance==null) {
			instance = new Singleton();
			//생성자를 호출하는쪽으로 만들어 준다.
			//처음에는 null상태에서 실행되어 생성자를 쓰지만
			//두번째 부터 호출되면 null이 아니기 때문에 if문을 실행하지 않음.
		}
		return instance;  // 참조변수의 주소값을 리턴
	}
	
	public void print() {
		System.out.println("생성자");
	}

}
