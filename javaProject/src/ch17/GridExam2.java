package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam2 extends JFrame{
	public GridExam2() {
		setLayout(new GridLayout(3, 4));
		for(int i=1;i<=12;i++) {
			JButton button = new JButton("button"+i);
			add(button);
		}
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new GridExam2();
	}

}
