package javamaven1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbtask18 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//get title of page to verify
		String Actual =	driver.getTitle();
		
		System.out.println("The title of page" + Actual );
		
		//  click on create account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("GD");
		driver.findElement(By.name("lastname")).sendKeys("Dharma");
		driver.findElement(By.name("reg_email__")).sendKeys("gowthamidharma@gmail.com");		
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("gowthamidharma@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Admin@1234");
		
		
		// storing in a variable
		WebElement day = driver.findElement(By.id("day"));
		//creating a select class to use the drop as its present in the select class
		Select d = new Select(day);
		d.selectByValue("11");
		
		// storing in a variable
		WebElement month =driver.findElement(By.id("month"));
		Select m  = new Select(month);
		m.selectByValue("5");
		
		// storing in a variable
		WebElement year =driver.findElement(By.id("year"));
		Select y  = new Select(year);
		y.selectByValue("1985");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		// click signin
		
		driver.findElement(By.name("websubmit")).click();
		
		//verify and validate the login
		
		
		String Expectedtext ="Gowthami Dharmalingam";
		String actualurl =	driver.findElement(By.xpath("//span[text()='Gowthami Dharmalingam']")).getText();
		
		
		if(Expectedtext.equalsIgnoreCase(actualurl)) {
			System.out.println("Sucessful login");
			
		}else {
			System.out.println("UnSucessful login");
		}
		
		//driver.close();
		
			
		
		}

}

		

		
	 


