package ch14;

public class Box {
	private Object data;
	public void set(Object data) {
		this.data = data;
	}
	public Object get() {
		return data;
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello World");  //문자열 객체
		String s = (String)b.get();  //Object타입을 String타입으로 변환하기위해 형변환이 필요(다운캐스팅)
		
		Box c = new Box();
		c.set(10);
		Integer i = (int)c.get();  //다운캐스팅
		
		System.out.println(s);
		System.out.println(i);
		
	}

}
