package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	
	public static void main(String[] args) throws InterruptedException { 
		  // TODO Auto-generated method stub 
		   
		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/autoComplete.html");
		  
		  WebElement textbox = driver.findElement(By.id("tags"));
		  textbox.sendKeys("s");
		  Thread.sleep(4000);
		  
		  List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		  
		  for (WebElement webElement : optionslist) {
			  if(webElement.getText().equals("Web Services")){
				  webElement.click();
				  break;
			  }
			
		}

}}
