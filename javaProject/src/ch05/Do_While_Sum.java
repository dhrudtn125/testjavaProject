package ch05;

public class Do_While_Sum {
	public static void main(String[]args) {
		int i=1;
		int num=100;
		int sum=0;
		do {
			sum +=i;
			i++;
		}while(i<=num);
		System.out.println("1~"+num+"까지의 합계 : "+sum);
	}

}
