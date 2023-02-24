package seleniumlearning; 

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.By; 

public class OpenGoogle { 

	public static void main(String[] args) throws IOException { 

		/*
		 * FileInputStream stream = new FileInputStream("config.properties");
		 * 
		 * Properties properties = new Properties(); properties.load(stream); String
		 * browser = properties.getProperty("browser");
		 * 
		 * 
		 * String driverLocation = properties.getProperty("DriverLocation");
		 * 
		 * if(browser.equalsIgnoreCase("chrome")){
		 * System.setProperty("webdriver.chrome.driver",driverLocation ); driver = new
		 * ChromeDriver(); }else if(browser.equalsIgnoreCase("Firefox")){
		 * System.setProperty("webdriver.gecko.driver",driverLocation ); driver = new
		 * FirefoxDriver();
		 * 
		 * }
		 */
		
		//System.setProperty("webdriver.chrome.driver", ""); 
		//WebDriver driver = new ChromeDriver(); 
		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

		driver.get("https://www.google.com/"); 
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		//driver.manage().window().maximize(); 
		driver.findElement(By.className("M6CB1c rr4y5c")).click(); 
		driver.findElement(By.id("input")).sendKeys("lynch"); 
		//driver.quit(); 
		//driver.findElement(By.xpath("//button[text()='No thanks']")).click(); 
		//driver.findElement(By.name("p")).sendKeys("Kanyakumari"+Keys.ENTER); 
		//driver.close(); 
	} 

}
