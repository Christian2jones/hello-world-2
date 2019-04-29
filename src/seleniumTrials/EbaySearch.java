/*
 * using the .isDisplayed command returns a Boolean to check if something is hidden or not
 * 
 */
package seleniumTrials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {

	public static void main(String[] args) {

//Initialize your variables, import any additional necessary resources
		String URL = "http://www.Ebay.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
//Begin execution
		driver.get(URL); //open webpage using assigned items from URL variable
		driver.findElement(By.id("gh-ac")).sendKeys("Gaming Desktop"); //type input data into search field
		driver.findElement(By.id("gh-cat")).sendKeys("comp"); // type "comp" to get to the Computers/Tablets & Networking filter
		driver.findElement(By.id("gh-btn")).click(); //Click on search
		
		// print out the number shown on the webpage for TOTAL number of results:
		System.out.println("Total results found: " + driver.findElement(By.xpath("//*[@id=\"w4\"]/div[2]/div/div[1]/h1")).getText());
		// Find and Assign number of listings/results on this page to a variable "pageItems":
		List <WebElement> pageItems = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul//child::li"));
		// print out number of results on this page: (By default, Ebay shows 50 items per page per search
		// You may also skip the above step by taking everything after the "=", and replacing "pageItems" below.
		System.out.println("# of listings on this page: " + pageItems.size());
		
		
	}//end main

}//end class
