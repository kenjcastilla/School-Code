package homework1;

import java.util.*;

public class ISBNClient {
	public static void main(String[] args) {
		String digits;
		String check = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 9-digit ISBN: ");
		digits = scan.next();
		System.out.println("Enter checksum: ");
		check = scan.next();
		
		ISBN book = new ISBN(digits, check);
		
		System.out.println(book.getCheckSymbol());
		
		if(book.isValid() == true) 
			System.out.println("The ISBN is valid.");
		else
			System.out.println("The ISBN is invalid (X)");
		
		System.out.println(book.toString());
		
	}

}
