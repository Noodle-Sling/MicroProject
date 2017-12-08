import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.border.LineBorder;

public class StartScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	private Image title1;
	
	public StartScreen(ActionListener calc, ActionListener info) {
		setOpaque(false);
		setSize(500,500);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{160, 180, 160, 0};
		gridBagLayout.rowHeights = new int[]{134, 54, 42, 55, 49, 55, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		//ImageIcon image = new ImageIcon("Resources/title1.jpg");
		//title1 = image.getImage();
		
		JLabel txtpnGiveUsA = new JLabel();
		txtpnGiveUsA.setFont(new Font("Monotype Corsiva", Font.BOLD, 64));
		txtpnGiveUsA.setText("Give us a 60!");
		GridBagConstraints gbc_txtpnGiveUsA = new GridBagConstraints();
		gbc_txtpnGiveUsA.gridwidth = 4;
		gbc_txtpnGiveUsA.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnGiveUsA.fill = GridBagConstraints.VERTICAL;
		gbc_txtpnGiveUsA.gridx = 0;
		gbc_txtpnGiveUsA.gridy = 0;
		add(txtpnGiveUsA, gbc_txtpnGiveUsA);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLayout(null);
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		gbc_panel1.insets = new Insets(0, 0, 5, 5);
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.gridx = 1;
		gbc_panel1.gridy = 3;
		add(panel1, gbc_panel1);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBounds(0, 0, 175, 50);
		btnInfo.addActionListener(info);
		panel1.add(btnInfo);
		btnInfo.setBorderPainted(false);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(null);
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.insets = new Insets(0, 0, 5, 5);
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.gridx = 1;
		gbc_panel2.gridy = 5;
		add(panel2, gbc_panel2);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setBounds(0, 0, 175, 55);
		btnCalculator.addActionListener(calc);
		panel2.add(btnCalculator);
		btnCalculator.setBorderPainted(false);
		
		JLabel lblSpecialThanksTo = new JLabel("SPECIAL THANKS TO KYLE DOWNIE");
		GridBagConstraints gbc_lblSpecialThanksTo = new GridBagConstraints();
		gbc_lblSpecialThanksTo.gridwidth = 6;
		gbc_lblSpecialThanksTo.gridx = 0;
		gbc_lblSpecialThanksTo.gridy = 8;
		add(lblSpecialThanksTo, gbc_lblSpecialThanksTo);
		
	}
}