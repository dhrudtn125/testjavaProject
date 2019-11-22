package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame{
	public GridExam(){
		//JFrame의 기본 레이아웃은 BorderLayout
		//기본레이아웃울 쓰지 않고 GridLayout으로 변경
		
		setLayout(new GridLayout(2, 3));  //2행 3열의 그리드 레이아웃
		for(int i=1;i<=6;i++) {
			JButton button = new JButton("button"+i);
			add(button);
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridExam();  //기본 생성자 생성 및 호출 
	}

}
