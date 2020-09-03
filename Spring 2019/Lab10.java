/*Kendall Castilla
 * 29 March 2019
 * Lab 10
 */
package lab10;

public class Lab10 {
	public static int Sequential(int input[],int target){
		int len=input.length;
		for(int i=0; i<len; i++) {
			if (input[i] == target)
				return i;
		}
		
		return -(len+1);
	}
	public static int Binary(int input[],int target){
		int len=input.length;
		int start=0;
		int end=len-1;
		int mid=(start+end)/2;
		while (start <= end) 
			{
			if (input[mid] == target) 
				return mid;
			if (input[mid]> target) {
				end=mid-1; 
				mid=(start+end)/2;
			}
		 	if (input[mid]< target) { 
		 		start=mid+1; 
		 		mid=(start+end)/2;
		 		}
		 	}
		return -(len+1);
		
	}
	public static int recurBinary(int input[], int start, int end, int target){
		int mid = 0;
		if (start <= end) {
			 mid=(end+start)/2;
			 if (input[mid]==target)  
				return mid;
			 else if (input[mid]>target) 
				return recurBinary(input,start,mid-1,target);
			 else if (input[mid]<target) 
				return recurBinary(input,mid+1,end,target);

		}
		return -1;
	}
	public static void main(String[] args) {
		int input[]={1,3,5,7,9};
		System.out.println("index of 5 is: "+Sequential(input,5));
		System.out.println("index of 4 is: "+Sequential(input,4));
		System.out.println("index of 5 is: "+Binary(input,5));
		System.out.println("index of 4 is: "+Binary(input,4));
		System.out.println("index of 5 is: "+recurBinary(input,0,input.length,5));
		System.out.println("index of 4 is: "+recurBinary(input,0,input.length,4));
	}

}