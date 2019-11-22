package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import ch16.CountDownTest.MyThread;

public class CountDownTest2 extends JFrame{
	private JLabel label;
	class MyThreadEx extends Thread{
		@Override
		public void run() {
			for(int i=20;i>=0;i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}  //end for
		}  //end run
	}  //end MyThread
	public CountDownTest2() {
		setTitle("카운트 다운");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label =new JLabel("시작");
		label.setFont(new Font("serif",Font.BOLD,100));
		add(label);
		(new MyThreadEx()).start();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		CountDownTest2 t = new CountDownTest2();
	}

}
