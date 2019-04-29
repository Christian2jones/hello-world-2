/* Christian Emanuel Jones
 * CIS 2212, Tuesdays, Spring 2019
 * Lab 3, GiftCard
 * Due January 29th, 2019
 * 
 * Additional notes:
 * for some reason, if item #4 costs 0.31 and the card's remaining balance is 0.31 it does not work
 * it is either "too costly" an item, or the balance becomes 0 and it proceeds
 * to ask for additional items.
 */



package loops.methods.currency;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GiftCard {

	public static void main(String[] args) {
		//declare variables
		double price = 1, balance = 225;
		int siorno;
		
		Scanner input = new Scanner (System.in); //create scanner object
		NumberFormat currency = NumberFormat.getCurrencyInstance(); //get number format class ready for coming variables

		
		//Ask if the user wants to begin
		siorno = JOptionPane.showConfirmDialog(null, "Do you wish to track your shopping?", "Begin?", JOptionPane.YES_NO_OPTION);

		
		//While the user has ok'd the initialization
		while (siorno == JOptionPane.NO_OPTION); {
		
		System.out.println("Welcome to your Gift Card Tracker!"); //read out info to the user
		System.out.println("You may purchase up to 6 items, totaling no more than $225");
		System.out.println();
		
			
			if (siorno == JOptionPane.YES_OPTION) {
				System.out.println("Program initializing...");
				System.out.println("-----------------------------");		
			} 
			
			System.out.println("The current card balance is " + currency.format(balance)); //read current balance value
			

			
		for (int itemNum = 1; itemNum <= 6 ; itemNum ++) { //prompt for up to 6 item purchases
			
	
			
			System.out.println("Please enter the purchase amount of item #" + itemNum + ": "); //request amount of next purchase
			price = input.nextDouble();
			
			if (balance == 0) {
				System.out.println("You have maxed out spending on this gift card");
				System.out.println("You purchased " + itemNum + " items");
							
			} else if (Trans(price,balance) < 0) { //call Trans method, to check for amounts that will create a negative balance
				System.out.println("That item costs too much. It must be at or below " + currency.format(balance));
				itemNum = itemNum - 1; //revert to current item number to get info again when invalid
				
			} else if (price == 0) { // assuming aunt and uncle will only hold purchased items
				System.out.println("The item needs a price.");
				itemNum = itemNum - 1; //revert to current item number to get info again when invalid
				
			} else if (price < 0) { // check for negative $ amounts
				System.out.println("The item's price may not have a negative value");
				itemNum = itemNum - 1; //revert to current item number to get info again when invalid
				
			} else if (Trans(price,balance) > 0) { // check for an eligible purchase, and grant it
				balance = balance - price;
				System.out.println("You may purchase this item. You've now spent: ");
				System.out.println("\t " + currency.format(225 - (balance)));
				System.out.println("You can buy " + (6 - itemNum) + " more item(s) with " + currency.format(balance) + " to spare");
			} else { //if all other conditions fail, all that's left is a 0 balance
				balance = Trans(price,balance);
				System.out.println("The balance is now " + currency.format(balance));
				System.out.println("You spent the entire balance and purchased " + itemNum + " item(s)");
				break;
			}
				if (itemNum == 6 && balance == 0) { // Declare when user buys 6 items for exactly $225.
					System.out.println("You managed to spend $225.00 on exactly 6 items. Way to go!");
				} else if (itemNum == 6 && balance > 0) { //Declare when user still has a balance after getting the maximum number of items
					System.out.println("You bought the maximum of 6 items and still have " + currency.format(balance) + " remaining.");
				} 
				
					
		}// end for loop
		
		}// end while loop

					
}// end main method
	
	public static double Trans(double price,double balance) {
		
		return (balance - price);
	} //end Trans Method

}//end GiftCard Class
