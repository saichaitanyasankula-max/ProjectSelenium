package seleniumGrid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebtabletablerowTest{

	@Test
	public void webtable() {
		
		//WebDriver driver=new ChromeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable?scenario=1");
		
		List<WebElement> list = driver.findElements(By.xpath("//tr"));
		
		int count = list.size();
		
		System.out.println(count);
		
		driver.close();
		
//		for (WebElement ele : list) {
//			
//			String text = ele.getText();
//			
//			System.out.println(text);
//		}
		
		
//		for (int i = 0; i<count; i++) {
//			
//			WebElement ind = list.get(i);
//			
//			String text = ind.getText();
//			
//			System.out.println(text);
//		}
		
//		Iterator<WebElement> ite = list.iterator();
//		
//		while(ite.hasNext())
//		{
//			
//			String text = ite.next().getText();
//			
//			System.out.println(text);
//		}
		
//		List<WebElement> ele = driver.findElements(By.xpath("//th[@class='px-6 py-4 font-medium text-gray-900 whitespace-nowrap']"));
//
//		int text = ele.size();
//		
//		System.out.println(text);
//		
//		for (WebElement exe : ele) {
//			
//			String text1=exe.getText();
//			
//			System.out.println(text1);
//			
//		}
		
//		List<WebElement> ele1 = driver.findElements(By.xpath("//td[1]"));
//		
//		Iterator<WebElement> st = ele1.iterator();
//		
//		while(st.hasNext())
//		{
//			String tex = st.next().getText();
//			
//			System.out.println(tex);
//		}
	}
}
