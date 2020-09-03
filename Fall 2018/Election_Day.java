/*Kendall Castilla
 * Lab 10 - "Election Day"
 * 24 October 2018
 */
package lab10;
import java.util.Scanner;

public class Election_Day {
	public static void main(String[] args) {
		
		int votesHillary;
		int votesDonald;
		int totHillary = 0;
		int totDonald = 0;
		int yesNo = 1;
		int preDonald =0;
		int preHillary =0;
		int tie =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Election Day Vote Counting Program");
		System.out.println("Do you want to vote? 1 for yes, 2 for no.");
		int vote = scan.nextInt();
		
		if (vote == 1) {
			while (yesNo == 1) {
				System.out.println("How many votes for Donald?");
				votesDonald = scan.nextInt();
				
				System.out.println("How many votes for Hillary?");
				votesHillary = scan.nextInt();
				
				if(votesDonald > votesHillary)
					preDonald++;
				else if(votesHillary > votesDonald)
					preHillary++;
				else
					tie++;
				
				totDonald = totDonald + votesDonald;
				totHillary = totHillary + votesHillary;
				

				System.out.println("Are there any more precincts? 1 for yes, 2 for no.");
				yesNo = scan.nextInt();
				
				if(yesNo == 2)
					break;
			}
		}
		else
			System.out.println("Ok bye.");
		
		
		double perHill = (totHillary / (double)(totDonald + totHillary)) * 100;
		double perDonald = (totDonald / (double)(totDonald + totHillary)) * 100;
		
		System.out.println();
		System.out.println("Total number of votes for Donald: " + totDonald);
		System.out.println("Total number of votes for Hillary: " + totHillary);
		System.out.println();
		System.out.println("Donald controlled " + perDonald + "% of the vote.");
		System.out.println("Hillary controlled " + perHill + "% of the vote.");
		System.out.println();
		System.out.println("Donald carried " + preDonald + " precincts.");
		System.out.println("Hillalry carried " + preHillary + " precincts.");
		System.out.println("There were " + tie + " ties.");
	}

}
