package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a");
		str1.append(" Java Programmer");
		System.out.println("append()메소드 활용: "+str1);
		
		str1.replace(7, 11, "Jsp");
		System.out.println("replace()를 활용: "+str1);
		System.out.println("substring()을 활용: "+str1.substring(7));
		
	}

}
