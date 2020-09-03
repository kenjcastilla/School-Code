/*Kendall Castilla
 * 25 January 2019 - 11:00 
 * Lab 2
 */
package lab2;
import java.util.*;
public class Lab2 {
	public static void main(String[] args) {
		
		int [] uArray = new int [10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Element 1: ");
		uArray[0] = scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println("Element " + (i+1)+": ");
			uArray[i] = scan.nextInt();
		}
		
		System.out.println("------------------------------------------------------");
		System.out.print("Here is the array in reverse: ");
		printReverse(uArray);
		System.out.println();
		System.out.print("The highest number is " + getLargest(uArray) + ". \n");
		System.out.print("The array with two times the numbers: [");
		computeTwice(uArray);
		for(int i=0; i<uArray.length; i++) 
			System.out.print(computeTwice(uArray)[i] + " ");
		System.out.print("]");
	}
	
	public static void printReverse(int array[]) {
		
		int[] temp = new int [array.length];
		for(int i=0; i<(array.length); i++) {
			temp[i]=array[temp.length-1-i];
		}
		for(int i=0; i<array.length; i++)
			System.out.print(temp[i] + ", ");
	}
	
	public static int getLargest(int[] array) {
		int x = array[0];
		for(int i=0; i<array.length; i++) {
			if(x < array[i]) {
				x = array[i];
			}
		}
		return x;
	}
	
	public static int [] computeTwice(int array[]) {
		int [] x = new int[array.length];
		for(int i=0; i<x.length; i++) {
			x[i] = (array[i] *2);
		}
		return x;
	}

}
