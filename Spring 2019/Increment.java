/*Kendall Castilla
 * 19 April 2019
 * Lab 13 - GUI
 */
package lab13;
import javax.swing.JFrame;

public class Increment {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Increment Decrement");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      IncrementPanel panel = new IncrementPanel();
	      frame.getContentPane().add(panel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}
