package project_java_db;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ch22_oracle_jdbc.DB;
import ch22_oracle_jdbc.QuestLogin;
import ch22_oracle_jdbc.QuestPlay;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class FoodLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfUserid;
	private JPasswordField pwdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodLogin frame = new FoodLogin();
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
	public FoodLogin() {
		setBackground(new Color(255, 204, 255));
		setFont(new Font("Dialog", Font.BOLD, 15));
		setForeground(Color.BLACK);
		setTitle("관리자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("아이디");
		lblUserid.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		lblUserid.setBounds(75, 101, 85, 15);
		contentPane.add(lblUserid);
		
		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		lblPwd.setBounds(75, 140, 85, 15);
		contentPane.add(lblPwd);
		
		tfUserid = new JTextField();
		tfUserid.setBounds(172, 98, 116, 21);
		contentPane.add(tfUserid);
		tfUserid.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(172, 137, 116, 21);
		contentPane.add(pwdField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodDTO dto = new FoodDTO();
					String strUserid = tfUserid.getText();
					dto.setUserid(strUserid);
					String strPwd = String.valueOf(pwdField.getPassword());
					Connection conn = null;
					PreparedStatement pstmt= null;
					ResultSet rs = null;
					try {
						conn = DB.oraConn();
						String sql = "SELECT * FROM editer\r\n " + 
								" WHERE userid=? AND pwd=?";
						pstmt=conn.prepareStatement(sql);
						pstmt.setString(1, strUserid);
						pstmt.setString(2, strPwd);
						rs = pstmt.executeQuery();
						if(rs.next()) {
							
							FoodList fl =new FoodList();
							fl.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(FoodLogin.this, "아이디와 비밀번호를 확인하세요.");
							
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
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mr02-24\\Desktop\\sd.png"));
		btnNewButton.setBounds(194, 168, 64, 15);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mr02-24\\Desktop\\귀여운_메뉴_일러스트이미지2.png"));
		lblNewLabel.setBounds(-93, -38, 616, 409);
		contentPane.add(lblNewLabel);
	}
}
