package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExamEx extends JFrame {
	private JButton button1,button2,button3,button4,button5,button6;
	
	public EventExamEx() {
		setLayout(new FlowLayout());
		button1 = new JButton("Red");
		button2 = new JButton("DarkGray");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Magenta");
		button6 = new JButton("Cyan");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		button1.addActionListener(new MyColorAction(this,Color.black));
		button2.addActionListener(new MyColorAction(this,Color.darkGray));
		button3.addActionListener(new MyColorAction(this,Color.blue));
		button4.addActionListener(new MyColorAction(this,Color.white));
		button5.addActionListener(new MyColorAction(this,Color.magenta));
		button6.addActionListener(new MyColorAction(this,Color.cyan));
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EventExamEx();
	}

}
