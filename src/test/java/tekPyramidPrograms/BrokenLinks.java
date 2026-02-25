package tekPyramidPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		
		//capture all the links from the website
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for (WebElement broken : links) {
			
			String value = broken.getAttribute("href");
			
			//if it is null or empty it is going to skip
			
			if(value==null || value.isEmpty())
			{
				System.out.println("we cant chekc");
				continue;
			}
			try {
			//Converting value to the url
			URL u=new URL(value);
			//System.out.println(u);
			
			//Open Connection to the url
			HttpURLConnection conn = (HttpURLConnection)u.openConnection();
			
			//connect to the url and send request to the server
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				
				System.out.println(value+"--->"+conn.getResponseCode()+"It is a broken link"+conn);
			}
			else
			{
				System.out.println(value+"=====>"+"Un broken link");
			}
		}
			catch(Exception e) {
		}		
		}
	}
}
