package ch11;
  // 한개라도 추상메소드가 있다면 클래스도 abstract 해야 한다.
public abstract class Shape {
	int x,y;  //멤버변수
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // 추상메소드

}
