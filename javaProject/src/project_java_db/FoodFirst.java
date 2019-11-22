package project_java_db;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class FoodFirst extends JFrame {

	private JPanel contentPane;
	static Image img = null;
	/**
	 * Launch the application.
	 */
	


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					img = ImageIO.read(new File("e:\\hansot.png"));
					FoodFirst frame = new FoodFirst();
					frame.setBounds(12, 35, 460, 347);
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
	public FoodFirst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnloadMenu = new JButton("주문하기");
		btnloadMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodMain fm =new FoodMain();
				fm.setVisible(true);
				dispose();
			}
		});
		btnloadMenu.setBounds(154, 176, 106, 23);
		contentPane.add(btnloadMenu);
		
		JButton btnEdit = new JButton("관리자모드");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodLogin fl = new FoodLogin();
				fl.setVisible(true);
				dispose();
				
			}
		});
		btnEdit.setBounds(308, 239, 126, 23);
		contentPane.add(btnEdit);
		
		JLabel lblNewLabel_1 = new JLabel("         무인주문기");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(0, 12, 327, 126);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mr02-24\\Desktop\\귀여운_메뉴_일러스트이미지2.png"));
		lblNewLabel.setBounds(0, -201, 704, 496);
		contentPane.add(lblNewLabel);
	}
	class MyPanel extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);
        }
    }
}
