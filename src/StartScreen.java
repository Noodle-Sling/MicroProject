import javax.swing.JPanel;
import java.awt.GridBagLayout;
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
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class StartScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartScreen(ActionListener calc, ActionListener info) {
		setOpaque(false);
		setSize(700,700);
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 700, 700);
		add(layeredPane);
		
		Icon icon = new ImageIcon("Resources/ezgif.com-optimize.gif");
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 700, 700);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel txtpnGiveUsA = new JLabel();
		txtpnGiveUsA.setBounds(199, 134, 297, 73);
		panel.add(txtpnGiveUsA);
		txtpnGiveUsA.setFont(new Font("Monotype Corsiva", Font.BOLD, 64));
		txtpnGiveUsA.setText("Give us a 60!");
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(261, 254, 190, 50);
		panel.add(panel1);
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLayout(null);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBounds(0, 0, 190, 50);
		panel1.add(btnInfo);
		btnInfo.addActionListener(info);
		btnInfo.setBorderPainted(false);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(261, 358, 190, 55);
		panel.add(panel2);
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(null);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setBounds(0, 0, 190, 55);
		panel2.add(btnCalculator);
		btnCalculator.addActionListener(calc);
		btnCalculator.setBorderPainted(false);
		layeredPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, txtpnGiveUsA, panel1, btnInfo, panel2, btnCalculator}));
		
	}
}
