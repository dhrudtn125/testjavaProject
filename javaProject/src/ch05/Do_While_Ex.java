package ch05;

public class Do_While_Ex {
	public static void main(String[]args) {
		int n=1;
		do {
			System.out.println(n+"Hello World");  //반드시 한번 수행
			n++;  //조건식에 위배될때까지 1씩 증가한 후 while문 빠져 나감
		}while(n<=10);
		System.out.println("while문 빠져나옴");
	}

}
