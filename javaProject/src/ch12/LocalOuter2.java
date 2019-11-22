package ch12;

public class LocalOuter2 {
	
	private int data=30;
	void display() {
		int value=50;  //지역변수(jdk 1.7까지는 이변수를 사용하려면 마지막이여야 한다)
		class LocalInner2{
			void msg() {
				System.out.println(value);
			}  // end msg()
		}  //end LocalInner class
		LocalInner2 in=new LocalInner2();
		in.msg();
	}  //end display()
	
	public static void main(String[] args) {
		LocalOuter2 ou = new LocalOuter2();
		ou.display();
	}

}
