package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginExam extends JFrame {
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	private Map<String,String> map;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
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
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(136, 84, 57, 15);
		contentPane.add(lblId);
		
		userid = new JTextField();
		userid.setBounds(191, 81, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(116, 119, 57, 15);
		contentPane.add(lblPassword);
		
		pwd = new JPasswordField();
		pwd.setBounds(191, 116, 116, 18);
		contentPane.add(pwd);
		
		//맵에  데이터를 추가
		map = new HashMap<>();
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				//String pw = pwd.getText(); //권장하지 않는 메소드
				String pw =String.valueOf(pwd.getPassword());
				String strId = map.get(id);
				if(strId != null &&strId.equals(pw)) {
					lblResult.setForeground(Color.blue);
					lblResult.setText(id+"님 환영합니다.");
				}else {
					lblResult.setForeground(Color.red);
					lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다");
				}
			}
		});
		btnLogin.setBounds(199, 162, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(88, 217, 312, 21);
		contentPane.add(lblResult);
	}
}
