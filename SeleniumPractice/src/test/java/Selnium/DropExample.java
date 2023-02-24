package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement droppable =driver.findElement(By.xpath("//a[normalize-space()='AUI - 2']"));
		droppable.click();
		
		WebElement dragbox =driver.findElement(By.id("draggable"));
		
		WebElement dropbox = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(dragbox, dropbox).build().perform();
		Thread.sleep(3000);
		
		driver.close();

	}

}
