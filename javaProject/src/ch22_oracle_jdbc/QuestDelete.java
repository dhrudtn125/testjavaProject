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

public class QuestDelete extends JFrame {

	private JPanel contentPane;
	private JTextField tfDelUserid;
	private QuestDAO dao;
	private QuestLogin qd;
	private JTextField tfPwd;
	private String userid;
	private String pwd;
	private int result; 

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuestDelete frame = new QuestDelete();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	public QuestDelete (String userid,String pwd) {
		this.userid=userid;
		this.pwd=pwd;
	}

	/**
	 * Create the frame.
	 */
	public QuestDelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("회원탈퇴");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDelUserid = new JLabel("아이디");
		lblDelUserid.setBounds(54, 64, 57, 15);
		contentPane.add(lblDelUserid);
		
		JLabel lblDelPwd = new JLabel("비밀번호");
		lblDelPwd.setBounds(54, 108, 57, 15);
		contentPane.add(lblDelPwd);
		
		tfDelUserid = new JTextField();
		tfDelUserid.setBounds(138, 61, 116, 21);
		contentPane.add(tfDelUserid);
		tfDelUserid.setColumns(10);
		
		JButton btnDelete = new JButton("회원탈퇴");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestDAO dao = new QuestDAO();
				int response=JOptionPane.showConfirmDialog(
						QuestDelete.this, "탈퇴하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					String userid = tfDelUserid.getText();
					String pwd = tfPwd.getText();
					result = dao.deleteQue(userid, pwd);
				}
				if(result==0) {
					JOptionPane.showMessageDialog(QuestDelete.this,"탈퇴가 완료되었습니다." );
					dispose();
				}else{
					JOptionPane.showMessageDialog(QuestDelete.this, "아이디와 비밀번호를 확인하세요.");
					dispose();
				}
				
				
			}
		});
		tfPwd = new JTextField();
		tfPwd.setBounds(138, 105, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
		btnDelete.setBounds(148, 136, 97, 23);
		contentPane.add(btnDelete);
		
	}

}
