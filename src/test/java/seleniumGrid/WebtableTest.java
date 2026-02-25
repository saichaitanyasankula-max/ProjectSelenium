package seleniumGrid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTest extends BaseClassSGTest  {

	@Test
	public void webtable2() {
		
		//WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		
	 List<WebElement> list = driver.findElements(By.xpath("//thead[@class='text-xs text-gray-700 uppercase bg-orange-200']"));
	
	for (WebElement web : list) {
		
		String text = web.getText();	
		
		System.out.println(text);
		
		driver.close();
	}	
	}
}
