package ch06;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Televisiod myTv = new Televisiod();
		myTv.channel=7;
		myTv.volume=9;
		myTv.onOff=true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 "+ch+"입니다.");
	}

}
