package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class BufferedBall extends Applet implements Runnable,ComponentListener{
	private int x,y;
	private int mx=2, my=3;
	private int width =200, height = 300;
	private Graphics bg;
	private Image offScreen;
	private Dimension dim;
	
	//Applet을 초기화하는 메소드
	@Override
	public void init() {
		setSize(300,300);
		dim = getSize();
		offScreen = createImage(dim.width,dim.height);
		bg = offScreen.getGraphics();  //백그라운드 영역에 그래픽처리를 하기위한 객체생성
		
		
		this.addComponentListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	//그래픽 처리
	@Override
	public void paint(Graphics g) {
		bg.setColor(Color.blue);  //백그라운드 메모리에 그래픽 출력
		bg.fillRect(0, 0, getWidth(), getHeight());  //사각형을 그리는 메소드
		bg.setColor(Color.GREEN);
		bg.fillOval(x, y, 30, 30);
		//백그라운드 메모리에 출력된 그림을 화면에 출력
		//drawImage(이미지,x,y,이미지 관찰객체
		g.drawImage(offScreen,0,0,this);
	}

	
	@Override
	public void run() {
		while(true) {  //무한반복
			//x,y 좌표값 변경
			if(x>(width-30) || x<0) {  //공이 벽에 맞게되면 좌표가 오른쪽 벽에서 -30만큼 공의 
				//포인터가 있어야 하고 x가 음수가 되면 안된다.
				mx = -mx;  //방향을 반대로 바꿈 즉, x축 2씩 증가하던것을 반대로 2씩 감소
			}
			x = x+mx;
			if(y>(height-30) || y<0) {  //공이 하단벽에 맞았을때 좌표가 하단벽에서 -10만큼 공포인터가 있어야 하고 y가 음수가 되면 안된다.
				my =-my;  //y축2씩 증가하던 것을  2씩 감소 시킴
			}
			y = y+my;
			repaint();  //화면을 새로그림 => paint()가 호출
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  //end while
	}
	
	
	@Override
	public void componentResized(ComponentEvent e) {
		//화면의 가로,세로 사이즈를 저장 (화면 크기가 바뀌더라도 정상적으로 출력되게 해줌)
				width = getWidth();  //가로 사이즈를 get함
				height = getHeight();  //세로 사이즈를 get함
				System.out.println("가로: "+width+"세로: "+height);
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}


}
