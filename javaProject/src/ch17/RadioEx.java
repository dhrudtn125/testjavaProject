package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioEx extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioEx frame = new RadioEx();
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
	public RadioEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdoCyan = new JRadioButton("Cyan");
		rdoCyan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.cyan);
			}
		});
		buttonGroup.add(rdoCyan);
		contentPane.add(rdoCyan);
		
		JRadioButton rdoMagenta = new JRadioButton("Magenta");
		rdoMagenta.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.magenta);
			}
		});
		buttonGroup.add(rdoMagenta);
		contentPane.add(rdoMagenta);
		
		JRadioButton rdoRed = new JRadioButton("Red");
		rdoRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		buttonGroup.add(rdoRed);
		contentPane.add(rdoRed);
		
		JRadioButton rdoGreen = new JRadioButton("Green");
		rdoGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		buttonGroup.add(rdoGreen);
		contentPane.add(rdoGreen);
		
		JRadioButton rdoDarkGray = new JRadioButton("DarkGray");
		rdoDarkGray.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.darkGray);
			}
		});
		buttonGroup.add(rdoDarkGray);
		contentPane.add(rdoDarkGray);
		
		JRadioButton rdoYellow = new JRadioButton("Yellow");
		rdoYellow.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.yellow);
			}
		});
		buttonGroup.add(rdoYellow);
		contentPane.add(rdoYellow);
	}

}
