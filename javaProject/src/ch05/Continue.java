package ch05;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			//5의 배수를 만나면 출력 안함
			if(i % 2 == 0)
				continue;  //이하 코드를 무시,다음 조건으로 ..
			System.out.println(i);
		}
			

	}

}
