package seleniumlearning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	
	public static void main(String[] args) { 
		  // TODO Auto-generated method stub 
		 WebDriver driver = null;   
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/Window.html");
		  //1st work
		  String oldwindow = driver.getWindowHandle();
		  
		  WebElement button1=driver.findElement(By.xpath("//*[@id='home']"));
		  button1.click();
		
		  Set<String> handles = driver.getWindowHandles();
		  
		  for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		  WebElement neweditbox = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
		  neweditbox.click();
		  
		  driver.close();
		  //2nd work
		  driver.switchTo().window(oldwindow);
		  
		  WebElement openmultiplewindow = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		  openmultiplewindow.click();
		  
		  int numofwindows = driver.getWindowHandles().size();
		  System.out.println(numofwindows);
		  //3rd work
		  WebElement dontcloseme = driver.findElement(By.id("color"));
		  dontcloseme.click();
		  
		  Set<String> newwindowhandles = driver.getWindowHandles();
		  for (String allwindows : newwindowhandles) {
			  if(!allwindows.equals(oldwindow)){
				  driver.switchTo().window(allwindows);
				  driver.close();
			  }
			
		}
		  driver.quit();
}
}