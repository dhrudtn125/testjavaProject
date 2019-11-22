package ch21_JDBC;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ch22_oracle_jdbc.DB;
import ch22_oracle_jdbc.QuestDAO;
import ch22_oracle_jdbc.QuestDTO;
import ch22_oracle_jdbc.QuestPlay;

public class QuestSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfuserid;
	QuestDTO dto = new QuestDTO();
	QuestDAO dao = new QuestDAO();
	QuestPlay qp = new QuestPlay();
	
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuestSave frame = new QuestSave();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	

	/**
	 * Create the frame.
	 */
	public QuestSave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbluserid = new JLabel("아이디");
		lbluserid.setBounds(55, 60, 57, 15);
		contentPane.add(lbluserid);
		
		tfuserid = new JTextField();
		tfuserid.setBounds(136, 57, 116, 21);
		contentPane.add(tfuserid);
		tfuserid.setColumns(10);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestSave qs = new QuestSave();
				String userid=tfuserid.getText();
				int horn = qp.getAresult();
				int leather = qp.getAresult2();
				dto.setUserid(userid);
				int result=dao.updateQue(dto=new QuestDTO(horn, leather, userid));
				if(result==1) {
					JOptionPane.showMessageDialog(
							QuestSave.this, "저장되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(
							QuestSave.this, "아이디를 확인하세요.");
					dispose();
				}
			}
			
		});
		btnSave.setBounds(148, 103, 97, 23);
		contentPane.add(btnSave);
	}

}
