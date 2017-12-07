
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private int units;
	private double price;
	private double wage;
	private StartCalcScreen startcalcscreen;
	private FirstTable firsttable;
	private StartScreen startscreen;
	private InfoScreen infoscreen;
	
	private ActionListener calcScreen = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			contentPane.removeAll();
			contentPane.revalidate();
			contentPane.repaint();
			startcalcscreen = new StartCalcScreen(moveOn, home);
			contentPane.add(startcalcscreen);
		}
	};
	
	private ActionListener infoScreen = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			contentPane.removeAll();
			contentPane.revalidate();
			contentPane.repaint();
			infoscreen = new InfoScreen(home);
			contentPane.add(infoscreen);
		}
	};
	
	private ActionListener home = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			contentPane.removeAll();
			contentPane.revalidate();
			contentPane.repaint();
			startscreen = new StartScreen(calcScreen, infoScreen);
			contentPane.add(startscreen);
		}
	};
	
	private ActionListener moveOn = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			units = Integer.parseInt(startcalcscreen.textField.getText());
			price = Double.parseDouble(startcalcscreen.textField_1.getText());
			wage = Double.parseDouble(startcalcscreen.textField_2.getText());
			inputTable(units, price, wage);
		}
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Micro Project");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		startscreen = new StartScreen(calcScreen, infoScreen);
		contentPane.add(startscreen);
	}
	
	private void inputTable(int units, double price, double wage) {
		contentPane.removeAll();
		contentPane.revalidate();
		contentPane.repaint();
		firsttable = new FirstTable(units, price, wage, home);
		contentPane.add(firsttable);
	}

}