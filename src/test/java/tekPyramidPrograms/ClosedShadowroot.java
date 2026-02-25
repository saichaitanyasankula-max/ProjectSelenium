package tekPyramidPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowroot {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		
		WebElement login = driver.findElement(By.xpath("//h1[.='Login']"));
	
		login.click();
	
		Actions ac=new Actions(driver);
		
		ac.sendKeys(Keys.TAB).sendKeys("username").sendKeys(Keys.TAB).sendKeys("password").perform();
		
		
//		WebElement ele = driver.findElement(By.xpath("//div[@class='my-3'][1]"));
//		
//		SearchContext sha = ele.getShadowRoot();
//		
//		sha.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("hai");
		
		
		
		
	}
}
