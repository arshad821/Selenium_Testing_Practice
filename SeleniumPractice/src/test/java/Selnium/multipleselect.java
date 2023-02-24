package Selnium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement multiselect =driver.findElement(By.xpath("//a[normalize-space()='AUI - 4']"));
		multiselect.click();

		
		

		Actions action=new Actions(driver);
		for(int i = 1 ; i<10 ; i++) {
			
			WebElement items = 	driver.findElement(By.xpath("(//*[@id=\"clour\"])["+i+"]"));
			action.keyDown(Keys.CONTROL)
			.click(items)
			.build().perform();
			Thread.sleep(2000);	
		}
		driver.close();
	}//since the xpath is same using for loop otherwise NA..
}
