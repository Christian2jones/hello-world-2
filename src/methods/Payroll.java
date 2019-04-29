/* Christian Emanuel Jones
 * CIS 2212, Tuesdays, Spring 2019
 * Lab 2, Weekly Payroll
 * Due January 22nd, 2019
 */


package methods;

import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		//per instructions, declare your variables first
			String firstName;
			String lastName;
			double hours;
			double payRate;
			double fedTaxWHrate;
			double stateTaxWHrate;
			double grossPay;
			double fedTaxWH;
			double stateTaxWH;
			double totalDeduction;
			double netPay;
			
		NumberFormat currency = NumberFormat.getCurrencyInstance(); //get number format class ready to coming variables
			
		//Create scanner object to read in information
			Scanner input = new Scanner(System.in);
			
		//Prompt the user for their data
			System.out.print("What is your first name? ");
			firstName = input.nextLine();
		
			System.out.print("What is your last name? ");
			lastName = input.nextLine();

			System.out.print("How many hours did you work? ");
			hours = input.nextDouble();

			System.out.print("What is your hourly pay rate? ");
			payRate = input.nextDouble();
			
			System.out.print("Enter the federal tax withholding rate (as a decimal): ");
			fedTaxWHrate = input.nextDouble();

			System.out.print("Enter your state's tax withholding rate (as a decimal): ");
			stateTaxWHrate = input.nextDouble();
		
			//make some room for the output values:
			
			System.out.println();
			System.out.println("Weekly Payroll");
			System.out.println("-----------------");
			
			
			//Let's do the math and call the methods, and display results:

			System.out.println("Employee's name: " + firstName + " "  + lastName);
			System.out.println("Number of hours worked in a week: " + hours );
			System.out.println("Pay Rate: " + payRate);
				grossPay = calcGross(hours,payRate); //assign the remaining variables their values
			System.out.println("Gross Pay: " + currency.format(grossPay));
			
			//output these values indented to see deductions clearly
			System.out.println("Deductions: ");
				fedTaxWH = calcFedWH(grossPay,fedTaxWHrate); //assign the remaining variables their values
			System.out.println("\tFederal Withholding at " + fedTaxWHrate * 100 + "%: " + currency.format(fedTaxWH));
				stateTaxWH = calcStateWH(grossPay,stateTaxWHrate); //call methods to calculate,
			System.out.println("\tState Withholding at "  + stateTaxWHrate * 100 + "% " + currency.format(stateTaxWH)); //print out the outcome of the calculation
				totalDeduction = calcTotalDeduct(fedTaxWH,stateTaxWH);
			System.out.println("\tTotal Deductions: " + currency.format(totalDeduction));
			
			//Print out the net income
				netPay = calcNet(grossPay,totalDeduction);
			System.out.println("Net Pay: " + currency.format(netPay));

			
	} //end main method
	
/* New methods go
 * down here, outside of main method,
 * ready to be called
 */
 
	
	//method 1
	public static double calcGross(double hours, double payRate) { //calculate gross pay
	
		return hours * payRate;
	}
	//method 2
	public static double calcFedWH(double grossPay, double fedTaxWHrate) {// - gross pay * federal withholding rate{
	
		return grossPay * fedTaxWHrate;
	}
	//method 3
	public static double calcStateWH( double grossPay, double stateWHrate) { // - gross pay * state withholding rate {
	
		return grossPay * stateWHrate;
	
	}
	//method 4
	public static double calcTotalDeduct ( double federalTaxWH, double stateTaxWH) { // - amount of federal withholding + amount of state withholding
	
		return federalTaxWH + stateTaxWH;
	
	}	//method 5
	public static double calcNet (double grossPay, double totalDeduction) { //gross minus total deductions
	
		return grossPay - totalDeduction;
	
	}
	
	
} //end Class
