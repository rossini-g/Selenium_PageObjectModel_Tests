package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import support.Engine;

/**
 * @author Rossini Higgins
 *
 */
public class TestBase extends Engine {
	
	protected WebDriver loadbrowser()
    {
		WebDriver driver = null;
		System.out.println( "Loading browser: "+browser);
        
        if(browser.equalsIgnoreCase("Chrome"))
		{	        	
        	System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.exe");
        	
        	ChromeOptions options = new ChromeOptions();
        	options.addArguments("--disable-extensions");
        	driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
		}
		
		return driver;
    }
	
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() throws Throwable{
		
		System.out.println( "Executing: Before Suite" );
	}
	
	 @BeforeTest
	 public void beforeTest() throws Exception {
		 System.out.println( "Executing: Before Test" );
		 driver = loadbrowser();
		 driver.manage().window().maximize();
	 }
	 
	 @AfterTest
	 public void afterTest() throws Exception {
		 System.out.println( "Executing: Before Test" );
		 driver.quit();
	 }
	
}
