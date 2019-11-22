package ch11;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기 시작 x값 좌표값 : "+x);
		System.out.println("사각형 그리기 시작 y값 좌표값 : "+y);
	}

}
