package ch050;

public class AnonymousArray {
// 무명배열 :  배열의 이름을 지정하지 않고 단순히 초기값만으로 배열을 생성
	// 무명배열을 만들어 함수의 인수로 전달할때 쓰며 배열이 
	//딱 한번만 필요하고 다시는 참조할일이 없을때 사용할수 있음
	public static void main(String[] args) 
	{
		System.out.println("숫자들의 합: "+sum(new int[] {1, 2, 3, 4, 5}));
	}// end main
	public static int sum(int[] numbers)
	{
		int total=0;
		for(int i=0;i<numbers.length;i++) 
		{
			total+=numbers[i];
		}//end for
		return total;
	
		
		
	
		

	}

}
