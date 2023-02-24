package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> items = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement from = items.get(6);
		
		WebElement to = items.get(0);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to);
		action.build().perform();
		

	}

}
