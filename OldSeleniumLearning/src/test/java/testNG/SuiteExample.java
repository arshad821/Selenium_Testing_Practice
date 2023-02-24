package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite
	public void OpenBrowser(){
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\THALILA\\Desktop\\driver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	}

	@Test
	public void OpenGoogle(){
		driver.navigate().to("http://www.google.com");
	}

	@Test
	public void OpenBing(){
		driver.navigate().to("http://www.bing.com");
	}
	@Test
	public void openYahoo(){
		driver.navigate().to("http://www.yahoo.com");

	}
	@AfterSuite
	public void CloseBrowser(){
		//driver.quit();
		endtime = System.currentTimeMillis();
		totaltime= endtime - starttime;
		System.out.println(totaltime);
	}

}
