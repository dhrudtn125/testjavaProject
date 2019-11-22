package ch06;

public class VarianParam {
	static void print(String ...n) {  //n이 가변형 매개변수(배열처리의 주소값)가됨
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+"\t");
		}
	}
//	static void print(String a) {
	//	System.out.println(a);
	//}
	
	//static void print(String a,String b) {
		//System.out.print(a);
		//System.out.println(b);
	//}
	
	//static void print(String a,String b,String c) {
		//System.out.print(a);
		//System.out.print(b);
		//System.out.println(c);
	//}
	
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","JSP");
		print("java","program","JSP","big");
	}

	//static void print(String a, String b, String c, String d) {
		//System.out.print(a);
		//System.out.print(b);
		//System.out.print(c);
		//System.out.println(d);
		
	

}
