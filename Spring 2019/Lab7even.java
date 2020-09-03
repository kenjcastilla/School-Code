/*Kendall Castilla
 * Lab 7
 * 1 March 2019
 */
package lab7;

import java.util.ArrayList;
import java.util.Arrays;


public class Lab7even {
	
	public ArrayList<String> removeOddLength(ArrayList<String> input){
		ArrayList<String> output=new ArrayList<String>();
		for (String s : input){
			if(s.length() % 2==0){
				output.add(s);
			}
		}
		return output;
	}
	public ArrayList<String> swapPairs(ArrayList<String> input){
		ArrayList<String> output=new ArrayList<String>();
		for(int i=0;i<input.size()-1;i=i+2){
			output.add(input.get(i+1));
			output.add(input.get(i));
		}
		if(input.size()%2!=0){
			output.add(input.get(input.size()-1));
		}
		return output;
	}
	public ArrayList<Integer> intersect(ArrayList<Integer> input1,ArrayList<Integer> input2){
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int i:input1){
			if(input2.contains(i)) {
				output.add(i);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab7even test=new Lab7even();
		ArrayList<String> inputstring=new ArrayList<String>(Arrays.asList("madam", "I", "am", "your", "adam"));
		System.out.println(inputstring);
		System.out.println(test.removeOddLength(inputstring));
		System.out.println(test.swapPairs(inputstring));
		ArrayList<Integer> inputint1=new ArrayList<Integer>(Arrays.asList(1,4,8,9,11,15,17,28,41,59));
		ArrayList<Integer> inputint2=new ArrayList<Integer>(Arrays.asList(4,7,11,17,19,20,23,28,37,59,81));
		System.out.println(test.intersect(inputint1, inputint2));
	}

}



