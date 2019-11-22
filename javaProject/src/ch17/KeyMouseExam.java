package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;  //키보드 이벤트 처리를 위한 인터페이스
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener; //마우스 이벤트 처리를 하기 위한 인터페이스
import java.awt.event.MouseMotionListener;  //마우스 이동 이벤트 처리를 위한 인터페이스

import javax.swing.JApplet;

public class KeyMouseExam extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y;  //이미지를 출력할 좌표값
	private int width,height;  //가로세로
	private Image img;  //이미지 사용할 변수
	private boolean flag = false;  //이미지가 처음실행할때 안보이게 false로 씀
	
	
	//Applet을 초기화 하는 코드
	@Override
	public void init() {
		setSize(300,300);  //화면 사이즈 설정
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재클래스에 마우스 이벤트 기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);		
		//현재 클래스에 기보드 (키)이벤트 기능을 추가
		this.addKeyListener(this);
		//키입력을 받을 수 있도록 설정
		setFocusable(true);
		//현재 화면에 키입력을 요청
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지에 가로세로 길이를 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {  //마우스를 클릭시 true로 바뀌면서 실행
			g.drawImage(img, x, y, this);
			
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스를 컴포넌트 상태에서 눌러 드레그 하였을때 호출
		System.out.println("mouse draw:x:"+x+",y"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스커서가 컴포넌트 상에 이동했지만 버튼이 작동하지 않는 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move x:"+x+", y:"+y);
	}

	@Override  //컴포넌트 상에서 마우스 버튼을 클릭(눌렸다가 놓아질때)했을 때 호출
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		flag = true;  //클릭할때 그림을 true로 설정해서 보여지게함.
		//마우스 클릭한 좌표를 저장함
		x = e.getX(); //x좌표
		y = e.getY();  //y좌표
		repaint();  //paint()가 호출
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴포넌트 상에서 마우스 버튼을 눌렀을때 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//컴포넌트 상에서 마우스 버튼을 때어서 놓아졌을때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴포넌트 상에 들어 갔을 때에 호출 
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴포넌트를 종료하면 호출
	}

	@Override
	public void keyTyped(KeyEvent e) {
		\
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키를 눌럿을때 호출
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(0, y-5);break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5);break;
		case KeyEvent.VK_LEFT :
			x = Math.max(0, x-5);break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-height, x+5);break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
