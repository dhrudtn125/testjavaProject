package project_java_db;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class BackGround extends JFrame{
	JLabel pic;
	int x = 0;
	String[] list= {
			"C:\\Users\\mr02-24\\Pictures\\hansot.png"
	};
	public void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg =img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
	}
	public BackGround() {
		
		pic = new JLabel();
		pic.setBounds(40, 30, 700, 300);
		SetImageSize(x);
		
		
		add(pic);
}
}
