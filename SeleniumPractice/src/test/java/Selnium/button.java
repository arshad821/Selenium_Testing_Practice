package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement button =driver.findElement(By.xpath("//a[normalize-space()='Click']"));
		button.click();

		WebElement home =driver.findElement(By.id("home"));
		home.click();
		Thread.sleep(3000);
		driver.navigate().back();


		WebElement position =driver.findElement(By.id("position"));
		Point finalposition =	position.getLocation();
		System.out.println(finalposition);

		WebElement colour =driver.findElement(By.id("color"));
		String colourofbtn = colour.getCssValue("color");
		System.out.println(colourofbtn);
		
		
		WebElement size =driver.findElement(By.id("property"));
		Dimension sizeofbtn = size.getSize();
		System.out.println(sizeofbtn);
		
		WebElement  disabled=driver.findElement(By.id("isDisabled"));
		boolean noedit =	disabled.isEnabled();
		System.out.println(noedit);


		WebElement clickhold =	driver.findElement(By.xpath("//div[6]//div[1]//button[1]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(clickhold).build().perform();

	}

}
