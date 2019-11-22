package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본형자료
		int num1 = 10;
		int num2;
		//클래스 자료형(객체 자료형)
		Integer i1;
		Integer i2 = new Integer(20);  //오토 박싱(기본자료형을 객체로 박스처리)
		
		i1 = num1;  //Up Casting 업캐스팅
		num2 =i2;  //Auto Unboxing, 객체 안의 값을 알아서 풀어서 저장
		//다운캐스팅
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
		
	}

}
