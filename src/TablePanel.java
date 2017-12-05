import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel {

	private JTable table;
	/**
	 * Create the panel.
	 */
	public TablePanel(int units, double price, double wages) {
		
		setSize(700,700);
		String[] columnNames = { 
				"Units of Labor",
				"MPP",
				"Price",
				"MRP",
				"Wage (= MRC)",
				"Total Revenue"
		};
		
		Object[][] data = new Object[units][];
		for(int i = 0; i < units; i++) {
			data[i] = new Object[]{i+1, "", price, "", wages, ""};
		}
		table = new JTable(data, columnNames);
		
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 1;
			}
		};
		table.setModel(tableModel);
		setLayout(new BorderLayout());
		add(table.getTableHeader(), BorderLayout.PAGE_START);
		add(table, BorderLayout.CENTER);
	}

}
