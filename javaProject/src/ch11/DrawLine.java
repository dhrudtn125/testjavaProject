package ch11;

import java.awt.Graphics;

public class DrawLine extends Point implements Draw {
	private int x,y;
	public DrawLine() {

	}
	public DrawLine(int a, int b, int x, int y) {
		super(a,b);
		this.x=x;
		this.y=y;
		
	}

	@Override
	public void paint(Graphics g) {
		//선그리기 메소드(x1,x2,y1,y2)
		g.drawLine(a, b, x, y);

	}

}
