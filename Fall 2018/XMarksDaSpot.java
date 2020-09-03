/*Kendall Castilla
 * 8 November 2018
 * This program prints an X on a grid by using for loops.
 */
package hw7;

import java.util.Scanner;
public class XMarksDaSpot {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number of rows:");
		int user = scan.nextInt();
		
		for(int i=0; i<user; i++) {
			for(int x=0; x<user; x++ ) {
				if((x==i) || (x==(user-1)-i))
					System.out.print("* ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}

}
