package seleniumTrials;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsWithClassNAme {

		public static void main(String[] args) throws InterruptedException {


//			String baseURL = "http://www.yammer.com/";
			
			WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
//			driver.get(baseURL);
//			
//			driver.findElement(By.className("yj-public-page--header-login")).click(); //find an element by class name
//			driver.findElements(By.tagName("yj-public-page--header-login")); //find multiples element by tag name
					
// retrieve all links from this webpage

			
//		String URL2 = "https://www.google.com/";
//		
//				driver.get(URL2);
//	
//				
//				List<WebElement> links = driver.findElements(By.tagName("a"));
//				
//				System.out.println("number of links = " + links.size());//print the size of links using links.size():
//		
//	//possible for loop items:
//	//WebElement resultItem : links.size
//	//int i = 0 ; i < links.size(); i++
//					for (int i = 0 ; i < links.size(); i++){
//						
//					System.out.println(links.get(i).getText());//print out the text from each link
//	
//					}//end for loop
//	
//					driver.close();

				
//Write a script that adds 3 items to shopping cart, and checks out with email acc, address and credit card info

// create local variables to use as input for text boxes
	String URL3 = "http://automationpractice.com/index.php";
	String firstName = "Sunny";
	String lastName = "Jones";
	String phone = "9042914222";
	String address = "3065 Apalachicola BLVD";
	String zipc = "32068";
	String city = "Jacksonville";
	double random = (Math.random()*50+1);
	String randemail =  random + "bigsunny@live.com";
	String pass = "w071kmj";
	
	driver.get(URL3);
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click(); // go to T-Shirts
	driver.findElement(By.linkText("Add to cart")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click(); //pass pop up box
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();//select dresses
	driver.findElement(By.linkText("Summer Dresses")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")).click(); //grab info on the $30.50 short dress
	driver.findElement(By.name("White")).click(); //change dress color to white group_1
	driver.findElement(By.name("group_1")).click(); // open size selector
	driver.findElement(By.name("group_1")).sendKeys("M"); //send keys "M" for size Medium
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click(); //add second dress ot cart
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click(); // close pop-up
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();//select dresses
	driver.findElement(By.linkText("Casual Dresses")).click();//go to evening dresses
	driver.findElement(By.linkText("Add to cart")).click(); //add item to cart
	Thread.sleep(5000); //wait for pop up to show
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click(); // close pop-up
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();//navigate to cart
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click(); //click proceed to checkout
	driver.findElement(By.name("email_create")).sendKeys(randemail); //place in a randomly generated email so no need to sign in with current details
	driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click(); //create an account
	Thread.sleep(6000);//wait for next page to show up
	
//Now add variable data into input fields
	
// 	driver.findElement(By.id("id_gender1")).click(); // another possible way to find radio button
	driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click(); // MR. or MRS. ?
	driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
	driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
//	driver.findElement(By.id("email")).sendKeys(email); // not necessary as email was already put in
	driver.findElement(By.id("passwd")).sendKeys(pass);
//select DOB boxes
	driver.findElement(By.id("uniform-days")).click();
	driver.findElement(By.name("days")).sendKeys("27"); //send "27" to mark the day of the month
	driver.findElement(By.id("months")).click();
	driver.findElement(By.id("months")).sendKeys("O"); //type "O" to select October
	driver.findElement(By.id("years")).click();
	driver.findElement(By.id("years")).sendKeys("2000"); //type 2000 to mark birth year
//Proceed with Address entry
//	driver.findElement(By.id("firstname")).sendKeys(firstName); //re enter first name
//	driver.findElement(By.id("lastname")).sendKeys(lastName); // re enter last name
	driver.findElement(By.id("address1")).sendKeys(address); // fill street address line
	driver.findElement(By.id("city")).sendKeys(city); // add the city name
	driver.findElement(By.id("id_state")).sendKeys("FL"); //enter FL to get to Florida
	driver.findElement(By.id("postcode")).sendKeys(zipc); //enter zipcode
	driver.findElement(By.id("phone_mobile")).sendKeys(phone); //input a phone number (required)
	driver.findElement(By.name("alias")).clear(); // remove anything in this blank
	driver.findElement(By.name("alias")).sendKeys("Beach home"); //call it you beach house
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();//Register your account	
//Next page(s)
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click(); // Proceed to check out after confirming mailing address
	driver.findElement(By.name("cgv")).click(); // agree to terms
	driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click(); // Proceed to check out after confirming shipping type
	driver.findElement(By.className("cheque")).click(); //add item to cart 
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();//confirm my order	
//	Thread.sleep(6000); // if necessary
//Extra steps: Send recommendation to a friend
	driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();//return to home page
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click(); // go to T-Shirts
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click(); //click more on the available t-shirt
	driver.findElement(By.name("group_1")).click(); //choose the blue colored t-shirt
	driver.findElement(By.id("send_friend_button")).click(); //select button to refer product to a friend
	driver.findElement(By.id("friend_name")).sendKeys("Bestie"); //put a name in the friend name box
	driver.findElement(By.id("friend_email")).sendKeys("TheOtherBigSun@gmail.com"); //fill in an email address
	driver.findElement(By.name("sendEmail")).click(); //press send the email
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/p[2]/input")).click(); //close the pop-up box
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();//return to home page










	
	
	
	
		}//end main

}//end class