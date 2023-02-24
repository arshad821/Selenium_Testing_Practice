package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inputtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement edit =driver.findElement(By.className("card-footer-item"));
		edit.click();

		WebElement fulname =driver.findElement(By.id("fullName"));
		fulname.sendKeys("Arshad");

		WebElement append =driver.findElement(By.id("join"));
		append.sendKeys(" boy" + Keys.ENTER);

		WebElement getme =driver.findElement(By.id("getMe"));
		String get = getme.getAttribute("value");
		System.out.println(get);

		WebElement clearme =driver.findElement(By.id("clearMe"));
		clearme.clear();

		WebElement  disabled=driver.findElement(By.id("noEdit"));
		boolean noedit =	disabled.isEnabled();
		System.out.println(noedit);

		WebElement  read=driver.findElement(By.id("dontwrite"));
		String readonly =	read.getAttribute("readonly");
		System.out.println(readonly);







	}}
