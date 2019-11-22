package ch05;

public class Break3 {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(true) { //무한반복
			if(sum>100)
				break;
			i++;
			sum += i;  //sum = sum + i
		}  //end while
		System.out.println("i="+i);
		System.out.println("sum="+sum);

	}

}
