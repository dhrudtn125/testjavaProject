package ch11;

import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {
	
	private int width,height;
	
	public DrawCircle() {
		this(0,0,0,0);  //매개변수가 4개인 생성자 호출
	}

	public DrawCircle(int a, int b, int w, int h) {
		super(a,b);  //부모클래스의 생성자 호출
		height = h;  //변수명이 다를때 this.을 굳이 붙이지 않아도 된다.
		width = w;
	}

	@Override
	public void paint(Graphics g) {  // Graphics : 그래픽 처리 클래스
		  //타원 그리기 (x,t,가로,세로)
		g.drawOval(a, b, width, height);
	}

}
