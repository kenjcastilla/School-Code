/*Kendall Castilla
 * 19 April 2019
 * Lab 13 - GUI
 */
package lab13;

import javax.swing.JFrame;

public class SortText {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Sort");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      SortTextPanel panel= new SortTextPanel();
	      frame.getContentPane().add(panel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}
