/* Christian E Jones
 * CIS 2212 Midterm Exam
 * 02/26/2019
 */

package miniFridge;

import java.text.DecimalFormat;

public class MiniFrig {
	
	private String name; //create data fields
	private double depth;
	private double width;
	private double height;
	private double price;
	private String color;
	
	//no arg constructor
	//name, dept, wid, hgt, prc, color

	public MiniFrig(String name, double dep, double wid, double hgt, double prc, String color) {
		this.depth = dep;
		this.width = wid;
		this.color = color;
		this.height = hgt;
		this.name = name;
		this.price = prc;
	}//end MiniFrig constructor

	public MiniFrig() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//instance method to calculate cubic ft. of the unit
	public String calcCubicFt(double dep, double wid, double hgt) {
		
		
		double cubeFT = (dep * wid * hgt) / 1728;
		DecimalFormat decimalFormat = new DecimalFormat("##0.000"); //bring in formatter utility
		
		return decimalFormat.format(cubeFT);
		

		
	}// end calcCubicFt method
	
	//instance method to calculate final price of unit after any discounts
	public String calcFinalPrice(String name, double dep, double wid, double hgt, double prc, String color) {
		
		DecimalFormat priceFormatter = new DecimalFormat("#0.00");
		
		if (color == "glass") {
			
				double price = (prc - (0.1 * prc));
				
				return priceFormatter.format(price);
		} else
			
			
		
			return priceFormatter.format(prc);
		
		
	}//end calcFinalPrice method
	
	//display results with overridden object.toString()
		@Override
		public String toString() {
			
			String str = "\n	Name: " + this.name;
					str += "\n	Cubic Feet: " + this.calcCubicFt(depth, width, height);
					str += "\n	Color: " + this.color;
					str += "\n	Original rice: $" + this.price;
					str += "\n	Final Price: $" + this.calcFinalPrice(name, depth, width, height, price, color);
					str += "\n";
					
					
					return str;
		}
	
	
	
}
