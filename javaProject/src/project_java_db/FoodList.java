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
import javax.swing.ImageIcon;
import java.awt.Font;

public class FoodList extends JFrame {

	private JPanel contentPane;
	private JTextField tfPrice;
	private JTextField tfEname;
	private JTextField tfSearch;
	private JTable table;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnSearch;
	
	private FoodDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;
	private FoodDTO2 dto2;
	private JTextField tfFoodname;
	private JLabel lblKindcode;
	private JTextField tfKind;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodList frame = new FoodList();
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
	public FoodList() {
		setFont(new Font("배달의민족 주아", Font.BOLD, 15));
		setTitle("관리자모드");
		BackGround bg = new BackGround();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 245, 460, 247);
		contentPane.add(scrollPane);
		
		dao = new FoodDAO();
		col = new Vector<String>();
		col.add("음식명");
		col.add("가격");
		col.add("종류");
		
		list();
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx = table.getSelectedRow();
				tfPrice.setEditable(false);
				tfPrice.setText(table.getValueAt(idx, 1)+"");
				tfFoodname.setText(table.getValueAt(idx, 0)+"");
				tfKind.setText(table.getValueAt(idx, 2)+"");
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("음식명");
		lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 30, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfFoodname = new JTextField();
		tfFoodname.setBounds(81, 27, 116, 21);
		contentPane.add(tfFoodname);
		tfFoodname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("가격");
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 61, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(81, 58, 116, 21);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("음식명을 입력하세요");
		lblNewLabel_4.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(12, 179, 144, 15);
		contentPane.add(lblNewLabel_4);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(188, 176, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insertFood(dto2);
				if(result==1) {
					JOptionPane.showMessageDialog(FoodList.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
				
			}
		});
		btnSave.setBounds(330, 26, 97, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("배달의민족 주아", Font.BOLD, 15));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String foodname = tfFoodname.getText();
				int result = 0;
				int response = JOptionPane.showConfirmDialog(
						FoodList.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result = dao.deleteFood(foodname);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(
							FoodList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(330, 57, 97, 23);
		contentPane.add(btnDelete);
		
		btnUpdate = new JButton("수정");
		btnUpdate.setFont(new Font("배달의민족 주아", Font.BOLD, 15));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.updateFood(dto2);
				if(result==1) {
					JOptionPane.showMessageDialog(
							FoodList.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(330, 88, 97, 23);
		contentPane.add(btnUpdate);
		
		btnSearch = new JButton("찾기");
		btnSearch.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(330, 175, 97, 23);
		contentPane.add(btnSearch);
		
		lblKindcode = new JLabel("종류");
		lblKindcode.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblKindcode.setBounds(12, 92, 57, 15);
		contentPane.add(lblKindcode);
		
		tfKind = new JTextField();
		tfKind.setBounds(81, 89, 116, 21);
		contentPane.add(tfKind);
		tfKind.setColumns(10);
		
		lblNewLabel_2 = new JLabel("code: 밥-1,면-2 사이드메뉴- 3");
		lblNewLabel_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 139, 292, 15);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\mr02-24\\Desktop\\귀여운_메뉴_일러스트이미지2.png"));
		lblNewLabel_3.setBounds(-117, -149, 1022, 701);
		contentPane.add(lblNewLabel_3);
	}
	
	public void search() {
		String foodname = tfSearch.getText();
		model = new DefaultTableModel(dao.searchFood(foodname),col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}
	
	public void input() {
		String foodname = tfFoodname.getText();
		int price = Integer.parseInt(tfPrice.getText()+"");
		int kind = Integer.parseInt(tfKind.getText()+"");
		dto2 = new FoodDTO2(foodname,price,kind);
	}
	
	public void clear() {
		tfPrice.setText("");
		tfFoodname.setText("");
		tfPrice.requestFocus();
		tfPrice.setEditable(true);
	}
	
	public void list() {
		model = new DefaultTableModel((Vector) dao.listFood(dto2), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
}
