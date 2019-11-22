package ch17;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
//AWT: java +C 개발
//Swing : awt를 향상시킨 버전 , java 로만 개발
public class FrameExam {
	public static void main(String[] args) {
		//Frame f =new Frame("프레임테스트");  //프레임 설정
		JFrame f = new JFrame("J프레임 테스트");  //JFrame은 창닫기를 기본으로 탑재하고 있음
		f.setSize(500, 300);  //프레임의 사이즈 설정
		f.setVisible(true);  //프레임을 화면에 표시 안하면 표시 안됨
		
		//이벤트처리
		//이벤트소스.이벤트리스너(이벤트핸들러)
//		f.addWindowListener(new WindowListener() {  //GUI에선 익명클래스 를 자주 사용함
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//			
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램 종료 및 화면창 닫기
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				
//			}
//		});
		//위보다 Adapter를 사용하면 비교적 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//0:정상적인 종료 ,1or-1:비정상적인 종료
			}
		});
		
	}

}
