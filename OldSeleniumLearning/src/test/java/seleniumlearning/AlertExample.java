package seleniumlearning; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.NoAlertPresentException;  
import org.openqa.selenium.Alert; 
 
 
public class AlertExample { 
 
 public static void main(String[] args) throws InterruptedException { 
  // TODO Auto-generated method stub 
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
 
  driver.get("http://testleaf.herokuapp.com/pages/Alert.html"); 
   
  WebElement alertBox  = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button")); 
  alertBox.click(); 
   
  Alert alert1 = driver.switchTo().alert(); 
  Thread.sleep(3000); 
  alert1.accept(); 
   
  WebElement alertBox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button")); 
  alertBox1.click(); 
   
  Alert confirmAlert = driver.switchTo().alert(); 
  Thread.sleep(3000); 
  confirmAlert.dismiss(); 
   
  WebElement alertEnter =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button")); 
  alertEnter.click(); 
   
  Alert EnterBox = driver.switchTo().alert(); 
  Thread.sleep(3000); 
  EnterBox.sendKeys("Alert! Lynch is here"); 
  EnterBox.accept(); 
 } 
 
}