package ch14;

public class TypeEx <T>{
	private T value;
	public void setT(T value) {
		this.value=value;
	}
	public T getT() {
		return value;
	}
	public static void main(String[] args) {
		TypeEx<String> a = new TypeEx<String>();
		a.setT("kim");
		
		TypeEx<String> b = new TypeEx<String>();
		b.setT("김길동");
		
		TypeEx<String> c = new TypeEx<String>();
		c.setT("hong@gmail.com");
		
		TypeEx<Integer> d = new TypeEx<Integer>();
		d.setT(20);
		
		TypeEx<String> e = new TypeEx<String>();
		e.setT("010-1234-5678");
		
		
		System.out.println("=====================================");
		System.out.println("ID: "+a.getT());
		System.out.println("이름: "+b.getT());
		System.out.println("Email: "+c.getT());
		System.out.println("나이: "+d.getT()+"세");
		System.out.println("연락처: "+e.getT());
		System.out.println("=====================================");
	
		
	}

}
