package project_java_db;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class back extends JFrame {


	   JScrollPane scrollPane;


	    ImageIcon icon;


	 


	    public back() {


	        icon = new ImageIcon(("hansot.png"));


	        


	        //배경 Panel 생성후 컨텐츠페인으로 지정       


	        JPanel background = new JPanel() {


	            public void paintComponent(Graphics g) {


	                // Approach 1: Dispaly image at at full size


	                g.drawImage(icon.getImage(), 0, 0, null);


	                // Approach 2: Scale image to size of component


	                // Dimension d = getSize();


	                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);


	               // Approach 3: Fix the image position in the scroll pane


	                // Point p = scrollPane.getViewport().getViewPosition();


	                // g.drawImage(icon.getImage(), p.x, p.y, null);


	                setOpaque(false); //그림을 표시하게 설정,투명하게 조절


	                super.paintComponent(g);


	            }


	        };

	        scrollPane = new JScrollPane(background);


	        setContentPane(scrollPane);


	    }




			

			
		}
