package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver(); 
			  driver.get("http://www.leafground.com/pages/frame.html");
			  //1st task
			  driver.switchTo().frame(0);
			  WebElement button1 = driver.findElement(By.xpath("//*[@id='Click']"));
			  button1.click();
			  
			  String text = driver.findElement(By.xpath("//*[@id='Click']")).getText();
			  System.out.println(text);
			  
			  //2ndtask
			  
			  driver.switchTo().defaultContent();
			  driver.switchTo().frame(1);
			  driver.switchTo().frame("frame2");
			  
			  WebElement button2 = driver.findElement(By.id("Click1"));
			  button2.click();
			  String text1 = driver.findElement(By.id("Click1")).getText();
			  System.out.println(text1);
			  
			  //3rd task
			  driver.switchTo().defaultContent();
			  List<WebElement> numofframes = driver.findElements(By.tagName("iframe"));
			  int totalframes = numofframes.size();
			  System.out.println(totalframes);
			  
			  
			 // driver.close();
	}

}
