package pr;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Golf extends Applet implements Runnable{
	private Image[] img;
	private int idx;
	private Image offImage;
	private Graphics bg;
	
	@Override
	public void init() {
		img = new Image[7]; 
		for(int i=0;i<img.length;i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("golf"+(i+1)+".jpg"));
		}
		Thread t = new Thread(this);
		t.start();
		setSize(300, 500);
	}
	@Override
	public void update(Graphics g) {
		Dimension d = getSize();
		if(offImage == null) {
			offImage = createImage(d.width,d.height);
			bg = offImage.getGraphics();
		}
		bg.setColor(getBackground());  //백그라운드 배경색상
		bg.fillRect(0, 0, d.width, d.height);  //백그라운드 영역
		bg.drawImage(img[idx], 0, 0, null);  //백그라운드 영역에 그래픽 출력
		paint(g);
	}
	@Override
	public void paint(Graphics g) {
		if(offImage != null) {
			g.drawImage(offImage, 90, 75, this);
		}
	}

	@Override
	public void run() {
		while(true) {
			idx++;
			if(idx>=7) {
				idx =0;
			}
			repaint();
			try {
				Thread.sleep(110);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
	}
	

}
