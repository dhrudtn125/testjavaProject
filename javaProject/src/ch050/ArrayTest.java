package ch050;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers= {10,20,30};
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(numbers[i]);
	//	}
		for(int value : numbers) {
			System.out.println(value);
		}

	}

}
