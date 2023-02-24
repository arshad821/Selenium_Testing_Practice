package Selnium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement waitbox =driver.findElement(By.xpath("//a[normalize-space()='Timeout']"));
		waitbox.click();

		WebElement waitalert = driver.findElement(By.id("accept"));
		waitalert.click();

		WebDriverWait explicitwait = new WebDriverWait(driver, 6);
		
		explicitwait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();


}
}
//implicit wait -> it is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. 
//The default setting is 0. Once we set the time, the web driver will wait for the element for that time before throwing an exception.
//syntax: driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

//explicit wait-> it is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception. It is an intelligent kind of wait, but it can be applied only for specified elements. 
//It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.
//syntax: WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

//Fluent wait -> it  is used to define maximum time for the web driver to wait for a condition, as well as the frequency with which we want to check the condition before throwing an “ElementNotVisibleException” exception. 
//It checks for the web element at regular intervals until the object is found or timeout happens.
//syntax: Wait wait = new FluentWait(WebDriver reference)

//thread.sleep -> The key point to note here is, unlike Thread.sleep(), it does not wait for the complete duration of time. In case it finds the element before the duration specified, 
//it moves on to the next line of code execution, thereby reducing the time of script execution.
