/*Kendall Castilla
 * 26 April 2019
 * CompSci 1302 Lab Final
 */
package labFinal;

import java.util.*;

public class MedRecordsClient {
	
	public static void bubbleSort(ArrayList<String> a) {
		for(int i=0; i<a.size(); i++) {
			for(int j=0; j<a.size()-i-1; j++) 
				if(a.get(j).equals(a.get(j+1))) {
					 String temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		ArrayList<MedRecords> a = new ArrayList<MedRecords> ();	
		MedRecords p1 = new MedRecords("Tom", 30, "A");
		MedRecords p2 = new MedRecords("Jerry", 29, "O");
		MedRecords p3 = new MedRecords("Bruce", 40, "AB");
		MedRecords p4 = new MedRecords("Tony", 35, "B");
		MedRecords p5 = new MedRecords("Steve", 50, "A");
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		
		System.out.println(a);
		
		ArrayList<String> place = new ArrayList<String>();
		place.add("first");
		place.add("second");
		place.add("third");
		place.add("fourth");
		place.add("fifth");
		
		bubbleSort(place);
	}

}
