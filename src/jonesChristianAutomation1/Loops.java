/**
 * While loops check the condition BEFORE the corresponding actions are taken
 * While(boolean expression) {statements} 
 * 
 * Do while loops will DO the statements and then if the condition is met at the end it will do it again.
 * 
 * For loops if you make an array called numbers, you can say int numbers [] = {1,2,3}, for (int number: numbers) {sysout("value is: " + numbers)}
 * 
 * try Thread.sleep(3000 milliseconds)
 * 
 * try ans.equals to compare strings
 */


package jonesChristianAutomation1;

import java.util.Scanner;

public class Loops {

//example do while loop
	public static void main(String[] args) {
//		int i = 9;
//		
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 10);
//
//	
////print "hi" three times using while loop
//		int j = 0;
//				
//				while (j < 3) {
//					
//					System.out.println("hi");
//					j++;
//					
//				}//end while loop
				
		int numbers [] = {1, 2, 3, 50, 35, 34, 657 , 25} ; //for loop example with auto counter through each value in an array
		for (int number: numbers) {System.out.println("Values in numbers array: " + number);}
		System.out.println();
		
		String asterisks [] = {"*********", " *******", "  *****", "   ***", "    *"};
		for (String index: asterisks)
		{System.out.println(index);}
		
		System.out.println();
		
//Create a while loop to prompt users for multiple choices
		
		Scanner in = new Scanner(System.in);
		char ans = '2';
		
		while (ans != 'C') {
			System.out.println("What is the command keyword to exit a loop in Java?  ");
			System.out.println();
			System.out.println("A. Int \nB. Continue \nC. Break \nD. Exit \n\nType Q to exit this loop ");
			
			ans = in.next().charAt(0);
			
			System.out.println();

//			ans.trim();
//			ans = ans.toUpperCase();
			System.out.println("Your response: " + ans);
			System.out.println();
			
			if (ans == 'A') {
				System.out.println("This answer is incorrect. Please try again: ");
				System.out.println();
				
			} else if (ans == 'B') {
				System.out.println("This answer is incorrect. Please try again: ");
				System.out.println();
				
			} else if (ans == 'C') {
				System.out.println("Correct! Well done. ");
				System.out.println();
				
			} else if (ans == 'D') {
				System.out.println("This answer is incorrect. Please try again: ");
				System.out.println();
			
			} else if (ans == 'Q') {
				System.out.println("You chose to quit. Moving on.");
				System.out.println();
				
				break;
				
			} else {
				System.out.println("Not a valid response, please try again ");
				System.out.println();
				
			}//end if statement

		}//end while loop
		
		
//Using a Do While loop, prompt user for an integer, and then output the same number with the digits reversed. for 1234, 4321 is displayed
		
//Prime number Validation using loops
		
		long response = -1;
		
		while (response != 0) {
		
		System.out.print("Please enter a number to check if it is prime:\n\tYou may enter '0' to quit: ");
		response = in.next().charAt(0);
		
		if ((response % 3L) == 0) {
			System.out.println("This is a prime number.");
			System.out.println("Remainder: " + (response % 1));
			
		} else if (response == 0) {
			
			break;
		}
		
		
		
		}//end while loop
		
//Ask if they want window seats, there are 8 passengers, only 4 window seats remaining, break when seats are taken, display all passengers questioned
//Validation using Boolean values
		
		int maxPassengers = 8;
		int winSeats = 4;
		Scanner in2 = new Scanner(System.in);

		do { // do...while loop
			System.out.print("Passenger #" + maxPassengers + ", Would you like a window seat? ");
			
			boolean input = in2.nextBoolean();
//			input = input.toUpperCase(); //use if we can take text string entered as "Yes" to be true or valid
			
		
			if (input == true && winSeats > 0) { // do this if input is true
				System.out.println("You chose a window seat.");
				winSeats--;
				System.out.println("Window seats remaining: " + winSeats);
				System.out.println();
				System.out.println();

				maxPassengers--;

			}
				
			 else if (input == false) { // do this if input is false
				System.out.println("You chose not to take a window seat. ");
				System.out.println();
				System.out.println();

				maxPassengers--;
				
			}//end else if

			}//end if statement

		while(winSeats > 0 && maxPassengers > 0); //last line of do...while loop
		
		while(maxPassengers > 0) { //while loop outside of the do_while for when window seats run out
			System.out.println("No window seats remain. Would you like an aisle seat?");
			boolean input = in2.nextBoolean();
			maxPassengers--;

		}//end while loop
		
		System.out.println();
		System.out.println();
		System.out.println("All 8 passengers accounted for. There are (" + winSeats + ") window seats left.");
		
				
				
	}//end main
	
}//end class
