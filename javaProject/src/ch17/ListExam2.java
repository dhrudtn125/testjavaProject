package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListExam2 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private DefaultListModel model;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExam2 frame = new ListExam2();
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
	public ListExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		tf = new JTextField();
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(tf.getText());  
				list.setModel(model);
				tf.setText("");  //텍스트 클리어
				tf.requestFocus();  //입력포커스 설정
			}
		});
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = list.getSelectedIndex();
				if(selectedIndex !=-1) {  //선택된 값이 없으면 -1 
					System.out.println(selectedIndex);
					model.remove(selectedIndex);
			}
			}	
		});
		panel.add(btnDelete);
		
		model = new DefaultListModel<>();
		model.addElement("사과");
		model.addElement("포도");
		model.addElement("멜론");
		model.addElement("바나나");
		model.addElement("키위");
		list = new JList(model);
		contentPane.add(list, BorderLayout.CENTER);
	}

}
