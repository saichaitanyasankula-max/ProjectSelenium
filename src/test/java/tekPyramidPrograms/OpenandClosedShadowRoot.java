package tekPyramidPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenandClosedShadowRoot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/shadow");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sh1 = driver.findElement(By.xpath("//div[@id='open-shadow']"));
		
		SearchContext shroot1 = sh1.getShadowRoot();
		
		WebElement name = shroot1.findElement(By.cssSelector("input[id='fname']"));
		
		name.sendKeys("hello");
		
		Actions a=new Actions(driver);
		
		a.sendKeys(Keys.TAB).sendKeys("hai").sendKeys(Keys.TAB).sendKeys("abc@gmail.com").build().perform();
		
		
//		WebElement sh2 = driver.findElement(By.xpath("//my-web-component"));
//		
//		SearchContext shroot2 = sh2.getShadowRoot();
//		
//		WebElement lastname = shroot2.findElement(By.cssSelector("input[id='lname']"));
//		
//		lastname.sendKeys("hai");
		
//		WebElement sh3 = driver.findElement(By.xpath("//div['close-shadow']"));
//		
//		SearchContext shroot3 = sh3.getShadowRoot();
//		
//		WebElement email = shroot3.findElement(By.cssSelector("input[id='email']"));
//		
//		email.sendKeys("abc@gmail.com");
	}
}
