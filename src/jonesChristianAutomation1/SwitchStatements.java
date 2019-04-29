package jonesChristianAutomation1;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Type a color to find out if it's primary: ");
		String input = in.next(); //read in text
		input = input.toUpperCase();
		
		System.out.println(getprimColor(input));
		
		}//end main
		
	//get name of the color:
		public static String getprimColor(String color) {
			
			String primColor = "";
			
			switch (color) {
				case "RED": primColor = "RED is a Primary Color"; break;
				case "YELLOW": primColor = "YELLOW is a Primary Color"; break;
				case "BLUE": primColor = "BLUE is a Primary Color\""; break;
				default: primColor = "Not a primary color";
			}//end switch
			
		return primColor;
			
			}//end getColor method
			
		 	
}//end class
