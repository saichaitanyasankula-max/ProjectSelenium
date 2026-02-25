package seleniumGrid;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTreeSetTest extends BaseClassSGTest{

	@Test
	public void webtable3() {
		
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> headers = driver.findElements(By.xpath("//tbody//descendant::tr//child::th"));
		
		TreeSet<String> ts=new TreeSet<String>();
		
		for (WebElement we: headers) {
			
			ts.add(we.getText());
		
		}
		System.out.println(ts);
		
		System.out.println("----tabledata----");
		
		List<WebElement> ele = driver.findElements(By.xpath("//tbody//descendant::tr//child::td"));
		
		for (WebElement web : ele) {
			
			String t = web.getText();
			
			System.out.println(t);
		}
	
	}
}
