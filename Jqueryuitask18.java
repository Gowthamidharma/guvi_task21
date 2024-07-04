package javamaven1;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jqueryuitask18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriver driver = new FirefoxDriver();
		
		//load url
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		// manage window
		
		driver.manage().window().maximize();
		
		// set implicit
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		// source location xpath with text
		
		WebElement source =driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		//dest location xpath text
		
		WebElement dest =driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		
		// create action action class and create obj to use mouse actions class
		
		Actions jq = new Actions(driver);
		jq.dragAndDropBy(source, 158, 28).perform();
		
		System.out.println("after drop" + dest.getLocation());
		
		// inspect dropped location after drop by using css selector and validate and verify
		
		
		String exccolor="rgb(255, 250, 144)";
		String dropcolor =driver.findElement(By.cssSelector("div#droppable")).getCssValue("background-color");
		
		  if (exccolor.equalsIgnoreCase(dropcolor)) {
		  System.out.println("Drag Drop Sucessfull, background changed to yellow");
		  }
		  else { System.out.println("Drag Drop Unsucessfull and no sign of color change ");
		  		  
		  }
		  
		// inspect dropped location after drop by using css selector and validate and verify
		  
		  String exdrop= "Dropped!";
			
			String dropcss =driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
			if(exdrop.equalsIgnoreCase(dropcss)) {
				System.out.println("Drag Drop Sucessfull");
			}
			else {
				System.out.println("Drag Drop Unsucessfull");
				
			}
		 
			// driver.close();
			
			
		}		
		

	}


