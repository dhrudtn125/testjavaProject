package ch06;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Televisiod mytv = new Televisiod();
		mytv.channel = 7;
		mytv.volume = 10;
		mytv.onOff = true;
		
		Televisiod yourTv = new Televisiod();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 티비의 채널은 "+mytv.channel+"이고 볼륨은 "+mytv.volume+"입니다.");
		System.out.println("너의 티비의 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volume+"입니다.");

	}

}
