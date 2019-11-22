package ch08;

public class SingletonUse {
	public static void main(String[] args) {
		Singleton a=Singleton.getIntace();
		// Singleton a=new Singleton();x안댐 private처리된 생성자를 new 로 처리하면 오류가남.
		//클래스 이름 변수 = 클래스 이름.메소드 이름 으로 
		// 싱글톤 처리된(private) 생성자를 접근
	}

}
