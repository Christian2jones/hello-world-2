/**
 * CTRL + 'QUESTION MARK' to comment / uncomment "//" highlighted blocks of code
 * Type sysout, followed by CTRL + SPACE to fill in System.out.println(); automatically
 * || is the logical OR operator, while && is the logical AND operator
 * % is modulus, or the division remainder
 */


package jonesChristianAutomation1;

import java.util.Scanner;


public class ClassExercises {

	public static void main(String[] args) {
		
		System.out.println("Here are some test codes");
		
		String var[] = {};
		
		System.out.println();
		
		boolean condition = 10 == 10; // == is a comparison, where = is assignment
		
		if (condition == true) {
			System.out.println(condition);
			System.out.println();
			
			for (float v = 1 ; v < 5;  v++) { //repeat 5 times before breaking
				
			Scanner in = new Scanner(System.in);
			System.out.printf("Please enter a number: ");
			
			double input = in.nextInt();
			
			if (input > 0) {
				System.out.println("		Number entered is greater than 0");
				System.out.println();
				
			}
			else if (input < 0) {
				System.out.println("		Number entered is less than 0");
				System.out.println();
				//end if statement
			} else {
				System.out.println("		Number IS 0");
				System.out.println();
			}
				
				
			}//end for loop
			

		}//end if statement
		
	} //ends main method

}//end ClassExercises
