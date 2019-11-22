package ch12;

class Outer{
	class InstanceInner{
		int iv=100;
	}  //end Instance Inner
	static class StaticInner{
		int iv=200; //non static
		static int cv=300;
	}  //end class StaticInner
	void MyMethod() {
		class LocalInner{
			int iv=400;
		}  //end LocalInner
		LocalInner li=new LocalInner();
		System.out.println("li.iv: "+li.iv);
	}  //end MyMethod()
}

public class InnerExam4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv: "+ii.iv);
		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		//non static 멤버를 접근하기 위해서는 static class 내에 있다하더라도 객체생성 해주어야 한다
		System.out.println("si.iv: "+si.iv);
		oc.MyMethod();
		
	}

}
