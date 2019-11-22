package ch11;

public interface Flyer {
	// 추상클래스처럼 인스턴스를 만들수 없다(new 불가)
	public void takeOff();
	public void fly();
	public void land();
//	public void abc() { interface 에서는 일반 메소드 형식은 존재할수 없음, 추상메소드만 존재 가능
	

}
