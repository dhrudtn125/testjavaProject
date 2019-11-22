package ch13;

public class ObjTest {
	public static void main(String[] args) {
		int a = 10;
		Object obj = 20;
		//좌변: 부모,우변: 자녀
		a = (Integer)obj;  //정상적인 형변환(int)obj도 가능
		//obj가 객체형이기 때문에 (Integer)로 써야하는데, (int)도 가능하다. 이것은 최신버전이기 때문이다.
		System.out.println(a);
		//Object클래스는 최상위 클래스이기에 모든 형을 다 포함한다
		Object[] obj2= {100,100.5,true,"Hello",'A'};
		//사실은 각 데이터가  Object객체 (Integer,Double,Boolean,...)가 되어버린다
		//메모리 낭비가 심각, 실행시간도 길어지고 하여 실제로 이렇게 쓰는일은 없다. 대신컬렉션처리(ArratList등)하면 
		//단점을 보완 할 수 있다.
		for(Object o:obj2)  //향상된 for문
		{
			System.out.println(o);}  //오토 언박싱
		}

}
