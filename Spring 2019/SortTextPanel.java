/*Kendall Castilla
 * 19 April 2019
 * Lab 13 - GUI
 */
package lab13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SortTextPanel extends JPanel{
	   private JButton sort;
	   private JLabel label;
	   private JTextField field1,field2,field3,field4,field5;
	   //-----------------------------------------------------------------
	   //  Constructor: Sets up the GUI.
	   //-----------------------------------------------------------------
	   public SortTextPanel()
	   {
	      sort = new JButton("Sort");
	      
	      label = new JLabel();
	      sort.addActionListener(new ButtonListener());
	      field1=new JTextField(10);
	      field2=new JTextField(10);
	      field3=new JTextField(10);
	      field4=new JTextField(10);
	      field5=new JTextField(10);
	      add(field1);
	      add(field2);
	      add(field3);
	      add(field4);
	      add(field5);
	      add(sort);
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
				int nums[]=new int[5];
				nums[0]=Integer.parseInt(field1.getText().trim());
				nums[1] = Integer.parseInt(field2.getText().trim());
				nums[2] = Integer.parseInt(field3.getText().trim());
				nums[3] = Integer.parseInt(field4.getText().trim());
				nums[4] = Integer.parseInt(field5.getText().trim());
				
				Lab11_Searches.selectionSort(nums);
				label.setText(Arrays.toString(nums));
		  	}
	 	}
}
