package tekPyramidPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMltpleWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newWindowsBtn")).click();
		
		String mainwindow= driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String window: allWindows) {
			//Object mainwindow;
			if(window.equals(mainwindow)) {
				driver.switchTo().window(window);
				System.out.println("new window title:" + driver.getTitle());
			}
		}
		
		
	    driver.findElement(By.id("firstName")).sendKeys("swa");
		driver.findElement(By.id("lastName")).sendKeys("s@123");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("chopparapuswathi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("create");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
		driver.findElement(By.id("navigateHome")).click();
		//driver.close();
	}
	

}
