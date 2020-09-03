/*Kendall Castilla
 * Lab 13
 * 28 November 2018
 */

/*Answers to Arrays Questions:
 * 1) 2
 * 2) skiResorts[2]; 
 * 3) 5
 * 4) "Sun Valley"
 */

package lab13;
import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		
		int tot;
		int avg;
		int max;
		int maxPerson;
		int min;
		int minPerson;
		int user;
		//final int SALESPEOPLE = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many salespeople are being represented?");
		user = sc.nextInt();
		
		int [] sales = new int[user];
		
		for(int i=0; i<sales.length; i++) {
			System.out.print("Enter sales for salesperson #" + (i+1) + ": ");
			sales[i] = sc.nextInt();
			
		}
		System.out.println();
		System.out.println("Salespeople Sales");
		System.out.println("-------------------");
		
		max = 0;
		maxPerson =0;
		min =0;
		minPerson=0;
		tot = 0;
		for(int i=0; i<sales.length; i++) {
			System.out.println("     " + (i+1) + "        $" + sales[i]);
			tot+= sales[i];
			if(i==0) {
				max = sales[i];
				min = sales[i];
				maxPerson = i+1;
				minPerson = i+1;
			}
			else if ((max < sales[i])) {
				max = sales[i];
				maxPerson = (i+1);
			}
			else if(min > sales[i]) {
				min = sales[i];
				minPerson = (i+1);
			}
		}
		avg = tot/sales.length;
		
		System.out.println();
		System.out.println("Total Sales: " + tot);
		System.out.println("Average Sale: " + avg);
		System.out.println("Salesperson " + maxPerson + " had the highest sale with $" + max + ".");
		System.out.println("Salesperson " + minPerson + " had the lowest sale with $" + min + ".\n");
		
		System.out.println("Enter a value to see who exceeded that number in sales: ");
		user = sc.nextInt();
		
		System.out.println();
		
		tot=0;
		for(int i=0; i<sales.length; i++) {
			if(sales[i] > user) {
				System.out.println("Salesperson " + (i+1) + ": " + sales[i]);
				tot++;
		}
	}
		if(tot >0)
			System.out.println("The above " + tot + " salespeople exceeded that amount in sales: \n");
		else
			System.out.println("No one exceeded that amount in sales. \n");
		
		System.out.println("Thank you for your time.");
		
}
}
