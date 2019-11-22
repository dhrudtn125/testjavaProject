package ch14;

public class Box2<T> {  //<T>는 타입 매개 변수가 된다 .다른문자 가능
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	public static void main(String[] args) {
		Box2<String> b = new Box2<String>();  //타입 매개변수
		//대입하게될 String 지정
		b.set("Hello Java");  //문자열
		String s = b.get();  //좌변 :String 우변: String
		
		Box2<Integer> c = new Box2<Integer>();
		//타입 매개변수에 Integer 대입
		c.set(10);
		Integer i = c.get(); //좌변: Integer  우변: Integer
		System.out.println(s);
		System.out.println(i);
		 
		
	}
	

}
