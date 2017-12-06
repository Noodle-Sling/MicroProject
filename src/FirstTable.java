import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class FirstTable extends JPanel{
	private JTable table;
	private JButton btnContinue;
	private ChartInfo chartinfo;
	private JPanel panel;
	private GridBagConstraints gbc_panel;
	/**
	 * Create the panel.
	 */
	public FirstTable(int units, double price, double wages) {
		setBackground(Color.WHITE);

		setSize(700,700);
		String[] columnNames = { 
				"Units of Labor",
				"MPP",
				"Price",
				"MRP",
				"MRC",
				"Total Revenue"
		};

		Object[][] data = new Object[units][];
		for(int i = 0; i < units; i++) {
			data[i] = new Object[]{i+1, null, price, null, wages, null};
		}


		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
			Class<?>[] types = new Class[] {
					java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, 
					java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
			};

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return types [columnIndex];
			}

			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 1;
			}
		};

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{95, 400, 95, 0};
		gridBagLayout.rowHeights = new int[]{287, 0, 100, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		table = new JTable(data, columnNames);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setGridColor(Color.BLACK);
		table.setModel(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(5       ).setCellRenderer( centerRenderer );

		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(UIManager.getColor("Panel.background"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);

		btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int row = 0; row < table.getRowCount(); row++) {
					if(table.getValueAt(row, 1) != null) {
						double mpp = (double) table.getValueAt(row, 1);
						double price = (double) table.getValueAt(row, 2);
						double wage = (double) table.getValueAt(row, 4);
						double mrp = mpp * price;
						double rev = 0;
						table.setValueAt(mrp, row, 3);
						for(int i = 0; i <= row; i++) {
							rev += (double) table.getValueAt(i, 3);
						}
						table.setValueAt(rev, row, 5);
					}
					else {
						table.setValueAt(null, row, 3);
						table.setValueAt(null, row, 5);
					}
				}
				if(tableFull()) {
					panel.remove(btnContinue);
					DisplayChart();
					panel.add(chartinfo);
					revalidate();
					repaint();
				}
			}
		});
		btnContinue.setBorderPainted(false);
		panel.add(btnContinue);
		btnContinue.setContentAreaFilled(false);
		btnContinue.setBackground(Color.RED);
		btnContinue.setPreferredSize(new Dimension(200, 50)); 
	
	}

	public boolean tableFull() {
		if(table.getCellEditor()!=null) {
			table.getCellEditor().stopCellEditing();
		}

		for(int i=0;i< table.getRowCount();i++) {
			for (int j=0;j<table.getColumnCount();j++) {
				if(table.getValueAt(i, j) == null) {
					return false;
				}
			}
		}
		return true;
	}
	private void DisplayChart() {
		int MaxMRP = MaxMRP();
		double MaxMPP = MaxMPP(MaxMRP);
		double MaxProfit = MaxProfit(MaxMRP);
		chartinfo = new ChartInfo(MaxMRP,MaxMPP,MaxProfit);
		revalidate();
		repaint();
	}
	private int MaxMRP() {
		for (int i = 1 ; i < table.getRowCount() ; i++) {
			if((double)table.getValueAt(i, 3) < (double)table.getValueAt(i, 4)) {
				return (int)table.getValueAt(i-1, 0);
			}
		}
		return (int) table.getValueAt(table.getRowCount()-1, 0);
	}
	private double MaxMPP(int MRP) {
		return (double)table.getValueAt(MRP-1, 5) / (double)table.getValueAt(MRP-1, 2);
	}
	private double MaxProfit(int MRP) {
		return (double)(table.getValueAt(MRP-1, 5)) - (int)(table.getValueAt(MRP-1, 0))*(double)(table.getValueAt(MRP-1, 4));
	}
}