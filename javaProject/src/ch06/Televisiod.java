package ch06;

public class Televisiod {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	
	int getChannel() {
		return channel;  //멤버 변수의 값 channel 을 리턴
	}
	
	void setChannel(int ch) {
		channel = ch;  //멤버변수 = 지역변수
		
	}

}
