package ch22_oracle_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class QuestPlay extends JFrame {

	private JPanel contentPane;
	QuestPlus qp = new QuestPlus();
	int result,result2;
	private JLabel lblresult,lblresult2;
	QuestDTO dto =new QuestDTO();
	QuestDAO dao =new QuestDAO();
	int clear;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestPlay frame = new QuestPlay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getResult2() {
		return result2;
	}

	public void setResult2(int result2) {
		this.result2 = result2;
	}

	public void plus() {
		
		setResult(result+1);
	}
public void plus2() {
		
		setResult2(result2+1);
		
	}
	/**
	 * Create the frame.
	 */
	public QuestPlay() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhorn = new JLabel("뿔");
		lblhorn.setBounds(12, 49, 57, 15);
		contentPane.add(lblhorn);
		
		JLabel lblleather = new JLabel("가죽");
		lblleather.setBounds(12, 95, 57, 15);
		contentPane.add(lblleather);
		JLabel lblNewResult = new JLabel("");
		lblNewResult.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewResult.setBounds(12, 214, 357, 15);
		contentPane.add(lblNewResult);
		
		JLabel lblNewResult2 = new JLabel("");
		lblNewResult2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewResult2.setBounds(12, 166, 344, 15);
		contentPane.add(lblNewResult2);
		JButton btnQuesthorn = new JButton("획득하기");
		btnQuesthorn.setVerticalAlignment(SwingConstants.TOP);
		btnQuesthorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				switch(rand.nextInt(50)) {
				case 1: plus();lblresult.setText("획득 성공하였습니다!!!!!!!!");lblNewResult2.setText("획득한 뿔 : "+getResult());break;
				case 2: plus();lblresult.setText("획득 성공하였습니다!!!!!!!!");lblNewResult2.setText("획득한 뿔 : "+getResult());break;
				case 3: plus();lblresult.setText("획득 성공하였습니다!!!!!!!!");lblNewResult2.setText("획득한 뿔 : "+getResult());break;
				case 4: plus();lblresult.setText("획득 성공하였습니다!!!!!!!!");lblNewResult2.setText("획득한 뿔 : "+getResult());break;
				case 5: plus();lblresult.setText("획득 성공하였습니다!!!!!!!!");lblNewResult2.setText("획득한 뿔 : "+getResult());break;
				default : lblresult.setText("획득에 실패하였습니다.");
				}
				
			}
		});
		btnQuesthorn.setBounds(72, 45, 97, 23);
		contentPane.add(btnQuesthorn);
		
		
		JButton btnQuestLeather = new JButton("획득하기");
		btnQuestLeather.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				switch(rand.nextInt(50)) {
				case 1: plus2();lblresult2.setText("획득 성공하였습니다!!!!!!!!");lblNewResult.setText("획득한 가죽 : "+getResult2());break;
				case 2: plus2();lblresult2.setText("획득 성공하였습니다!!!!!!!!");lblNewResult.setText("획득한 가죽 : "+getResult2());break;
				case 3: plus2();lblresult2.setText("획득 성공하였습니다!!!!!!!!");lblNewResult.setText("획득한 가죽 : "+getResult2());break;
				case 4: plus2();lblresult2.setText("획득 성공하였습니다!!!!!!!!");lblNewResult.setText("획득한 가죽 : "+getResult2());break;
				case 5: plus2();lblresult2.setText("획득 성공하였습니다!!!!!!!!");lblNewResult.setText("획득한 가죽 : "+getResult2());break;
				default : lblresult2.setText("획득에 실패하였습니다.");
				}
			}
		});
		btnQuestLeather.setBounds(72, 91, 97, 23);
		contentPane.add(btnQuestLeather);
		
		lblresult = new JLabel("");
		lblresult.setBounds(197, 49, 225, 19);
		contentPane.add(lblresult);
		
		lblresult2 = new JLabel("");
		lblresult2.setBounds(197, 95, 225, 15);
		contentPane.add(lblresult2);
		
		JButton btnselect = new JButton("확인");
		btnselect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(getResult()>=5 && getResult2()>=5) {
					JOptionPane.showMessageDialog(QuestPlay.this, "완료하였습니다!!");;
					int clear_num = clear+1;
					String strUserid =dto.getUserid();
					QuestDTO dto = new QuestDTO(strUserid,clear_num);
					dao.getClear(dto);
					dispose();
				}else {
					JOptionPane.showMessageDialog(QuestPlay.this, "재료가 부족합니다.");
				}
			}
		});
		btnselect.setBounds(337, 229, 97, 23);
		contentPane.add(btnselect);
		
	}
}
