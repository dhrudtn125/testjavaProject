package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam2 extends JFrame{
	public PanelExam2() {
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);
		
		JButton button1 = new JButton("버튼 1");
		JButton button2 = new JButton("버튼 2");
		JButton button3 = new JButton("버튼 3");
		JButton button4 = new JButton("버튼 4");
		JButton button5 = new JButton("버튼 5");
		JButton button6 = new JButton("버튼 6");
		JButton button7 = new JButton("버튼 7");
		
		p.add(button1);
		p.add(button2);
		p.add(button3);
		add(p, BorderLayout.SOUTH);
		add(button4,"North");
		add(button5,"West");
		add(button6);
		add(button7,"East");
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PanelExam2();
	}

}
