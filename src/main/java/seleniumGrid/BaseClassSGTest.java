package seleniumGrid;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassSGTest {

	public static WebDriver driver;
	
	public DesiredCapabilities cap=new DesiredCapabilities();
	
	
	@BeforeSuite
	public void dbconnection() {
		
		System.out.println("database connection");
	}
	
	@BeforeClass
	public void openBrowser() {
		
		System.out.println("open browser");
	}
	
	@BeforeMethod
	public void login() {
		
		System.out.println("login with valid credentials");
	}
	
	@Parameters({"browser"})
	@BeforeTest
	public void login(String browser) throws IOException {
			
			if(browser.equals("chrome"))
			{
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.ANY);
				
				ChromeOptions options=new ChromeOptions();
				options.merge(cap);
			}
			else if(browser.equals("MicrosoftEdge"))
			{
				cap.setBrowserName("MicrosoftEdge");
				cap.setPlatform(Platform.ANY);
				
				ChromeOptions options=new ChromeOptions();
				options.merge(cap);
			}
			else if(browser.equals("firefox"))
			{
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.ANY);
				
				ChromeOptions options=new ChromeOptions();
				options.merge(cap);
			}
			
			//Standalone -hub
			driver=new RemoteWebDriver(new URL(" http://192.168.1.157:4444"), cap);
			
			//node
		//	driver=new RemoteWebDriver(new URL("http://192.168.1.158:4444"), cap);
		}
	
	@AfterTest
	public void test() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void logout() {
		
		System.out.println("logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void closedbConnection() {
		
		System.out.println("closedbconnection");
	}
	}
//	}
