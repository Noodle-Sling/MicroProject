import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class ChartInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChartInfo(int MaxMRP,double MaxMPP,double MaxProfit) {
		setSize(400,100);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{133, 104, 30, 133, 0};
		gridBagLayout.rowHeights = new int[]{13, 25, 24, 25, 13, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Profit-maximizing input of labor is:"  );
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(MaxMRP + "");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblTheFirmsExpected = new JLabel("The firm's expected output is:");
		lblTheFirmsExpected.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblTheFirmsExpected = new GridBagConstraints();
		gbc_lblTheFirmsExpected.anchor = GridBagConstraints.EAST;
		gbc_lblTheFirmsExpected.insets = new Insets(0, 0, 5, 5);
		gbc_lblTheFirmsExpected.gridx = 1;
		gbc_lblTheFirmsExpected.gridy = 2;
		add(lblTheFirmsExpected, gbc_lblTheFirmsExpected);
		
		JLabel lblNewLabel_1 = new JLabel(MaxMPP + "");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblTheFirmsExpected_1 = new JLabel("The firm's expected profit is:");
		GridBagConstraints gbc_lblTheFirmsExpected_1 = new GridBagConstraints();
		gbc_lblTheFirmsExpected_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTheFirmsExpected_1.anchor = GridBagConstraints.EAST;
		gbc_lblTheFirmsExpected_1.gridx = 1;
		gbc_lblTheFirmsExpected_1.gridy = 3;
		add(lblTheFirmsExpected_1, gbc_lblTheFirmsExpected_1);
		
		JLabel label_1 = new JLabel(MaxProfit + "");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 3;
		add(label_1, gbc_label_1);
	}

}