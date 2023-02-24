package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class SortExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement sortbox =driver.findElement(By.xpath("//a[normalize-space()='AUI - 3']"));
		sortbox.click();

		WebElement  box1 =driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[1]"));
		WebElement  box2 =driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']//div[1]"));

		Point lo =	driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']//div[1]")).getLocation();
		System.out.println(lo);
		int x =	lo.getX();
		int y =	lo.getY();
		System.out.println(x);
		System.out.println(y);

		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.dragAndDrop(box1, box2).build().perform();
		//moveByOffset(-100, -100).build().perform();
	
	}
//offset problem need to know
	
}
