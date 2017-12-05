import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

public class FirstTable extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FirstTable(int units, double price, double wage) {
		setSize(600,600);
		String[] columnNames = {
				"Units of Labor",
				"MPP",
				"Price",
				"MRP",
				"Wage (= MRC)",
				"Total Revenue"
		};
		
		Object[][] data = new Object[units][];
		for (int i = 0 ; i < units ; i++) {
			data[i] = new Object[] {i, null, price , null, wage, null};
		}
		
		table = new JTable(data,columnNames);
		setLayout(new BorderLayout());
		add(table.getTableHeader(),BorderLayout.PAGE_START);
		add(table, BorderLayout.CENTER);
		

	}

}
