/*Kendall Castilla
 * 15 March 2019
 * Lab 9
 */
package lab9;
import java.util.*;
public class Lab9 {
	
	public static int cumulativeSum(int x) {
		if(x==0)
			return 0;
		else
			return x+cumulativeSum(x-1);
	}
	public static int fib(int x) {
		if(x<=2)
			return 1;
		else
			return fib(x-1) + fib(x-2);
	}
	
	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		num = scan.nextInt();
		
		System.out.println("The cumulative sum of "+num+" is "+cumulativeSum(num)+".");
		System.out.println("The Fibonacci number at location "+num+" is "+fib(num)+".");
	}

}
