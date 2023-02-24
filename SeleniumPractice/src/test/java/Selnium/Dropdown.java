package Selnium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement dropdown =driver.findElement(By.xpath("//a[normalize-space()='Drop-Down']"));
		dropdown.click();

		WebElement apple = 	driver.findElement(By.id("fruits"));
		Select select = new Select(apple);
		select.selectByVisibleText("Apple");
		
		
		WebElement superhero = 	driver.findElement(By.id("superheros"));
		Select select1 = new Select(superhero);
		boolean multiple = select1.isMultiple();
		System.out.println(multiple);
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.selectByValue("bt");
		
		WebElement coding = 	driver.findElement(By.id("lang"));
		Select select2 = new Select(coding);
		select2.selectByValue("sharp");
		List<WebElement> listvalues = 	select2.getOptions();
		for (WebElement webElementvalue : listvalues) {
			System.out.println(webElementvalue.getText());
		}
		
		
		WebElement selectcountry = 	driver.findElement(By.id("country"));
		Select select3 = new Select(selectcountry);
		select3.selectByValue("India");
		System.out.println(select3.getFirstSelectedOption().getText());
		
		
		
	}

}
