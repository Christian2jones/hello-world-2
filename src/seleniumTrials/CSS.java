/**	
  	Tag[attribute="value"]
	Tag[attribute='value']  is the syntax for creating a CSS selector
	"#" Refers to id
	"." Refers to the class
	#displayed-text is a shortcut 
	Input#displayed-text can be used to shorten a search incase there are multiple matching nodes. This searches for results which are ONLY input tags


	Start with CTRL + F while using google dev tools and then type:
	
	Input[id=displayed-text]
		("tag[attribute-value])
		
	#displayed-text
		("IDvalue")
	
	Input#displayed-text
		("tagIDvalue")
		
		driver.navigate().to("Webaddress"); to navigate to a specific webpage or URL
		driver.navigate().back("Webaddress"); go back to a webpage which is open
		driver.navigate().forward("Webaddress"); go back again from "back" to the other open webpage
		
	.isEnabled used for text boxes
	.isSelected() checks if radio or check-box buttons are checked, it is a boolean value and returns true or false

 */

package seleniumTrials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		
//declare variables	
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.google.com/flights";
		
		driver.get(URL); //go to your first site
		Thread.sleep(3000);
		driver.navigate().to("https://www.travelocity.com/"); //then to your second site
		Thread.sleep(3000);
		driver.navigate().to("https://learn.letskodeit.com/p/practice"); //then to your second site
		Thread.sleep(3000);
		driver.navigate().back(); //then back to travelocity
		Thread.sleep(3000);
		driver.navigate().back(); //then back to google)
		Thread.sleep(3000);
		driver.navigate().forward();//then forward to your second site
		Thread.sleep(3000);
		
// Type name into fields using name locator, submit using ID locator.


		
		
		
		
		
		
		
	}//end main

	
}//end class
