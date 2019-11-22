package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String 불변 (immutable)
		//StringBuilder 가변 (mutable)
		
		StringBuilder str1 = new StringBuilder();
		str1.append("java");//append()문자열 내용을 추가,메모리 절약 가능 
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0,4,"jsp");  //index내용을 순서에 맞게 변신
		System.out.println(str1);
		
		String str2 = str1.substring(3);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.toString();
		System.out.println("StringBuilder(str1)->"+"String(str3)에저장"+str3);
		str1 = new StringBuilder(str3);
		System.out.println("Strting(str3)-> StringBuilder(st1)에 저장"+str1);
	}

}
