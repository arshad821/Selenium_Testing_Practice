package seleniumlearning; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement; 
 
public class EditBox { 
  
 public static void main(String args[]) 
 { 
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
  driver.get("http://leafground.com/pages/Edit.html");  
   
  WebElement emailBox=driver.findElement(By.id("email")); 
  emailBox.sendKeys("123abc@gmai.com"); 
   
  WebElement appendBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")); 
  appendBox.sendKeys("Arsad"); 
   
  WebElement textBox=driver.findElement(By.name("username")); 
  String value = textBox.getAttribute("value"); 
  System.out.println(value); 
   
  WebElement clearBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")); 
  clearBox.clear(); 
   
  WebElement disableBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")); 
  boolean enabled= disableBox.isEnabled(); 
  System.out.println(enabled); 
 
} 
}