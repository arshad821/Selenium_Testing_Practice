package seleniumlearning; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 
 
public class LinkExample { 
  
 public static void main(String args[]) 
 { 
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
   
  driver.get("http://leafground.com/pages/Link.html"); 
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  driver.findElement(By.linkText("Go to Home Page")).click(); 
  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  //driver.close(); 
 } 
 
}