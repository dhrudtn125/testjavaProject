package project_java_db;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class FoodMain extends JFrame {

	private JPanel contentPane;
	private JTextField tfEname;
	private JTable table;
	private JTable table2; 
    private DefaultTableModel model2;
    private byte[] Image;


	
	private FoodDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;
	private FoodDTO2 dto2;
	private JLabel lblplusPrice;
	private JLabel lblpoint;
	private JButton btnOrder;
	private JButton btnClose;
	private JTable table_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbAll;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodMain frame = new FoodMain();
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
	public FoodMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 35, 460, 247);
		contentPane.add(scrollPane);
		
		dao = new FoodDAO();
		col = new Vector<String>();
		col.add("음식명");
		col.add("가격");
		
		list();
		
		table = new JTable(model);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 12));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx = table.getSelectedRow();
				String data[] = new String[table.getColumnCount()];//열만큼 문자열 생성
				for(int i=0;i < table.getColumnCount();i++) 
					data[i] = (String)table.getValueAt(idx, i);
				model2.addRow(data);
				lblplusPrice.setText(table.getValueAt(idx, 1)+"원");
				lblpoint.setText("총 : "+Integer.toString(getSum())+"원");
			}
		});
		
			model2 = new DefaultTableModel(col, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
		
		
		
		scrollPane.setViewportView(table);
		
		lblplusPrice = new JLabel("");
		lblplusPrice.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblplusPrice.setBounds(12, 426, 252, 28);
		contentPane.add(lblplusPrice);
		
		lblpoint = new JLabel("");
		lblpoint.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblpoint.setBounds(8, 464, 256, 28);
		contentPane.add(lblpoint);
		
		
		
		
		btnClose = new JButton("종료");
		btnClose.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(375, 469, 97, 23);
		contentPane.add(btnClose);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 296, 460, 110);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable(model2);
		table_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 12));
		scrollPane_1.setViewportView(table_1);
		
		JRadioButton rdRice = new JRadioButton("밥 류");
		rdRice.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		rdRice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				listRice();
				table = new JTable(model);
				scrollPane.setViewportView(table);
				table_1 = new JTable(model2);
				scrollPane_1.setViewportView(table_1);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int idx = table.getSelectedRow();
						String data[] = new String[table.getColumnCount()];//열만큼 문자열 생성
						for(int i=0;i < table.getColumnCount();i++) 
							data[i] = (String)table.getValueAt(idx, i);
						model2.addRow(data);
						lblplusPrice.setText(table.getValueAt(idx, 1)+"원");
						lblpoint.setText("총 : "+Integer.toString(getSum())+"원");
					}
				});
			}
		});
		buttonGroup.add(rdRice);
		rdRice.setBounds(136, 6, 58, 23);
		contentPane.add(rdRice);
		
		JRadioButton rdNoodle = new JRadioButton("면 류");
		rdNoodle.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		rdNoodle.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				listNoodle();
				table = new JTable(model);
				scrollPane.setViewportView(table);
				table_1 = new JTable(model2);
				scrollPane_1.setViewportView(table_1);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int idx = table.getSelectedRow();
						String data[] = new String[table.getColumnCount()];//열만큼 문자열 생성
						for(int i=0;i < table.getColumnCount();i++) 
							data[i] = (String)table.getValueAt(idx, i);
						model2.addRow(data);
						lblplusPrice.setText(table.getValueAt(idx, 1)+"원");
						lblpoint.setText("총 : "+Integer.toString(getSum())+"원");
					}
				});
			}
		});
		buttonGroup.add(rdNoodle);
		rdNoodle.setBounds(202, 6, 58, 23);
		contentPane.add(rdNoodle);
		
		JRadioButton rdSide = new JRadioButton("사이드 메뉴");
		rdSide.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		rdSide.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				listSide();
				
				table = new JTable(model);
				scrollPane.setViewportView(table);
				table_1 = new JTable(model2);
				scrollPane_1.setViewportView(table_1);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int idx = table.getSelectedRow();
						String data[] = new String[table.getColumnCount()];//열만큼 문자열 생성
						for(int i=0;i < table.getColumnCount();i++) 
							data[i] = (String)table.getValueAt(idx, i);
						model2.addRow(data);
						
						lblplusPrice.setText(table.getValueAt(idx, 1)+"원");
						lblpoint.setText("총 : "+Integer.toString(getSum())+"원");
						
							
						
					}
				});
			}
		});
		buttonGroup.add(rdSide);
		rdSide.setBounds(268, 6, 118, 23);
		contentPane.add(rdSide);
		
		rbAll = new JRadioButton("모든메뉴");
		rbAll.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		rbAll.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				list();
				table = new JTable(model);
				scrollPane.setViewportView(table);
				table_1 = new JTable(model2);
				scrollPane_1.setViewportView(table_1);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int idx = table.getSelectedRow();
						String data[] = new String[table.getColumnCount()];//열만큼 문자열 생성
						for(int i=0;i < table.getColumnCount();i++) 
							data[i] = (String)table.getValueAt(idx, i);
						model2.addRow(data);
						lblplusPrice.setText(table.getValueAt(idx, 1)+"원");
						lblpoint.setText("총 : "+Integer.toString(getSum())+"원");
						
					}
				});
			}
		});
		buttonGroup.add(rbAll);
		rbAll.setBounds(12, 6, 86, 23);
		contentPane.add(rbAll);
	btnOrder = new JButton("주문하기");
	btnOrder.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
	btnOrder.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int rowsCount = table_1.getRowCount();
			String money = lblpoint.getText(); 
			int respone = JOptionPane.showConfirmDialog(FoodMain.this, "총"+rowsCount+" 품목 "+money+"원 입니다 주문하시겠습니까?");
			if(respone==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(FoodMain.this, "주문이 완료되었습니다. ");
				FoodFirst ff=new FoodFirst();
				ff.setVisible(true);
				dispose();
				
			}else {
				JOptionPane.showMessageDialog(FoodMain.this, "주문을 취소하였습니다");
				while(model2.getRowCount() > 0)
				model2.removeRow(0);;
		
				
			}
		}
	});
	btnOrder.setBounds(276, 469, 97, 23);
	contentPane.add(btnOrder);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mr02-24\\Desktop\\귀여운_메뉴_일러스트이미지2.png"));
	lblNewLabel.setBounds(0, 0, 484, 502);
	contentPane.add(lblNewLabel);
	}
	
//	public void input() {
//		String foodname = tfFoodname.getText();
//		int price = Integer.parseInt(tfPrice.getText());
//		dto2 = new FoodDTO2(foodname,price);
//	}
	
//	public void clear() {
//		tfPrice.setText("");
//		tfFoodname.setText("");
//		tfPrice.requestFocus();
//		tfPrice.setEditable(true);
//	}
	
	public void list() {
		model = new DefaultTableModel((Vector) dao.listFood(dto2), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	public void listRice() {
		model = new DefaultTableModel((Vector) dao.listFoodRice(dto2), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	public void listNoodle() {
		model = new DefaultTableModel((Vector) dao.listFoodNoodle(dto2), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	public void listSide() {
		model = new DefaultTableModel((Vector) dao.listFoodSide(dto2), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	
	public int getSum() {
		int rowsCount = table_1.getRowCount();
		int sum =0;
		for(int i=0; i< rowsCount;i++) {
			sum = sum+Integer.parseInt(table_1.getValueAt(i, 1).toString());
		}
		return sum;
	}
}
