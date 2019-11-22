package ch10;

class T{
	private int num=10;
	public final void print() {
		System.out.println(num);
	}
}

public class FinalMethod extends T{
	int num=100;
//	@Override
//	public void print() { final이 메소드에 붙으면 오버라이딩이 안됨
//		
//	}
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		
	}

}
