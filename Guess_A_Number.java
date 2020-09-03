/*Kendall Castilla
 * 8 November 2018
 * This program has the computer generate a random integer from a range of values selected by the user. The 
 * 	user must then try to guess that number.
 */
package hw7;

import java.util.Scanner;
public class Guess_A_Number {
	public static void main(String[] args) {
		
		int secretNum;
		int uNum; 
		int max;
		int trace =1;
		Scanner scan=new Scanner(System.in)
				;
		System.out.println("Welcome to Guess The Number!");
		System.out.println("----------------------------");
		
		
		String again = "y";
		while(again.equalsIgnoreCase("y")) {
			System.out.println("The minimum possible number is 1. \nEnter the maximum value for the secret number.");
			max = scan.nextInt();
			secretNum = (int)((Math.random() * max) + 1);
			System.out.println("A new secret number has been chosen.");
			System.out.println();
			uNum = 0;
			while(uNum != secretNum) {
				System.out.println("Enter guess: ");
				uNum = scan.nextInt();
				System.out.println();
				if(uNum < secretNum) {
					System.out.println("Too low; try again.");
					trace++;
					
				}
				else if(uNum>secretNum) {
					System.out.println("Too high; try again.");
					trace++;
		
				}
				else {
					System.out.println("Congrats! You won in " + trace + " guesses!");
					System.out.println();
					System.out.println("Play again? (Y/N)");
					again = scan.next();
				}
			}
			
		}
	}

}
