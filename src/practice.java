

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class practice extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Continue");
	private int units;
	private double wage;
	private double price;
	private StartScreen startscreen;
	private FirstTable firsttable;
	private ActionListener moveOn = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			units = Integer.parseInt(startscreen.textField.getText());
			price = Double.parseDouble(startscreen.textField_1.getText());
			wage = Double.parseDouble(startscreen.textField_2.getText());
			inputTable(units,price,wage);
		}
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice frame = new practice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public practice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		startscreen = new StartScreen(moveOn);
		contentPane.add(startscreen);
		

	}
	private void inputTable(int units,double price,double wage) {
		contentPane.removeAll();
		setBounds(100,100,600,600);
		contentPane.revalidate();
		contentPane.repaint();
		firsttable = new FirstTable(units, price, wage);
		contentPane.add(firsttable);
	}
}
