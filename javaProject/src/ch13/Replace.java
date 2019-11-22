package ch13;

public class Replace {
	public static void main(String[] args) {
		String a = "java program";  //String은 불변성을 가진다 (final)
		System.out.println(a.replace("a","A"));  //복사를 해서 변경, 원래 String a 값에는 영항없음
		System.out.println(a);
	}

}
