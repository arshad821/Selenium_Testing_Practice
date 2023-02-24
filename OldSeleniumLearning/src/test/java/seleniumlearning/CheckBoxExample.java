package seleniumlearning; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 
 
public class CheckBoxExample { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
 
  driver.get("http://testleaf.herokuapp.com/pages/checkbox.html"); 
   
  WebElement radio1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]")); 
  radio1.click(); 
   
  WebElement radio2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input"));  ////*[@id="contentblock"]/section/div[2]/input
  boolean deflt = radio2.isSelected(); 
  System.out.println(deflt); 
   
  WebElement radio3 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[2]")); 
  if(radio3.isSelected()){ 
   radio3.click(); 
  } 
  WebElement radio4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/input[1]"));
 
 } 
 
}
