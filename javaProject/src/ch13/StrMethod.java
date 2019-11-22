package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";//str1= atr1+" programming"
		
		System.out.println(str1.length());
		String str2 = str1.concat(" progeamming");  //concat()으로 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));
		System.out.println(str2.indexOf("programming"));  //""문자열의 첫 문자가 시작하는 위치를 리턴
		System.out.println(str2.indexOf("z"));  //해당하는 내용이 없으면 -1을 리턴
		System.out.println(str2.substring(0, 4));
		System.out.println(str2.substring(5));
		//문자열 변경 replace(A,B) A를 B로 변경
		System.out.println(str2.replace("java", "jsp"));
		System.out.println(str2);
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
	}

}
