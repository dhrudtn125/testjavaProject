package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class MenuExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExam2 frame = new MenuExam2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("파일");
		menuBar.add(menuFile);
		
		JMenuItem miNewFile = new JMenuItem("새로 만들기");
		menuFile.add(miNewFile);
		
		JMenuItem miOpen = new JMenuItem("열기");
		menuFile.add(miOpen);
		
		JMenuItem miSave = new JMenuItem("저장");
		menuFile.add(miSave);
		
		JMenuItem miAnoterNameSave = new JMenuItem("다른이름으로 저장");
		menuFile.add(miAnoterNameSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem miPageset = new JMenuItem("페이지 설정");
		menuFile.add(miPageset);
		
		JMenuItem miPrint = new JMenuItem("인쇄");
		menuFile.add(miPrint);
		
		JMenuItem miExit = new JMenuItem("끝내기");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MenuExam2.this, "메모장을 종료 하시겠습니까?");
				if(result == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(MenuExam2.this, "메모장을 종료합니다.");
					System.exit(0);
				}
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		menuFile.add(separator_1);
		menuFile.add(miExit);
		
		JMenu menuEdit = new JMenu("편집");
		menuBar.add(menuEdit);
		
		JMenuItem miCancel = new JMenuItem("실행 취소");
		menuEdit.add(miCancel);
		
		JSeparator separator_2 = new JSeparator();
		menuEdit.add(separator_2);
		
		JMenuItem miCut = new JMenuItem("잘라내기");
		menuEdit.add(miCut);
		
		JMenuItem miCrltC = new JMenuItem("복사");
		menuEdit.add(miCrltC);
		
		JMenuItem miCrltV = new JMenuItem("붙여넣기");
		menuEdit.add(miCrltV);
		
		JMenuItem miDelete = new JMenuItem("삭제");
		menuEdit.add(miDelete);
		
		JSeparator separator_3 = new JSeparator();
		menuEdit.add(separator_3);
		
		JMenuItem miFind = new JMenuItem("찾기");
		menuEdit.add(miFind);
		
		JMenuItem miNextFind = new JMenuItem("다음 찾기");
		menuEdit.add(miNextFind);
		
		JMenuItem miChange = new JMenuItem("바꾸기");
		menuEdit.add(miChange);
		
		JMenuItem miMove = new JMenuItem("이동");
		menuEdit.add(miMove);
		
		JSeparator separator_4 = new JSeparator();
		menuEdit.add(separator_4);
		
		JMenuItem miAllSelect = new JMenuItem("모두 선택");
		menuEdit.add(miAllSelect);
		
		JMenuItem miTime = new JMenuItem("시간/날짜");
		menuEdit.add(miTime);
		
		JMenu menuForm = new JMenu("서식");
		menuBar.add(menuForm);
		
		JMenuItem miAuto = new JMenuItem("자동 줄 바꿈");
		menuForm.add(miAuto);
		
		JMenuItem miFornt = new JMenuItem("글꼴");
		menuForm.add(miFornt);
		
		JMenu menuView = new JMenu("보기");
		menuBar.add(menuView);
		
		JMenuItem miLIne = new JMenuItem("상태표시줄");
		menuView.add(miLIne);
		
		JMenu menuHelp = new JMenu("도움말");
		menuBar.add(menuHelp);
		
		JMenuItem miHelp = new JMenuItem("도움말");
		menuHelp.add(miHelp);
		
		JSeparator separator_5 = new JSeparator();
		menuHelp.add(separator_5);
		
		JMenuItem miInform = new JMenuItem("메모장 정보");
		menuHelp.add(miInform);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
