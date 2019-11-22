package ch16;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Anim extends Applet implements Runnable{
	//이미지사진 10장을 참조
	private Image[] img;  //이미지 배열
	private int idx;  //이미지 배열의 인덱스 값
	
	//Applet 초기화
	@Override
	public void init() {
		img = new Image[10];  //이미지 10개를 가르키는 객체참조 배열 생성
		for(int i=0;i<img.length;i++) {
			//duk1e.gif~duke.gif  10장의 이미지 인스턴스 생성
			img[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("duke"+(i+1)+".gif"));
			//배열의 인덱스가 0부터 시작이기에 i+1을 해줌
		}  //end for()
		Thread t = new Thread(this);  //new Thread(스레드 구현 객체)
		t.start();
		setSize(500,200);
	}  //end init()
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img[idx], 90, 73, this);
		//drawImage(이미지, x, y, 이미지 관찰자);
//		for(int i=0;i<=img.length;i++) {
//			g.drawImage(img[i], i*40, 73, this);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}
	
	@Override
	public void run() {
		while(true) {
			idx++;  //이미지의 인덱스값 증가
			//인덱스가 10이 되면 0으로 초기화(0~9로테이션)
			if(idx>=10) {
				idx=0;
			}
			repaint();  //paint()호출
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
