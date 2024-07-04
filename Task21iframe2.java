package javamaven1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Task21iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		

		//locate click in the first window
		driver.findElement(By.linkText("Click Here")).click();		
		
		
		// geting the set of windows id
		  
		Set<String> wHSet = driver.getWindowHandles();
		System.out.println();
		
		System.out.println("Windows present in browser " + wHSet );
		System.out.println("***************************************************************************");
		
		// convert the set to list
		
		List<String> whList = new ArrayList<String>(wHSet);
		
		driver.switchTo().window(whList.get(1));
		
		//to get the current window id alone
		
        String Currentwindow = driver.getWindowHandle();
        System.out.println();
		System.out.println("The Current active window " + Currentwindow);
		
		System.out.println("***************************************************************************");
		
		//validation
		String expwindow = "New Window";
		
		String actwindow = driver.getTitle();
		
		if(expwindow.equalsIgnoreCase(actwindow)) {
			System.out.println();
			System.out.println("Switched to new Window , and current window id " + Currentwindow); 
			System.out.println("Title= " + actwindow);
			System.out.println("***************************************************************************");
			
		}else {
			System.out.println("Window handling error");
			
		}
		
		//close the current active window
		
		driver.close();
		
		//Switching back to original window
		
		
		 driver.switchTo().window(whList.get(0));
		 //Validation
		 String exporiginalwindow ="The Internet";
		 
		String originalwindow = driver.getTitle();
		
		if(exporiginalwindow.equalsIgnoreCase(originalwindow)) {
			System.out.println();
			
			System.out.println("Switched to original window ");
			
			System.out.println("Title= " + originalwindow);	
			
			System.out.println("***************************************************************************");
			
			
					
		}else {
			
			System.out.println("Switching unsucessfull");
			
			//driver.close;		
			
		}		
		

	}

}
