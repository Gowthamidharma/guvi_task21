package javamaven1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task21nestedframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//base code
		
		   WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			
			
		//switch to topframe
			
			WebElement topframe = driver.findElement(By.cssSelector("frame[name='frame-top']"));
			driver.switchTo().frame(topframe);
		
			// list of frames in top frame
					
			List<WebElement> topframelist = driver.findElements(By.tagName("frame"));
			
			System.out.println("We are inside Top frame , and there are  " + topframelist.size() + " frames in Topframe ");
			
			
			//switch to top left frame
			
			WebElement left =driver.findElement(By.cssSelector("frame[name='frame-left']"));
			driver.switchTo().frame(left);
		   
			 String lefttext =driver.findElement(By.tagName("body")).getText(); 			
		    
			 System.out.println("We are inside topleft frame " +lefttext);
			 
			 
			 // switch to parent frame
			 driver.switchTo().parentFrame();
			 
			 //switch to middle from parent frame
			 WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));			 
			 
			 driver.switchTo().frame(middle);
			 
			 String middletext =driver.findElement(By.tagName("body")).getText(); 			
			    
			 System.out.println("We are inside topmiddle frame " +middletext);
			 
			 
			 //back again to parent frame
			 driver.switchTo().parentFrame();
			 
			 
			 
			//switch o topright frame 
			 WebElement right = driver.findElement(By.xpath("//frame[@name='frame-right']"));			 
			 
			 driver.switchTo().frame(right);
			 
			 String righttext =driver.findElement(By.tagName("body")).getText(); 			
			    
			 System.out.println("We are inside topright frame " +righttext);
			
			// switch to parent frame
			 driver.switchTo().parentFrame();	
			 
			 // switch to default content
			 driver.switchTo().defaultContent();
			 
			 //switch to bottom frame from default
			 
			 WebElement bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
			 			 
			 driver.switchTo().frame(bottom);			
			 
			 String bottomtext =driver.findElement(By.tagName("body")).getText(); 			
			    
			 System.out.println("We are inside bottom frame " +bottomtext);
			 
			//switch to default from bottom
			 
			 driver.switchTo().defaultContent();
			 
			 //switch to top frame from default content
			 
			 driver.switchTo().frame(topframe);		 
			 
			//switch to  default from top
			
			driver.switchTo().defaultContent();
			 
			System.out.println("The title of page is " + driver.getCurrentUrl());
			
			 
			
			
						 
			
			
			 
			 
	}

}
