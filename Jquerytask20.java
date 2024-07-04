package javamaven1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Jquerytask20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch browser
				WebDriver driver = new ChromeDriver();
				
				//load url
				
				driver.navigate().to("https://jqueryui.com/datepicker/");
				
				// manage window
				
				driver.manage().window().maximize();
				
				// set implicit
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//switch to frame
				
				
				driver.switchTo().frame(0);
				
				// date picker textbox
								
				driver.findElement(By.id("datepicker")).click();
				
				//next arrow
				
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();	
				
				//22nd date on calendar 
				
				
				 driver.findElement(By.xpath("//a[normalize-space()='22']")).click();
				 
				 // get text of the selected date and print				
				
				 String date = driver.findElement(By.xpath("//a[normalize-space()='22']")).getText();
				
				System.out.println("The  current date on calender = " + date + "nd August 2024");
				
				// close the current active window 				
				driver.close();
				
				// close the driver
				
				driver.quit();
				
	}

}
