package ch050;

public class ForeachEx {
	
	enum week{월,화,수,목,금,토,일}//enum 은 배열보다 간편한방식으로 단지 데이터를 나열해서 쓰기만 하면 된다.

	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for(int k : n) {
		System.out.println(k+" ");//반복되는 k값출력
		sum+= k;
	}
		System.out.println("합은 " +sum);
		
		for(String s: names)
			System.out.println(s+" ");
		System.out.println();
		for(week day : week.values())
			System.out.println(day+"요일");
		System.out.println();
	}	

}
