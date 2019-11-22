package ch13;

public class Change {
	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		int temp;//b의 값을 a에 바로 넣기 전 미리 백업하여 거처가는 임시변수
		System.out.printf("%d\t%d\t",a,b);
		temp = a;
		a = b;
		b = temp;
		System.out.printf("%d\t%d",a,b);
	}

}
