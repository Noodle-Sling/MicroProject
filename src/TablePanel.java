import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TablePanel extends JPanel implements TableModelListener{

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
			data[i] = new Object[]{i+1, null, price, null, wages, null};
		}
		table = new JTable(data, columnNames);
		
		
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
		table.setModel(tableModel);
		table.getModel().addTableModelListener(this);
		setLayout(new BorderLayout());
		add(table.getTableHeader(), BorderLayout.PAGE_START);
		add(table, BorderLayout.CENTER);
	}
	
	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		System.out.println(row);
	}

}
