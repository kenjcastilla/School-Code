/*Kenall Castilla
 * 5 April 2019
 * Lab 11
 */
package lab11;
import java.util.*;

public class Lab11_Sorts {
	
	public static int [] selectionSort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			int max = i;
			for (int j=(i+1); j<a.length; j++) {
				if(a[j] > a[max]) 
					max = j;
			}
			int temp = a[max];
			a[max] = a[i];
			a[i] = temp;
		}
		
		return a;
	}
	
	public static int[] bubbleSort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-i-1; j++) 
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		}
		
		return a;
	}
	
	public static int[] insertionSort(int[] a) {
		int n = a.length;
		for(int i=1; i<n; i++) {
			int key = a[i];
			int j=i-1;
			while((j>=0) && (a[j] > key)) {
				a[j+1]= a[j];
				j=j-1;
			}
			a[j+1] = key;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		int []a1={5,4,9,8,7,6,2,1,3};
		int []a2={5,4,9,8,7,6,2,1,3};
		int []a3={5,4,9,8,7,6,2,1,3};
		
		System.out.println("Before selectionSort: " + Arrays.toString(a1));
		System.out.println("After selectionSort: " + Arrays.toString(selectionSort(a1)) + "\n");

		System.out.println("Before bubbleSort: " + Arrays.toString(a2));
		System.out.println("After bubbleSort: " + Arrays.toString(bubbleSort(a2))+"\n");
		
		System.out.println("Before insertionSort: "+ Arrays.toString(a3));
		System.out.println("After insertionSort: " + Arrays.toString(insertionSort(a3)));
	}

}
