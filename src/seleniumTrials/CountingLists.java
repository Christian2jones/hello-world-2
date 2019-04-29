package seleniumTrials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLists {

	public static void main(String[] args) {
		
		String URL = "https://www.techbeamers.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
//Create the list of each list in HTML as a string array
		
		driver.get(URL);
		List <WebElement> LearnPython = driver.findElements(By.xpath("//*[@id=\"post-2986\"]/div/div/div[3]/div[1]/div[2]/div/ul//child::li"));
	
		String[] array = new String[LearnPython.size()];
		
		System.out.println("The array: " + array.length);
		System.out.println("Learn Pythons size: " + LearnPython.size());
		
		//arraylist to array conversion
		
		for (int i = 0; i < LearnPython.size() ; i++) {
			
//			array[i] = LearnPython.get(i);
						
			System.out.println(i + " value of the array: " + array[i]);
			
		}//end for loop
		
	}//end main

}//end class
