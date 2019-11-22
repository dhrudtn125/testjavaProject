package project_java_db;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Project extends JFrame{
	JLabel pic;
	Timer tm;
	int x = 0;
	String[] list= {
			"C:\\Users\\mr02-24\\Pictures\\hansot.png",
			"C:\\Users\\mr02-24\\Pictures\\sd.jpg"
	};
	public Project() {
		super("java SlideSow");
		pic = new JLabel();
		pic.setBounds(40, 30, 700, 300);
		SetImageSize(x);
		
		tm = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SetImageSize(x);
				x+=1;
				if(x>list.length)
					x=0;
			}
		});
		add(pic);
		tm.start();
		setLayout(null);
		setSize(800, 400);
		getContentPane().setBackground(Color.decode("#bdb67b"));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg =img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
	}
	
	public static void main(String[] args) {
		new Project();
	}

}
