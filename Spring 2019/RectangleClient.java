/*Kendall Castilla
 * 1 February 2019
 * RectangleClient Program that utilizes Rectangle class methods.
 */
package lab3;

public class RectangleClient {
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.setFields(6, 2, 5, 7);
		rect2.setFields(4, 5, 11, 3);
		
		System.out.println(rect1.toString());
		System.out.println(rect2.toString());
	}

}
