/*Kendall Castilla
 * 7 November 2018
 * This program prints a "half xmas tree" given a number of rows from the user.
 */
package hw7;

import java.util.Scanner;
public class Half_XmasTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows.");
		int user = scan.nextInt();
		
		for(int rows=0; rows<user; rows++) {
			for(int col=user; col>rows; col--)
				System.out.print("*");
			System.out.println();
		}
	}

}
