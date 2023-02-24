package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTesting {

	public void OpenGoogle(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\THALILA\\Desktop\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("www.google.co.in");
		driver.quit();
	}

	public void OpenBing(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\THALILA\\Desktop\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("www.bing.co.in");
		driver.quit();
	}

}
