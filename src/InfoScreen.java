import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

public class InfoScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public InfoScreen(ActionListener home) {
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
		tabbedPane.addTab("Tab 1", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tab 2", null, panel_1, null);
		

	}
}
