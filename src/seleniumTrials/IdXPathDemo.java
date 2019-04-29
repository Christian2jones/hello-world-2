/**This Package requires Java 1.8, which removes module and class paths.
 * http://www.newtours.demoaut.com for more demo attempts
 * 
 * 
 */

package seleniumTrials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXPathDemo {

	public static void main(String[] args) {

		String baseURL = "https://www.yahoo.com/";
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.findElement(By.id("uh-search-box")).sendKeys("summer travel deals");
		driver.findElement(By.xpath("//*[@id='uh-search-button']")).click();
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		
		
	}//end main method


		
}//end class
