package ch17;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class ProgressExam extends JFrame {

	private JPanel contentPane;
	private JProgressBar progress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressExam frame = new ProgressExam();
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
	public ProgressExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		progress = new JProgressBar();
		progress.setStringPainted(true);
		contentPane.add(progress);
		
		JButton btnstart = new JButton("시작");
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread th = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=1;i<=100;i++) {
							progress.setValue(i);
							try{
								Thread.sleep(100);
							}catch (Exception e) {
								e.printStackTrace();
							}
						}
						JOptionPane.showMessageDialog(progressExam.this, "완료");
				};
					
				
			}
		});
		contentPane.add(btnstart);
	}

}
