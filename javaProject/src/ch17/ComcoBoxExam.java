package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;

public class ComcoBoxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComcoBoxExam frame = new ComcoBoxExam();
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
	public ComcoBoxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JComboBox cbo = new JComboBox();
		cbo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					ta.setText("");
					int dan = cbo.getSelectedIndex()+2;
					for(int i=1;i<=9;i++) {
						ta.append(str);
					}
				}
			}
		});
		cbo.setModel(new DefaultComboBoxModel(new String[] {"2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단"}));
		contentPane.add(cbo, BorderLayout.NORTH);
		
		ta = new JTextArea();
		contentPane.add(ta, BorderLayout.CENTER);
	}

}
