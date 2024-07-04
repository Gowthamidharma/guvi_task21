package javamaven1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviTask20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		   WebDriver driver = new ChromeDriver();
			
		 // load url
			driver.get("https://www.guvi.in/");
			
		 // maximize window
			driver.manage().window().maximize();
		
		 //set implicit time
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			// locate sign in
			
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		//locate full name
////		
		driver.findElement(By.id("name")).sendKeys("Test");
		
////		// locate emailid
		driver.findElement(By.id("email")).sendKeys("testiduser01@gmail.com");
////		
////		//locate password
////		
		driver.findElement(By.id("password")).sendKeys("Admin@123456");
////		
////		//locate toogle password
////		
		driver.findElement(By.id("togglePassword")).click();
////		
////		//locate mobilenumber
////		
		driver.findElement(By.id("mobileNumber")).sendKeys("9600192572");
////		 
////		//locate sign up button
		driver.findElement(By.id("signup-btn")).click();
////		
////		// select the fields from select class
////		
	WebElement profile=	driver.findElement(By.id("profileDrpDwn"));
	Select pro = new Select(profile);
	pro.selectByValue("Looking for a career");
	
	WebElement degree =	driver.findElement(By.id("degreeDrpDwn"));
	Select degr = new Select(degree);
	degr.selectByValue("B.B.A. / M.B.A.");
	
	driver.findElement(By.id("year")).sendKeys("2010");
	//locate submit form
	
	driver.findElement(By.linkText("Submit")).click();
	// redirecting to gmail authentication mail
	
	driver.findElement(By.xpath("//p[text()='Open Gmail']")).click();	
	
	// java wait time required for gmail authentication as the email was created dummy	
	
	Thread.sleep(50000);
	
	
	//navigate to login page after signup
	
	driver.get("https://www.guvi.in/");
	
	//locate login button
	driver.findElement(By.linkText("Login")).click();
	
	//locate login fields
	
	
	//locate email
	
	driver.findElement(By.id("email")).sendKeys("testiduser01@gmail.com");
	
	//loacte password
	driver.findElement(By.id("password")).sendKeys("Admin@123456");
	
	//locate login button
	driver.findElement(By.linkText("Login")).click();
	
	//locate the user id after login
	driver.findElement(By.xpath("//button[@class='btn dropdown account-box-toggler']")).click();
	
	//locate the userid name 
	String Expuser = "Test";
	
	String actuser = driver.findElement(By.tagName("Test")).getText();
	
	if(Expuser.equalsIgnoreCase(actuser)) {
		System.out.println("sucessfull Login");
	}
		else {			
		System.out.println("Login Unsucessfull");
		}
	
		// driver.close();
	
	}
		
		
	}


