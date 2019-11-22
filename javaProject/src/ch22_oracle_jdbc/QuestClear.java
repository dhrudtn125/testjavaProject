package ch22_oracle_jdbc;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class QuestClear extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private QuestDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;
	private QuestDTO dto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestClear frame = new QuestClear();
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
	public QuestClear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 245, 460, 247);
		contentPane.add(scrollPane);
		
		dao = new QuestDAO();
		col = new Vector<>();
		col.add("사원번호");
		col.add("이름");
		col.add("입사일");
		col.add("급여");
		dao.listQue();
		
		table = new JTable(model);
		
		scrollPane.setViewportView(table);
}
	public void list() {
		model = new DefaultTableModel((Vector) dao.listQue(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
}