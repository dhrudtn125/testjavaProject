package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("학생");
		lblName.setBounds(12, 20, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblprofessor = new JLabel("교수");
		lblprofessor.setBounds(12, 58, 57, 15);
		contentPane.add(lblprofessor);
		
		JLabel lblNewLabel_2 = new JLabel("학과");
		lblNewLabel_2.setBounds(12, 93, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("지도교수별 ");
		lblNewLabel_3.setBounds(12, 128, 122, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("조회하기");
		btnNewButton.setBounds(129, 16, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("조회하기");
		btnNewButton_1.setBounds(129, 54, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("조회하기");
		btnNewButton_2.setBounds(129, 89, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("조회하기");
		btnNewButton_3.setBounds(129, 124, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("조회하기");
		btnNewButton_4.setBounds(129, 173, 97, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("조회하기");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(129, 218, 97, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewStu = new JLabel("학생추가");
		lblNewStu.setBounds(12, 177, 57, 15);
		contentPane.add(lblNewStu);
		
		JLabel lblNewLprof = new JLabel("교수 추가");
		lblNewLprof.setBounds(12, 222, 57, 15);
		contentPane.add(lblNewLprof);
	}
}
