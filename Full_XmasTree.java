/*Kendall Castilla
 * This program prints a Christmas Tree with the number of rows given by the user.
 * 8 November 2018
 * 
 */
package hw7;

import java.util.Scanner;
public class Full_XmasTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows for the Christmas tree: ");
		int user = scan.nextInt();
	
		for(int rows=0; rows <user; rows++) {
			
			for(int space=user; space>rows; space--) 
				System.out.print(" ");

			for(int k=1; k<=rows+1; k++)
				System.out.print("* ");
			
			System.out.println();
			
		}
	}

}
