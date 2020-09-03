/*Kendall Castilla
 * 1 February 2019
 * Rectangle Class w/ fields and methods.
 */
package lab3;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public void setFields() {
		x= 0;
		y= 0;
		width= 0;
		height= 0;
		
	}
	public void setFields(int newx, int newy, int newwidth, int newheight) {
		this.x= newx;
		this.y= newy;
		this.width= newwidth;
		this.height= newheight;
		
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public String toString() {
		return "Rectangle: [x = "+ this.x +", y = "+ this.y + ", width = "+ this.width + ", height = " + this.height + "]";
	}

}
