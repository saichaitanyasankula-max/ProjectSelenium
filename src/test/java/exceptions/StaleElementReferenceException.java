package exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceException {
	
	@Test
	public void stale() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		link.click();
		
		driver.navigate().back();
		
		try {
		link.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		}
	}

}
