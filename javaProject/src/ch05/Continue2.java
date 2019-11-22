package ch05;

public class Continue2 {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) continue;//if값일때 는 수행을 하지 않고 위에 for문으로 다시 반복
			System.out.println("홀수값 : "+i);
		}
	}

}
