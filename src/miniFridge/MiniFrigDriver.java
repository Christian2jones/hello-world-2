/* Christian E Jones
 * CIS 2212 Midterm Exam
 * 02/26/2019
 */

package miniFridge;

import java.util.Scanner;

public class MiniFrigDriver {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in); //scanner object created
				

				// name, dept, widt, hgt, prc, color
				MiniFrig f1 = new MiniFrig("Insignia Beverage Cooler", 17.3, 18.09, 33.1, 269.99, "glass");
				MiniFrig f2 = new MiniFrig("Frigidaire", 15.3, 16.2, 23.0, 199.99, "glass");
				MiniFrig f3 = new MiniFrig(); //use no arg constructor

				
								
				System.out.println("Please enter the name of the unit: ");
				String name;
				name = input.next();
				f3.setName(name);
				
				System.out.println("Enter the item's depth: ");
				double dep = input.nextDouble();
				f3.setDepth(dep);
				
				System.out.println("Enter the item's width: ");
				double wid = input.nextDouble();
				f3.setWidth(wid);

				System.out.println("Enter the item's height: ");
				double hgt = input.nextDouble();
				f3.setHeight(hgt);
	
				System.out.println("How much does the unit cost? ");
				double prc = input.nextDouble();
				f3.setPrice(prc);

						while (prc < 50.00) {
							System.out.println("Price must be at least $50. Please try again: ");
							prc = input.nextDouble();
							f3.setPrice(prc);

						}//end while loop
						
				System.out.println("Enter the item's door color: ");
				String color = input.next();
				f3.setColor(color);
				
				
				//array named FridgeArray holding 3 objects of the MiniFrig type
				MiniFrig[] FridgeArray = new MiniFrig[3];
				
				FridgeArray[0] = f3;
				FridgeArray[1] = f1;
				FridgeArray[2] = f2;
				
				displayArray(FridgeArray);
				
		}//end main method
	
	public static void displayArray(MiniFrig[] FArray) {
		System.out.println("Refrigerators: ");
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Fridge #" + (i + 1) + ": " );
			System.out.println(FArray[i]);
		}
	}
}//end Class
