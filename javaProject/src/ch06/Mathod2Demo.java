package ch06;

public class Mathod2Demo {

	public static void main(String[] args) {
		System.out.println("합(1~10) : "+sum(1,10));
		System.out.println("합(10~100 : "+sum(10,100));
		System.out.println("합(100~1000) : "+sum(100,1000));

	}
	public static int sum(int i,int j) {  //call by value
		int sum=0;
		for(int a=i;a<=j;a++)
			sum+=a;
		return sum;
		
	}

}
