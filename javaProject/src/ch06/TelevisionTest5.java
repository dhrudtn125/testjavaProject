package ch06;

public class TelevisionTest5 {
	public static void main(String[] args) {
		Televisiod myTv = new Televisiod();
		myTv.setChannel(11);
		int ch =myTv.getChannel();
		//myTv.print();
		System.out.println("현재 채널은"+ch+"입니다.");
	}

}
