package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement name = driver.findElement(By.id("age"));
		String tooltiptext = name.getAttribute("title");
		System.out.println(tooltiptext);
		driver.close();
	}

}
