package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj =new Object();
		obj = new Integer(20);  //참조변수에는 원래 주소값이 들어가지만 
		//jdk1.5버너전 부터는 value가 들어 갈 수 있도록 내부처리(intValue()등을 호출)하도록 했다.(Auto Boxing 처리)
		System.out.println(obj);  //오토 언박싱(Auto Unboxing처리)
		obj = new Double(20.5);
		System.out.println(obj);
		obj = "Hello";
		//obj = new String("Hello");
		System.out.println(obj);
	}

}
