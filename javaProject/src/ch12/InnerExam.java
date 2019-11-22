package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Flame: 윈도우창을 띄워주는 클래스
//이벤트처리: 사용자의 요청에 시스템이 응답
// 이벤트 3대 요소
//1. 이벤트소스: 이벤트의 대상
//2. 이벤트 리스너: 이벤트 관찰자, 감시자
//3. 이벤트 핸들러 : 이벤트 처리기
//사용방법: 이벤트소스 .이벤트리스너(이벤트 핸들러)
public class InnerExam extends Frame{
	public InnerExam() {
		super("내부 클래스 테스트");  //부모 생성자 호출
		setSize(300, 400);  //띄워지는 윈도우의 가로,세로의 초기사이즈 설정
		setVisible(true);  //윈도우 프레임을 화면에 표시
	}
	
	public static void main(String[] args) {
		InnerExam e= new InnerExam();  //객체생성, 기본생성자 호출
		e.addWindowListener(new WindowListener() {  //무명 클래스
			
			@Override
			public void windowOpened(WindowEvent e) {								
			}
			
			@Override
			public void windowIconified(WindowEvent e) {								
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {								
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {							
			}
			
			@Override
			public void windowClosing(WindowEvent e) {								
			}
			//윈도우 창이 닫힐때 자동 호출([x])
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);  //프로그램 강제종료
			}
			
			@Override
			public void windowActivated(WindowEvent e) {								
			}
		});
	// 여기서 어떻게 해야 윈도우창이 꺼지는지 놓쳤습니다. 구굴링해봐도 
	}
	

}
