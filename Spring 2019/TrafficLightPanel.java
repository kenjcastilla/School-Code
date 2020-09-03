/*Kendall Castilla
 * 26 April 2019
 * Homework 5, Part II
 */
package homework5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JFrame implements ActionListener{
	private boolean on;
	private int count;
	private JLabel label;
	
	public TrafficLightPanel() {
		setTitle("Traffic Light");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 500);
		init();
	}
	
	public class Circle extends JPanel {
		private Color color;
		
		public Circle(Color color) {
			this.color = color;
		}
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(65, 15, 55, 55);
		}
	}
	
	private Circle red = new Circle(Color.RED);
	private Circle ylw = new Circle(Color.YELLOW);
	private Circle grn = new Circle(Color.GREEN);
	
	private JButton button = new JButton("Change Signal");
	
	private void init() {
		setContentPane(new JPanel());
		getContentPane().setLayout(new GridLayout(0, 1));
		getContentPane().setBackground(Color.BLACK);;
		initButtonsPanels();
	}
	private void initButtonsPanels() {
		red.setBackground(Color.BLACK);
		getContentPane().add(button);
		getContentPane().add(red);
		ylw.setBackground(Color.BLACK);
		getContentPane().add(ylw);
		grn.setBackground(Color.BLACK);
		getContentPane().add(grn);
		
		button.addActionListener(this);
		red.setVisible(true);
		ylw.setVisible(false);
		grn.setVisible(false);
		count = 1;
	}

	public void actionPerformed(ActionEvent event) {
		count++;
		if(event.getSource() == button) {
			if(count ==1) {
				red.setVisible(true);
				ylw.setVisible(false);
				grn.setVisible(false);
			}
			else if(count ==2) {
				red.setVisible(false);
				ylw.setVisible(true);
				grn.setVisible(false);
			}
			else if(count ==3) {
				red.setVisible(false);
				ylw.setVisible(false);
				grn.setVisible(true);
				count = 0;
			}
		}
	}
	

}
