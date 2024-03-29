package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Ball extends Applet implements Runnable, ComponentListener{
	private int x,y;  //좌표값
	private int mx = 2, my = 3;  //x축 2만큼 이동 y축 3만큼 이동
	private int width =200, height =200;  //화면 사이즈
	//애플릿을 초기화시키는 메소드
	@Override
	public void init() {
		//화면의 변화를 감지하는 이벤트 처리 기능 추가
		//이벤트 소스.이벤트리스너(이벤트 핸들러)
		this.addComponentListener(this);  //this 는 Applet을 가리킴
		Thread t = new Thread(this);
		t.start();  //run()실행		
	}
	//그래픽을 처리
	@Override
	public void paint(Graphics g) {
		//Graphics는 자바의 그래픽 처리 클래스
		g.setColor(Color.BLUE);  //색상 설정
		g.fillOval(x, y, 30, 30);
		//filOval(시작x,시작y,가로길이,세로길이)-타원을 그리는 메소드
		
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
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  //end while
	}  //end run
	
	//화면이 사이즈가 변경될 때 호출됨 
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
