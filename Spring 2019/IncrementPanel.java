/*Kendall Castilla
 * 19 April 2019
 * Lab 13 - GUI
 */
package lab13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncrementPanel extends JPanel{
	   private int count;
	   private JButton increment;
	   private JButton decrement;
	   private JLabel label;

	   //-----------------------------------------------------------------
	   //  Constructor: Sets up the GUI.
	   //-----------------------------------------------------------------
	   public IncrementPanel()
	   {
	      count = 50;

	      increment = new JButton("Increment");
	      decrement=new JButton("Decrement");
	      label = new JLabel();
	      increment.addActionListener(new ButtonListener());
	      decrement.addActionListener(new ButtonListener());
	      add(increment);
	      add(decrement);
	      add(label);

	      setBackground(Color.cyan);
	      setPreferredSize(new Dimension(600, 80));
	   }

	   //*****************************************************************
	   //  Represents a listener for button push (action) events.
	   //*****************************************************************
		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
		  	{
				if(event.getActionCommand().equals("Increment")){
			         count++;
			         label.setText("Count: " + count);
		         }
				else if(event.getActionCommand().equals("Decrement")){
					count--;
					label.setText("Count: " + count);
				}
		  	}
	 	}
}
