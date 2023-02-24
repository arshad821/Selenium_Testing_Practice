package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement sliderbutton =driver.findElement(By.xpath("//a[normalize-space()='AUI - 5']"));
		sliderbutton.click();

		WebElement slide =	 driver.findElement(By.id("generate"));
		System.out.println(slide.getLocation());
		Actions actions = new Actions(driver);

		actions.clickAndHold(slide).moveByOffset(100, 189).build().perform();//learn offset
		Thread.sleep(2000);

		WebElement getcountry = driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div[1]/button"));
		getcountry.click();

		WebElement contryname =	driver.findElement(By.xpath("//div[@class='notification is-primary']"));
		String countrynames =contryname.getText();
		String[] splitednames =	countrynames.split("- ");
		for (String singlecountry : splitednames) {
			System.out.println(singlecountry);
			Thread.sleep(1000);//just to show
		}
		

		driver.close();

	}

}
