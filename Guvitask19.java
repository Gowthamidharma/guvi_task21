package javamaven1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guvitask19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriver driver = new FirefoxDriver();
				
		//load url
				
		driver.navigate().to("https://www.guvi.in/register");
				
		// manage window
				
		driver.manage().window().maximize();
				
		// set implicit
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// locate full name using possible locators
		
		  //id
		  driver.findElement(By.id("name")).sendKeys("Test");		
		   //name		
		   driver.findElement(By.name("form-control")).sendKeys("Test");
		  //xpath
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test");
		   //ccs selector 
		  driver.findElement(By.cssSelector("input#name")).sendKeys("Test"); 
		
		  // locate email using possible locators 
		   //id //
		  driver.findElement(By.id("email")).sendKeys("gowthamidharma@gmail.com");
		  //xpath 
		  driver.findElement(By.xpath(" //input[@type='email' ]")).sendKeys(
		  "gowthamidharma@gmail.com");
		   //css selector 
		  driver.findElement(By.cssSelector("//input#email")).sendKeys(
		  "gowthamidharma@gmail.com");
			
			  // locate password using possible locators 
		  
		      //id
		      driver.findElement(By.id("password")).sendKeys("Admin@1234"); 
			  //xpath ////
			  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
			  "Admin@1234"); 
			   // cssselector ////
			  driver.findElement(By.cssSelector("//input#password")).sendKeys("Admin@1234");
			  
			  
			  //locate toogle password 
			  driver.findElement(By.id("togglePassword")).click(); 
			  driver.findElement(By.className("fa fa-fw passToggle fa-eye-slash")).click();			 
			  driver.findElement(By.xpath("(//span[@id='togglePassword'])[1]")).click();
			   driver.findElement(By.cssSelector("//input#togglePassword")).click();
			  
			   
			   //locate mobilenumber 
			  driver.findElement(By.id("mobileNumber")).sendKeys("9600192572"); 
			  driver.findElement(By.className("form-control countrycode-left")).sendKeys(
			  "9600192572");
			  driver.findElement(By.xpath("(//input[@id='mobileNumber'])[1]")).sendKeys(
			  "9600192572"); 
			  driver.findElement(By.cssSelector("//input#mobileNumber")).sendKeys(
			  "9600192572"); 
			  
			   //locate sign up button 
			  driver.findElement(By.id("signup-btn")).click(); 
			  driver.findElement(By.className("btn signup-btn")).click(); 
			  driver.findElement(By.partialLinkText("Sign")).click(); 
			  driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
			  driver.findElement(By.tagName("a")).click(); 
			  driver.findElement(By.cssSelector("//a#signup-btn")).click(); 
			  
			  // close 
			  driver.close(); 
			 		

	}

}
