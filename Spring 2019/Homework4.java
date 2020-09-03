/*Kendall Castilla
 * 4 April 2019
 * Homework 4, Part b - 1 & 2
 */
package homework4;
import java.util.*;

public class Homework4 {
	
	//Part 1
	public static int multiply(int x, int y) {
		if (y==0)
			return 0;
		else
			return x + multiply(x, y-1);
	}
	
	//Part 2
	public static void writeSquares(int n) {
		/*example, writeSquares(11); prints the following output:
			100 64 36 16 4 1 9 25 49 81 121*/
		if(n<1) 
			return;
		else if(n==1) {
			System.out.print(1);
			return;
		}
		
		if(n%2!=0) {
			writeSquares(n-1);
			System.out.print(", "+ n*n);
		}
		else {
			System.out.print(n*n + ", ");
			writeSquares(n-1);
		}
		
	}
	
	// Main method
	public static void main(String[] args) {
		int x, y, n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value: ");
		x = scan.nextInt();
		System.out.println("Enter y value: ");
		y = scan.nextInt();
		System.out.println("Enter n value: ");
		n = scan.nextInt();
		int k=n+1;
		// Print results.
		System.out.println("The \"multiply\" method with x = " + x + " and y = "+y+ " returns " + multiply(x, y) + ".");
		System.out.print("The \"writeSquares\" method with n = " + n + " prints: ");
		writeSquares(n);
		System.out.print(".");
	}

}
