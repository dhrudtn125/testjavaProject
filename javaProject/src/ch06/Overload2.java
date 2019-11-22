package ch06;

public class Overload2 {
	
	static void print(String a) {
		System.out.println("이름: "+a);
	}
	static void print(int n) {
		System.out.println("나이: "+n+"세");
	}
	static void print(String a,String b) {
		System.out.println("주소: "+a+b);
	}
	static void print(int n,int i,int j) {
		System.out.println("전화번호: "+n+"-"+i+"-"+j);
	}
	public static void main(String[]args) {
		System.out.println("--------------------------");
		print("오경수");
		print(25);
		print("서울시","서대문구");
		print(010,2462,3441);
		System.out.println("--------------------------");
	}

}
