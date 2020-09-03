/*Kendall Castilla
 * Lab 11, Power Generator Program
 * 31 October 2018
 */
package lab11;

import java.util.Scanner;
public class PowerGenerator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("Welcome to the Power Generator.");
		System.out.println("--------------------------------");
		
		System.out.println("Enter a positive integer:");
		n = scan.nextInt();
		
		System.out.println();
		
		if (n>=1) {
			for(int p=0; p< 4; p++) {
				System.out.print("n^" + (p+1) + "\t");
			}
			
			System.out.println();
			
			for(int i=0; i<n; i++) {
				System.out.println();
				System.out.print((i+1) + "\t");
				int o =0;
				for(int x=0; x<3; x++) {
					System.out.print((int) (Math.pow(i +1, (o+2))) + "\t");
					o++;
				}
			}
		}
		else {
			System.out.println("Program terminating.");
		}
		
	}

}
