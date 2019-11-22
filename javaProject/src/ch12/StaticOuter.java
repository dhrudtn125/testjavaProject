package ch12;

public class StaticOuter {
	static int data = 30;
	int data2=50;
	static class StaticInner{
		void msg() {
			System.out.println(data+data2);
		}
	}

}
