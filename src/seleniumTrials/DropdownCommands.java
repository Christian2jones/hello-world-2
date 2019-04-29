package seleniumTrials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
* Multiple commands can be used for Select once an element has been located
*	
*	selectByVisibleText = 
*	selectByIndex = 
*	selectByValue = 
*	getOptions = returns a list, takes all options in a given list, all years in a dropdown list for example
*	Print all the options = 
*	DeSelect Methods = deselecting a multiple select, only within a multiple select menu, where you can
*		.deselectAll;
*		.desslctByIndex;
*		.deselectByVisibleText
*		.deselectByValue
*	isMultiple =  indicates whether or not the select element supports multiple selecting options at the same time. 
*	Just checks in the DOM if the multiple attribute is there.
*/

public class DropdownCommands {

	public static void main(String[] args) throws InterruptedException {
		
//Initialize your variables, import any additional necessary resources
String URL = "https://www.toolsqa.com/automation-practice-form/";
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();

//Begin Execution:

	//open website
	driver.get(URL);
	//select continents dropdown via id
	driver.findElement(By.id("continents")).click();
	//declare a select variable
	Select selection = new Select(driver.findElement(By.id("continents")));
	//select Europe by visible text
	selection.selectByVisibleText("Europe");
	Thread.sleep(3000);
	//select Africa by index
	selection.selectByIndex(2); //Africa is index #2 in the list
	Thread.sleep(3000);
	//list options to choose from:
//	System.out.println("Continents to choose from: \n" + selection.getOptions);
	//select an option of your choice
	
	//Select the Selenium Commands box by name
	Select selection2 = new Select(driver.findElement(By.name("selenium_commands")));
	driver.findElement(By.name("selenium_commands")).click();
	//Find 'Browser Commands' in the multiple selection box, followed by de-selecting it using select by index
	selection2.selectByIndex(0);
	Thread.sleep(3000);
	selection2.deselectByIndex(0);
	Thread.sleep(3000);
	//select navigation commands and then de-select it
	selection2.selectByVisibleText("Navigation Commands");
	Thread.sleep(3000);
	selection2.deselectByVisibleText("Navigation Commands");
	Thread.sleep(3000);
	//Print and select ALL options for the selected mulitple selection list
	
	
	
	//Select each item of the l
		for (int i = 0; i < 4 ; i++) {
			System.out.println("selecting all elements");
			selection2.selectByIndex(i);
			
		}//end for loop
	System.out.println("All items currently selected");
	Thread.sleep(3000);
	//deselect all options
	selection2.deselectAll();
	System.out.println("All items deselected");
	Thread.sleep(3000);
	//close the browser
	driver.close();
	}//end main
	

}//end class
