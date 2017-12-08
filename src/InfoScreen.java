
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class InfoScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public InfoScreen(ActionListener home) {
		setBackground(new Color(255, 165, 0));
		setLayout(null);
		setSize(700, 700);
		
		JPanel panelHome = new JPanel();
		panelHome.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelHome.setBackground(Color.LIGHT_GRAY);
		panelHome.setBounds(0, 628, 150, 50);
		add(panelHome);
		panelHome.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(0, 0, 150, 50);
		btnHome.setAlignmentY(Component.TOP_ALIGNMENT);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		btnHome.setBackground(Color.RED);
		panelHome.add(btnHome);
		btnHome.addActionListener(home);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 700, 680);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("LABOR MARKETS", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{88, 507, 84, 0};
		gbl_panel.rowHeights = new int[]{104, 292, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTextPane txtpnLaborMarketsCan = new JTextPane();
		txtpnLaborMarketsCan.setBackground(new Color(147, 112, 219));
		txtpnLaborMarketsCan.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnLaborMarketsCan.setText("Labor markets can be perfectly competitive or some degree of monopsonistic (this calculator only works for perfectly competitive markets). A labor market is a form of resource or factor market, in which businesses hire or purchase units of a resource to produce a certain amount of product. In a perfectly competitive labor market, both the supply of labor and demand for the product are perfectly elastic, so worker wages and product prices stay the same no matter how many units of labor are employed.");
		GridBagConstraints gbc_txtpnLaborMarketsCan = new GridBagConstraints();
		gbc_txtpnLaborMarketsCan.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnLaborMarketsCan.fill = GridBagConstraints.BOTH;
		gbc_txtpnLaborMarketsCan.gridx = 1;
		gbc_txtpnLaborMarketsCan.gridy = 1;
		panel.add(txtpnLaborMarketsCan, gbc_txtpnLaborMarketsCan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("VALUE AND COST", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{88, 507, 84, 0};
		gbl_panel_2.rowHeights = new int[]{104, 292, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JTextPane txtpnEachAdditionalUnit = new JTextPane();
		txtpnEachAdditionalUnit.setText("Each additional unit of labor produces a certain amount of product. This quantity is known as Marginal Physical Product (MPP): the additional product an additional unit of labor adds. Since each product is worth the same price, multiplying MPP by price gives each worker's Marginal Revenue Product (MRP), the actual value they add to the company. But each worker also has a Marginal Resource Cost (MRC), or how much value the business loses in keeping them employed.");
		txtpnEachAdditionalUnit.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnEachAdditionalUnit.setBackground(new Color(147, 112, 219));
		GridBagConstraints gbc_txtpnEachAdditionalUnit = new GridBagConstraints();
		gbc_txtpnEachAdditionalUnit.fill = GridBagConstraints.BOTH;
		gbc_txtpnEachAdditionalUnit.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnEachAdditionalUnit.gridx = 1;
		gbc_txtpnEachAdditionalUnit.gridy = 1;
		panel_2.add(txtpnEachAdditionalUnit, gbc_txtpnEachAdditionalUnit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("PROFIT, BABY", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{88, 507, 84, 0};
		gbl_panel_1.rowHeights = new int[]{104, 292, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JTextPane txtpnFirmsAttemptTo = new JTextPane();
		txtpnFirmsAttemptTo.setText("Firms attempt to maximize profit (revenue minus cost) in all aspects of business, and the labor market is no exception. When considering how much labor to hire, the point of profit maximization means the last unit of labor where their MRP is not less than their MRC, meaning they still add marginal value to the company. At that point, total revenue equals total product times product price, and subtracting total cost (MRC times however many workers your employ) gives PROFIT!");
		txtpnFirmsAttemptTo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnFirmsAttemptTo.setBackground(new Color(147, 112, 219));
		GridBagConstraints gbc_txtpnFirmsAttemptTo = new GridBagConstraints();
		gbc_txtpnFirmsAttemptTo.fill = GridBagConstraints.BOTH;
		gbc_txtpnFirmsAttemptTo.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnFirmsAttemptTo.gridx = 1;
		gbc_txtpnFirmsAttemptTo.gridy = 1;
		panel_1.add(txtpnFirmsAttemptTo, gbc_txtpnFirmsAttemptTo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("CHANGES", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{88, 507, 84, 0};
		gbl_panel_3.rowHeights = new int[]{104, 292, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JTextPane txtpnThisProfitMaximization = new JTextPane();
		txtpnThisProfitMaximization.setText("This profit maximization point can change if a few different things occur. Labor is a resource, meaning its demand is derived from the demand of the product it produces. Specifically, resource demand is based on the productivity of that resource and the value of the commodity it's used in. For labor, the same is true: if the price of the product the labor is creating goes up, laborers' MRP goes up, so it may become more profitable to hire more labor, and vice versa. If units of labor become more productive, too (MPP increases), a business might hire more labor to maximize profit, or vice versa.");
		txtpnThisProfitMaximization.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnThisProfitMaximization.setBackground(new Color(147, 112, 219));
		GridBagConstraints gbc_txtpnThisProfitMaximization = new GridBagConstraints();
		gbc_txtpnThisProfitMaximization.fill = GridBagConstraints.BOTH;
		gbc_txtpnThisProfitMaximization.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnThisProfitMaximization.gridx = 1;
		gbc_txtpnThisProfitMaximization.gridy = 1;
		panel_3.add(txtpnThisProfitMaximization, gbc_txtpnThisProfitMaximization);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("MONOPSONY", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{88, 507, 84, 0};
		gbl_panel_4.rowHeights = new int[]{104, 292, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JTextPane txtpnMonopsonyRefersTo = new JTextPane();
		txtpnMonopsonyRefersTo.setText("Monopsony refers to one business having complete control over the labor market, meaning they alone decide how many people in the entire market get hired. Monopsonies can control worker wages, but they must also increase all the previous workers' wages for each additional unit of labor they hire since the labor supply is upsloping for markets and monopsonies. This means that the MRC grows faster than supply, and since profit is maximized where MRC crosses MRP, a monopsony will hire less labor than the market equilibrium dictates and pay each of them less as well (however much money they seek based on that quantity point on the supply curve). Thus, monopsonies create inefficiency.");
		txtpnMonopsonyRefersTo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnMonopsonyRefersTo.setBackground(new Color(147, 112, 219));
		GridBagConstraints gbc_txtpnMonopsonyRefersTo = new GridBagConstraints();
		gbc_txtpnMonopsonyRefersTo.fill = GridBagConstraints.BOTH;
		gbc_txtpnMonopsonyRefersTo.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnMonopsonyRefersTo.gridx = 1;
		gbc_txtpnMonopsonyRefersTo.gridy = 1;
		panel_4.add(txtpnMonopsonyRefersTo, gbc_txtpnMonopsonyRefersTo);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("GRAPHS", null, panel_5, null);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{150, 400, 150, 0};
		gbl_panel_5.rowHeights = new int[]{250, 350, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		Icon icon = new ImageIcon("Resources/PureCompetition.jpeg"); 
		JLabel label = new JLabel(icon);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel_5.add(label, gbc_label);
		
		Icon icon1 = new ImageIcon("Resources/Monopsony.jpg");
		JLabel lblNewLabel = new JLabel(icon1);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_5.add(lblNewLabel, gbc_lblNewLabel);
		

	}
}