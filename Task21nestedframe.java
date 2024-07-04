package javamaven1;

import java.time.Duration;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21nestedframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			
		
			
			 WebElement  topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
			 driver.switchTo().frame(topframe);
			 
				
			WebElement  topleftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
			driver.switchTo().frame(topleftframe);
			String topleftframetext = topleftframe.getText();
			System.out.println(topleftframetext);
			
			
			 
				 
				 
				 
				 
			//locate default frame
			
			//driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
			
			
			//driver.switchTo().frame(topframe);
			
			

	}

}
