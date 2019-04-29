package seleniumTrials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursWebsite {

	public static void main(String[] args) throws InterruptedException {

String baseURL = "http://www.newtours.demoaut.com/";
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.findElement(By.name("userName")).sendKeys("w071kmj"); //add user name into user name blank
		driver.findElement(By.name("password")).sendKeys("Z8yKEV8sYZsamPx"); //add password into password blank
		driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		
		driver.findElement(By.linkText("linkText")); //from gillscarwash.com
		
		
		
		Thread.sleep(10000); //wait 10 seconds before clicking log out

		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click(); //click log out button

	}

}
