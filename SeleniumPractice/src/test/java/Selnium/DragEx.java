package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragEx {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement draggable =driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']"));
		draggable.click();

		WebElement dragbox =driver.findElement(By.id("sample-box"));
		int x = 	dragbox.getLocation().getX();
		int y =     dragbox.getLocation().getY();
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(dragbox, x+7, y+50).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
