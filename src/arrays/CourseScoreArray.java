/* Christian Emanuel Jones
 * CIS 2212, Tuesdays, Spring 2019
 * Lab 4, Course Score Arrays
 * Due February 5th, 2019
 */

package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CourseScoreArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //scanner object created
		int numAssignments = 0; //# of scores
		
		System.out.println("Welcome to your grades program.\n");
		
	
			System.out.print("How many assignments are you totaling / averaging? "); //request # of assignments
			numAssignments = input.nextInt();
			
			//validate the input value is usable
			while (numAssignments <= 0) {
				System.out.print("\n\tThis value is invalid. How many assignments are there? ");
				numAssignments = input.nextInt();
			} //end while loop for getting scores
			
			System.out.println("\nConfirmed. " + numAssignments +  " assignment(s)."); //read out # of assignments to confirm.
			System.out.println();
			
		
		//call ptsEarned method to request score of each of the assignments
		double[] Earned = ptsEarned(numAssignments);
		System.out.println();
		
		//call ptsMax method to find out the maximum # of points per assignment
		double[] Maxes = ptsMax(numAssignments);
		System.out.println();
		
		//calculate total points earned by passing our Grades array
		double totalEarned = calcTotalPtsEarned(Earned);
		System.out.println();
		
		//calculate the maximum score total for all assignments
		double maxi = calcTotalPtsMax(Maxes);
		System.out.println();
		
		//display results of the arrays side by side
		displayArray(Earned, Maxes);
		
		//display all results
		System.out.println("Total points earned: " + totalEarned); 
		System.out.println("Total points possible: " + maxi); 
		double average = ((totalEarned / maxi) * 100);
		
		//format average score to two decimal places
		DecimalFormat priceFormatter = new DecimalFormat("#0.00");
		System.out.println("Course Score: " + priceFormatter.format(average) + "%");
		ltrGrade(average); 
		
		
		
	}//end main method
	
	
	public static double[] ptsEarned(int numAssignments) {
		
		Scanner input = new Scanner(System.in); //scanner object created
		
		//create an array with "numAssignments" # of elements
		double[] Grades = new double[numAssignments];
		
		for(int i = 0; i < numAssignments; i++ ) {
						
			System.out.print("How many points did you earn on test " + (i + 1) + "? ");			
			Grades[i] = input.nextDouble();
			
			//Validate input
			while (Grades[i] < 0) {
				System.out.print("\nThis value must be at least 0. ");
				System.out.print("\nHow many points did you earn on test " + (i + 1) + "? ");
				Grades[i] = input.nextDouble();
			}//end nested while validation loop 
			
		} // end for loop 
				
		//return the array
		return Grades;
	} // end ptsEarned method
	
	public static double[] ptsMax(int numAssignments) {
		
		Scanner input = new Scanner(System.in); //scanner object created
		//create an array with "numAssignments" # of elements
		double[] Maxes = new double[numAssignments];

		
		for(int i = 0; i < numAssignments; i++ ) {
			
			System.out.print("What was the maximum score of test " + (i + 1) + "? ");			
			Maxes[i] = input.nextDouble();
			
			//Validate input
			while (Maxes[i] < 0) {
				System.out.print("\nThis value must be greater than 0. ");
				System.out.print("\nWhat was the maximum score of test " + (i + 1) + "? ");
				Maxes[i] = input.nextDouble();
			}//end nested while validation loop 
			
		} // end for loop 
				
		//return the array
		return Maxes;
				
	}
	
	public static double calcTotalPtsEarned(double[] earnedArray) {
		
		double totalEarned = 0;
		DecimalFormat priceFormatter = new DecimalFormat("#0.00"); //bring in formatter utility

		
		for (int i = 0 ; i < earnedArray.length ; i++) {
			
			totalEarned = totalEarned + earnedArray[i];
			
		}//end for loop
		
		return totalEarned;
		
	} //end calcTotalPtsEarned Method
	
	public static double calcTotalPtsMax(double[] maxArray) {
		
		double max = 0;
		
		for (int i = 0 ; i < maxArray.length ; i++) {
			
			max = max + maxArray[i];
			
		}//end for loop
		
		return max;
	}
	
	public static void displayArray(double[] earnedArray, double[] maxArray) {
		System.out.println("\tEarned  -  Maximum ");
		System.out.println();
		
		for(int i = 0 ; i < earnedArray.length ; i++) {
			System.out.println("\t" + earnedArray[i] + "       " + maxArray[i] );

		}//end for loop
		System.out.println();
		System.out.println();
		
	}//end dispalyArray method
	
	public static String ltrGrade(double percentage) {
		
		String G;
		//assign letter grades
		if 	( percentage >= 90 ) 
		{ 
			G = ("A");
			System.out.println("Your letter grade: " + G);	
		}
		else if (percentage >= 80)
		{ 
			G = ("B");
			System.out.println("Your letter grade: " + G);	
		}
		else if (percentage >= 70)
		{ 
			G = ("C");
			System.out.println("Your letter grade: " + G);	
		}	
		else if (percentage >= 60)
		{ 
			G = ("D");
			System.out.println("Your letter grade: " + G);	
		}	
		else 
		{ 
			G = ("F");
			System.out.println("Your letter grade: " + G);	
		}
		
		return G;	
		

	}

}//end class
