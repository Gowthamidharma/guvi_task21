package javamaven1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Snapdealtask17 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	//launch the browser
	   WebDriver driver = new ChromeDriver();
		
	 // load url
	   
		driver.get("http://www.snapdeal.com//");
		
	 // maximize window
		
		driver.manage().window().maximize();
	
	 //set implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	//	loacate the element
		WebElement signin =driver.findElement(By.xpath("(//span[text()='Sign In'])"));
		
		WebElement move = driver.findElement(By.xpath("(//span[contains(@class,'accountBtn btn rippleWhite')])"));
	// create class for mouse actions	
	
	  Actions mouse = new Actions(driver);
	  
	  
	  // click and hold mouse and move to login and perform click
	  
	  mouse.clickAndHold(signin).moveToElement(move).click(move).release().perform();  
	  
	  
	  // move to login frame  
	  
		
		  driver.switchTo().frame("loginIframe");
		  
		  driver.findElement(By.id("userName")).sendKeys("9600192572");
		  
	      driver.findElement(By.id("checkUser")).click();
	      
	      driver.findElement(By.id("j_username_new")).sendKeys("gowthamidharma@gmail.com");
	      
	      driver.findElement(By.id("j_name")).sendKeys("GD");
		  
		driver.findElement(By.id("j_password")).sendKeys("Admin@1234");
		
		driver.findElement(By.id("userSignup")).click();
		
		//Thread.sleep(20000);		
			
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='userAuth-card']")));
						  
		  // after entering otp
		  
		  driver.findElement(By.id("loginUsingOtp")).click();
		  
		  // validation of username
		  
		  String expectString="GD";
		  
		 String actualString = driver.findElement(By.xpath("//span[contains@class='accountUserName']")).getText();
		  
		  if (expectString.equalsIgnoreCase(actualString)) {
		  System.out.println("Sucessfull Login"); 
		  }
		  
		  else
		  {
		  
		  System.out.println("Login Unsucessfull");
		  }
		 
	}
}


