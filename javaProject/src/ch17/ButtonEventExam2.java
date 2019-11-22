package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonEventExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEventExam2 frame = new ButtonEventExam2();
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
	public ButtonEventExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnBlue = new JButton("Blue");
		contentPane.add(btnBlue);
		
		JButton btnBlack = new JButton("Black");
		contentPane.add(btnBlack);
		
		JButton btnMagenta = new JButton("Magenta");
		contentPane.add(btnMagenta);
		
		JButton btnCyan = new JButton("Cyan");
		contentPane.add(btnCyan);
		
		JButton btnGreen = new JButton("Green");
		contentPane.add(btnGreen);
		btnBlue.addActionListener(new MyColorAction(this,Color.blue));
		btnBlack.addActionListener(new MyColorAction(this,Color.black));
		btnMagenta.addActionListener(new MyColorAction(this,Color.magenta));
		btnCyan.addActionListener(new MyColorAction(this,Color.cyan));
		btnGreen.addActionListener(new MyColorAction(this,Color.green));
		
	}

}
