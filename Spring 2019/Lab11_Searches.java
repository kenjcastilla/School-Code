/*Kendall Castilla
 * 19 April 2019
 * Lab 13 - GUI
 */
package lab13;

import java.util.Arrays;

public class Lab11_Searches {
	public static void selectionSort(int[] input){
		for(int i=0;i<input.length-1;i++){
            int max_idx = i; 
            for (int j = i+1; j < input.length; j++){ 
                if (input[j] > input[max_idx]){ 
                	max_idx = j; }
                }
            int temp = input[max_idx]; 
            input[max_idx] = input[i]; 
            input[i] = temp; 
		}
	}
	public static void bubbleSort(int input[]){ 
        for (int i = 0; i < input.length-1; i++){ 
            for (int j = 0; j < input.length-i-1; j++){ 
                if (input[j] < input[j+1]) 
                { 
                    int temp = input[j]; 
                    input[j] = input[j+1]; 
                    input[j+1] = temp; 
                } 
            }
        }
    } 
	public static void insertionSort(int input[]) {  
        for (int i = 1; i < input.length; ++i) { 
            int key = input[i]; 
            int j = i - 1; 
            while (j >= 0 && input[j] < key) { 
            	input[j + 1] = input[j]; 
                j = j - 1; 
            } 
            input[j + 1] = key; 
        } 
    } 
	public static void main(String[] args) {
		int []test1={5,4,9,8,7,6,2,1,3};
		int []test2={5,4,9,8,7,6,2,1,3};
		int []test3={5,4,9,8,7,6,2,1,3};
		selectionSort(test1);
		System.out.println(Arrays.toString(test1));
		bubbleSort(test2);
		System.out.println(Arrays.toString(test2));
		insertionSort(test3);
		System.out.println(Arrays.toString(test3));
	}

}
