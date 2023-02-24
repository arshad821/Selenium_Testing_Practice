package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int num = selectable.size();
		System.out.println(num);
		
	/*	Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();   */
		
		Actions action = new Actions(driver);
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2));
		action.clickAndHold(selectable.get(3));
		action.build().perform();
	}

}
