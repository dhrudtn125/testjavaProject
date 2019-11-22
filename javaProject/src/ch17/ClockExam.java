package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockExam extends JFrame implements Runnable{

	private JPanel contentPane;
	//멤버변수 추가
	private Calendar cal;
	private String str;
	private JLabel lblTime;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
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
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTime = new JLabel("");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPane.add(lblTime, BorderLayout.CENTER);
		//백그라운드 스레드 생성 
		Thread t = new Thread(this);
		t.start();
		
		btnClose = new JButton("종료");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose, BorderLayout.SOUTH);
	}

	@Override
	public void run() {
		while(true) {
			cal = Calendar.getInstance();
			//캘린더 인스턴스 생성 (현재시간은 cal변수에 저장)
			str = String.format("  %02d시  %02d분  %02d초", cal.get(Calendar.HOUR_OF_DAY),
					cal.get(Calendar.MINUTE),
					cal.get(Calendar.SECOND));
			//레이블에 시간 출력 setText(문자열)
			lblTime.setText(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
