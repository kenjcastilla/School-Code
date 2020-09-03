/*Kendall Castilla
 * Homework 8
 * 27 November 2018
 */
package hw8;

import java.util.Scanner;

public class ConvertDate {
	public static void main(String[] args) {
		
		String user;
		String month;
		String day;
		String year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date to be converted: ");
		user = sc.nextLine();
		
		month = user.substring(0, user.indexOf(" "));
		month = (month.substring(0, 1)).toUpperCase() + (month.substring(1)).toLowerCase();
		day = user.substring(user.indexOf(" "), user.indexOf(","));
		year = user.substring(user.lastIndexOf(" ")+1);
		
		System.out.println("Converted date: " + day + " " + month + " " + year); 
		
	}

}
