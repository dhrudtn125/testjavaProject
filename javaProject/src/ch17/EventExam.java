package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventExam extends Frame{
	//이벤트 처리방법
	//1.WindowListener익명내부 클래스로 구현
	//2.윈도우 어답터 익명내부 클래스로 구현
	//3.외부파일에서 구현
	
	public EventExam() {
		setSize(300, 300);  //프레임 가로,세로 길이 설정
		setVisible(true);  //프레임 화면 에 표시
		//이벤트소스.이벤트리스너(이벤트 핸들러)
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new EventExam();
	}

}
