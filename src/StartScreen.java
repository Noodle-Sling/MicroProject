import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class StartScreen extends JPanel {
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	private final JButton btnNewButton = new JButton("Continue");
	private int units;
	private double wage;
	private double price;

	public StartScreen(ActionListener moveOn) {
		setSize(350,350);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{31, 160, 0, 0};
		gbl_panel.rowHeights = new int[]{83, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_panel);
		
		JLabel lblTitle = new JLabel("Profit-Maximizing Labor Input Calculator");
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 0;
		add(lblTitle, gbc_lblTitle);
		
		JLabel lblHowManyUnits = new JLabel("How many Units of Labor are you using?");
		GridBagConstraints gbc_lblHowManyUnits = new GridBagConstraints();
		gbc_lblHowManyUnits.insets = new Insets(0, 0, 5, 5);
		gbc_lblHowManyUnits.gridx = 1;
		gbc_lblHowManyUnits.gridy = 1;
		add(lblHowManyUnits, gbc_lblHowManyUnits);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblWhatIsThe_1 = new JLabel("What is the Price per unit?");
		GridBagConstraints gbc_lblWhatIsThe_1 = new GridBagConstraints();
		gbc_lblWhatIsThe_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhatIsThe_1.gridx = 1;
		gbc_lblWhatIsThe_1.gridy = 3;
		add(lblWhatIsThe_1, gbc_lblWhatIsThe_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblWhatIsThe = new JLabel("What Is The Wage Rate?");
		GridBagConstraints gbc_lblWhatIsThe = new GridBagConstraints();
		gbc_lblWhatIsThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhatIsThe.gridx = 1;
		gbc_lblWhatIsThe.gridy = 5;
		add(lblWhatIsThe, gbc_lblWhatIsThe);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 6;
		add(textField_2, gbc_textField_2);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		btnNewButton.addActionListener(moveOn);
		add(btnNewButton, gbc_btnNewButton);
	}

}
