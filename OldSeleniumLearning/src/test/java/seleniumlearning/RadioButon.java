package seleniumlearning; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 
 
public class RadioButon { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
 
  driver.get("http://leafground.com/pages/radio.html"); 
   
  WebElement below20 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]")); 
   
   
  WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[2]")); 
 
  boolean status1 = below20.isSelected(); 
  System.out.println(status1); 
  boolean status2 = checked.isSelected(); 
  System.out.println(status2); 
 } 
 
}
