package seleniumlearning; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; 
  
 
public class DropdownExamples { 
 
 public static void main(String[] args){ 
 
	 WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
 
  driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html"); 
   
   
  WebElement dropDown1 = driver.findElement(By.id("dropdown1")); 
   
  Select select = new Select(dropDown1); 
  select.selectByIndex(2); 
  select.selectByVisibleText("Selenium"); 
  select.selectByValue("3"); 
   
  List<WebElement> listofoptions = select.getOptions(); 
  int size = listofoptions.size(); 
       for(int i =0; i<size ; i++){ 
          String options = listofoptions.get(i).getText(); 
          System.out.println(options); 
       } 
       System.out.println(size); 
        
       dropDown1.sendKeys("Selenium"); 
        
       WebElement multipleselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[1]")); 
       Select multiselectbox = new Select(multipleselect); 
       multiselectbox.selectByIndex(0); 
       multiselectbox.selectByIndex(1); 
       multiselectbox.selectByIndex(2); 
   
 }  
 
}