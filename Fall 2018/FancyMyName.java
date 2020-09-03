/*Kendall Castilla
 * Strings Program, FancyMyName
 * 14 November 2018
 */
package lab12;

import java.util.Scanner;

public class FancyMyName {
	public static void main(String[] args) {
		
		String name;
		String fName;
		String lName;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your first and last name, separated by a space:");
		name = scan.nextLine();
		
		int index = name.indexOf(" ");
		
		fName = name.substring(0, (index));
		lName = name.substring(index +1);
		
		System.out.println("You entered the name: " + fName + " " + lName);
		System.out.println("Your first name is " + fName + ": has " + fName.length() + " characters");
		System.out.println("Your last name is " + lName + ": has " + lName.length() + " characters");
		System.out.println("Your initials are: " + fName.charAt(0) + lName.charAt(0));
	}

}
