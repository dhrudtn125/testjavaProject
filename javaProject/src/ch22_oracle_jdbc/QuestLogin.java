package ch22_oracle_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class QuestLogin extends JFrame {

	private JPanel contentPane;
	JTextField tfUserid;
	private JPasswordField pfPwd;
	
	private QuestDAO dao;
	QuestDTO dto = new QuestDTO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestLogin frame = new QuestLogin();
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
	public QuestLogin() {
		dao = new QuestDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("아이디");
		lblUserid.setBounds(84, 86, 57, 15);
		contentPane.add(lblUserid);
		
		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setBounds(84, 116, 57, 15);
		contentPane.add(lblPwd);
		
		tfUserid = new JTextField();
		tfUserid.setBounds(169, 83, 116, 21);
		contentPane.add(tfUserid);
		tfUserid.setColumns(10);
		
		pfPwd = new JPasswordField();
		pfPwd.setBounds(169, 114, 117, 18);
		contentPane.add(pfPwd);
		
		JButton btnLogIn = new JButton("로그인");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strUserid = tfUserid.getText();
				dto.setUserid(strUserid);
				String strPwd = String.valueOf(pfPwd.getPassword());
				Connection conn = null;
				PreparedStatement pstmt= null;
				ResultSet rs = null;
				try {
					conn = DB.oraConn();
					String sql = "SELECT * FROM quest\r\n " + 
							" WHERE userid=? AND pwd=?";
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, strUserid);
					pstmt.setString(2, strPwd);
					rs = pstmt.executeQuery();
					if(rs.next()) {
						
						QuestPlay qp = new QuestPlay();
						qp.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(QuestLogin.this, "아이디와 비밀번호를 확인하세요.");
						
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}finally {
					try {
						if(rs!=null)rs.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						if(pstmt!=null) pstmt.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						if(conn!=null) conn.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
		});
		btnLogIn.setBounds(179, 142, 97, 23);
		contentPane.add(btnLogIn);
		
		JButton btnInsertUserid = new JButton("회원가입");
		btnInsertUserid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestInsert qi = new QuestInsert();
				qi.setVisible(true);
				qi.setLocation(550, 100);
			}
		});
		btnInsertUserid.setBounds(124, 175, 97, 23);
		contentPane.add(btnInsertUserid);
		
		JButton btnDeleteUserid = new JButton("회원탈퇴");
		btnDeleteUserid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			QuestDelete qd = new QuestDelete();
			qd.setVisible(true);
			qd.setLocation(550, 100);
			}
		});
		btnDeleteUserid.setBounds(235, 175, 97, 23);
		contentPane.add(btnDeleteUserid);
	}
}
