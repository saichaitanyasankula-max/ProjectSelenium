package tekPyramidPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchingdatabyrank {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/SaiChaitanya/Desktop/FetchingRankTable.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='web1']//descendant::tr"));
	
		Object[] li = list.toArray();
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		for (int i = 0; i <li.length; i++) {
			
			if(hs.containsKey(li[i])) {
				
				hs.put((String) li[i],hs.get(li[i])+1);
				
			}
			else
			{
				hs.put((String)li[i], 1);
			}
		}
		System.out.println(hs);
	}
		
	}

