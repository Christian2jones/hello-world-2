/*	\" = add quotes INTO your text string and prevent it from separating
 * 
 * 
 */

package jonesChristianAutomation1;

import java.util.Scanner;

public class ClassExercisesAPRIL17 {

	public static void main(String[] args) {

		for (float i = 0 ; i < 2;  i++) { //repeat however many times before breaking
			
			Scanner in = new Scanner(System.in);
			System.out.printf("Please enter a number: ");
			double input = in.nextInt();
			System.out.printf("Please enter a second number: ");
			double input2 = in.nextInt();
			System.out.printf("Please enter a third number: ");
			double input3 = in.nextInt();
			
			
				   if (input > input2  && input > input3) { //is one greater than 2 AND 3?
				System.out.println(input + " is the greatest number");
			} else if (input2 > input  && input2 > input3) { //is two greater than 1 AND 3?
				System.out.println(input2 + " is the greatest number");
			} else if (input3 > input  && input3 > input2) { //is three greater than 1 AND 2?
				System.out.println(input3 + " is the greatest number");
			} else if (input == input2 && input == input3) { //are they all equal?
				System.out.println(input + " is the greatest and is the same as " + input2 + " AND " + input3);
			} else if (input2 == input3) { //is 2 equal to 3?
				System.out.println(input2 + " is the same as " + input3 + " and are the greatest");
			} else if (input == input2) { //is 1 equal to 2?
				System.out.println(input + " is the same as " + input2 + " and are the greatest");
			} else if (input == input3) { //is 1 equal to 3?
				System.out.println(input + " is the same as " + input3 + " and are the greatest");
			} //end if statement
			
				System.out.println();
		
		} //end for loop
		
		System.out.println(2000 % 400); // % is modulus, or the division remainder. 2016 divided by 4 is 504, with no remainder or 0.
		System.out.println(2000 % 4 );
		System.out.println(2000 % 100); 
// leap years are divisible by 4 with 0 remainder, however every century (i.e. 1700) AREN'T leap years unless divisible by 400.		
// Small definite number of possible outcomes, you may use switch statements i.e. 1-7 to select weekdays

		
	} //end main method

	
} //end class object
