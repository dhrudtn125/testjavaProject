package ch11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawUse extends Applet{
	
	Draw shape1; //인터페이스 데이터 타입
	Draw shape2; //interface 타임
	
	public DrawUse() {
		shape1 = new DrawCircle(30,30,600,600);
		shape2 = new DrawLine(10,20,1500,1000);
		setBackground(Color.pink);
	}
	
	@Override
	public void paint(Graphics g) {  //메인 메소드처럼 실행
		g.drawString("java 그래픽", 100, 60);
		shape1.paint(g);
		shape2.paint(g);
		
	}
}
