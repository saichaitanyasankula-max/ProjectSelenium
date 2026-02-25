package tekPyramidPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/TekPyramid/Webtable.html");
		
		List<WebElement> elem = driver.findElements(By.xpath("//div[@name='Webtable']"));
		
//		for (WebElement web : elem) {
			
//			System.out.println("fetch the entire data for the table1");
//			
//			List<WebElement> ele = driver.findElements(By.xpath("//table[@id='TABLE1']"));
//			
//			for (WebElement webe : ele) {
//				
//				String text=webe.getText();
//				
//				System.out.println(text);
//		}
			
//			System.out.println("=============================");
//			
//			System.out.println("fetching the data from two tables");
//			
//			List<WebElement> ele6 = driver.findElements(By.xpath("//table"));
//			
//			for (WebElement webe : ele6) {
//				
//				String text=webe.getText();
//				
//				System.out.println(text);
//			}
//			System.out.println("==================================");
//			
			System.out.println("fetching the data for the first coloum");
			
			List<WebElement> ele1 = driver.findElements(By.xpath("//table[@id='TABLE1']//descendant::tr//child::td[1]"));
			
			for (WebElement ele2 : ele1) {
				
				String text1 = ele2.getText();
				
				System.out.println(text1);
			}
			
//			System.out.println("======================");
			
//			System.out.println("fetching the data for the 1st and fourth coloum for two tables");
//			
//	List<WebElement> ele2 = driver.findElements(By.xpath("//table/tbody/tr/td[position()=1 or position()=4]"));
//			
//			for (WebElement ele3 : ele2) {
//				
//				String text2 = ele3.getText();
//				
//				System.out.println(text2);
//			}		
			
//			System.out.println("fetching the data for the 1st and fourth coloum for first table");
//			
//			List<WebElement> ele4 = driver.findElements(By.xpath("//table[1]//descendant::tr//child::td[position()=1 or position()=4]"));
//		
//				for (WebElement ele5 : ele4) {
//				
//				String text3 = ele5.getText();
//				
//				System.out.println(text3);
//			}	
			
		}
	}

