package tekPyramidPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> ele = driver.findElements(By.xpath("//table//tbody//tr"));
		
		int rowsize=ele.size();
		
		System.out.println(rowsize);
		
		//we are getting all row data
		
		for (int i = 0; i < rowsize; i++) {
			
			String text = ele.get(i).getText();
			System.out.println(text);
		}
//		
//		System.out.println("1.=======================");
		
		//we are getting the particular element
		
//		for (int i = 1; i <= rowsize; i++) {
//			
//			WebElement browser = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]"));
//			
//			if(browser.getText().equals("Chrome"))
//			{
//				String cpuload = driver.findElement(By.xpath("//table//tbody//tr//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
//				
//				System.out.println(cpuload);
//				
//				String value = driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
//				
//				System.out.println(value);
//	
//				if(value.contains(cpuload))
//				{
//					System.out.println("Cpu load of chrome is equal");
//				}
//				else
//				{
//					System.out.println("Cpu load of chrome is not equal");
//				}
//				break;
//			}
//			
//		}
		
		////table//tbody//tr//td[text()='Chrome']//following-sibling::*
	
	}
}
