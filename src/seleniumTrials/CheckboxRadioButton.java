package seleniumTrials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioButton {

	public static void main(String[] args) {

/**
 * Challenges:
 * 
 * Select deselected radio button (female) for category SEX using isSelected
 * 
 * Select the third radio button for category Years of EXP. use ID attribute to select radio button
 * 
 * Check hecbox automation tester for cat. profession, use value attribute to atch the selection
 * 
 * Check checkbox selenium IDE for cat. automation tool. use cssSelector to match the selection
 *
 */

//Declare variables
String URL = "https://www.toolsqa.com/automation-practice-form/";

WebDriver driver;

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();

	
//Challenge 1: Select deselected radio button (female) for category SEX using isSelected
driver.get(URL);

driver.findElement(By.id("sex-1")).isSelected();

	if (driver.findElement(By.id("sex-1")).isSelected()) {
		System.out.println("Female was not selected. Choosing Male");
		driver.findElement(By.id("sex-2")).click();
	} else 
		System.out.println("Male was not selected. Choosing Female");
		driver.findElement(By.id("sex-1")).click();
		
//Challenge 2: Select the third radio button for category Years of EXP. use ID attribute to select radio button
	
driver.findElement(By.id("exp-2")).click(); //selects 3rd radio button using its id, exp 0-6

//Challenge 3: Check checkbox automation tester for cat. profession, use value attribute to atch the selection

	/*
	 * Find list of elements
	 * get the .sizde of the list and store into variable
	 * using for loop, for i = 0 where i < size, i++
	 * create a String variable to store the value inside of each item in the list
	 * use listname.get(i).getAttribute("value") (whether automation tester or manual tester
	 * 	if value.equalsIsIGnoreCase("Automation Tester")
	 * 	click the box if the check box contains the wanted String name / data
	 * 		end if
	 * end loop
	 */

//Challenge 4: Check checkbox selenium IDE for cat. automation tool. use cssSelector to match the selection

driver.findElement(By.cssSelector("input[value = \"Selenium IDE\" ]")).click(); 

/*other options for css include:
 * input[type = \"checkbox\" ] //careful here ad there can be multiple checkboxes, and is best for populating a list
 * input[name = \"tool\" ]
 * input[id = \"tool-1\" ]
 */
		
/* Element details
 * <input id="tool-1" name="tool" type="checkbox" value="Selenium IDE">
 * 
 */
		
		
	}//end main

}//end class
