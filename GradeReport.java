/*Kendall Castilla
 * Lab 11, Grade Report Program
 * 31 October 2018
 */
package lab11;
import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		
		int tries =0;
		int grade;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter an integer grade from range 1-100.");
			grade = scan.nextInt();
			tries++;
			if(tries ==3)
				break;
		}
		while((grade < 1) || (grade > 100));
		
		String comment;
		int category = grade/10;
		
		if(tries <3) {
			switch(category) {
			case 10: comment = "Perfect score. Well done.";
			break;
			case 9: comment = "Well above average. Excellent.";
			break;
			case 8: comment = "Above average. Nice job.";
			break;
			case 7: comment = "Average.";
			break;
			case 6: comment = "Below average. You should see the professor...to clarify the material.";
			break;
			default: comment = "That grade is too low. You need a miracle.";
			break;
			}
			System.out.println(comment);
		}
		else
			System.out.println("Program terminates. Thanks alot.");
	}

}
