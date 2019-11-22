package ch10;

class Triangle extends Figure{
	@Override  //주석처럼 쓰이는 
	void draw() {
		System.out.println("삼각형 그리기 ...");
	}
}

class Rectangle extends Figure{
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}
class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원 그리기...");
	}
}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	public static void main(String[] args) {
		//좌 우 변에 같은 타입
		Triangle t= new Triangle();
		t.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
		//좌 우 변이 다른타입 상속하는 부모클래스로 자식클래스 다 처리 가능
		Figure f = new Triangle();
		f.draw();
		f= new Rectangle();
		f.draw();
		f= new Circle();
		f.draw();
	}

}
