package seleniumTrials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelocityFlights {

	public static void main(String[] args) throws InterruptedException {

//Initialize your variables, import any additional necessary resources
	String URL = "http://www.travelocity.com/flights";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
		
//Begin execution
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("flight-origin-flp")).sendKeys(" Cincinnati, OH");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-destination-flp")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("flight-destination-flp")).sendKeys(" Belize city, belize");
		Thread.sleep(2000);
		//click into the second box to do return date first, this offsets auto-fill when selecting departure date first 
		driver.findElement(By.id("flight-returning-flp")).click();
//		Thread.sleep(2000); //may not be necessary 
		driver.findElement(By.id("flight-returning-flp")).clear();
//		Thread.sleep(2000); //may not be necessary 
		driver.findElement(By.id("flight-returning-flp")).sendKeys("2/20/2020");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-departing-flp")).sendKeys("2/10/2020");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-adults-flp")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-children-flp")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-age-select-1-flp")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[9]/label/button")).click();

				
	}//end main

}//end class
