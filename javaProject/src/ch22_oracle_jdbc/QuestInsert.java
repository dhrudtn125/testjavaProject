package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestInsert extends JFrame {

	private JPanel contentPane;
	private JTextField tfNewName;
	private JTextField tfNewUserid;
	private JTextField tfPwd;
	
	private QuestLogin qi;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuestInsert frame = new QuestInsert();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public QuestInsert(QuestLogin qi) {
	this();
	this.qi = qi;
	}

	/**
	 * Create the frame.
	 */
	public QuestInsert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 300);
		setTitle("회원가입");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameIn = new JLabel("이름");
		lblNameIn.setBounds(46, 44, 57, 15);
		contentPane.add(lblNameIn);
		
		JLabel lblNewUserid = new JLabel("아이디");
		lblNewUserid.setBounds(46, 84, 57, 15);
		contentPane.add(lblNewUserid);
		
		JLabel lblNewPwd = new JLabel("비밀번호");
		lblNewPwd.setBounds(46, 126, 57, 15);
		contentPane.add(lblNewPwd);
		
		tfNewName = new JTextField();
		tfNewName.setBounds(115, 41, 116, 21);
		contentPane.add(tfNewName);
		tfNewName.setColumns(10);
		
		tfNewUserid = new JTextField();
		tfNewUserid.setBounds(115, 81, 116, 21);
		contentPane.add(tfNewUserid);
		tfNewUserid.setColumns(10);
		
		JButton btnQuestIn = new JButton("회원가입");
		btnQuestIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestDAO dao = new QuestDAO();
				String name = tfNewName.getText();
				String userid = tfNewUserid.getText();
				String pwd = tfPwd.getText();
				QuestDTO dto = new QuestDTO(userid, name, pwd);
				int result = dao.insertQue(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(QuestInsert.this, "회원가입이 완료되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(QuestInsert.this, "아이디가 중복되었습니다.");
					dispose();
				}
			}
		});
		btnQuestIn.setBounds(125, 168, 97, 23);
		contentPane.add(btnQuestIn);
		
		JLabel lblNewResult = new JLabel("");
		lblNewResult.setBounds(35, 211, 231, 15);
		contentPane.add(lblNewResult);
		
		tfPwd = new JTextField();
		tfPwd.setBounds(115, 123, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
	}

}
