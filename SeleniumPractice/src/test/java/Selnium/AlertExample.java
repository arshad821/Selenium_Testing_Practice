package Selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement alertbox =driver.findElement(By.xpath("//a[normalize-space()='Dialog']"));
		alertbox.click();
		
		WebElement simplealert = driver.findElement(By.id("accept"));
		simplealert.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		WebElement dismissalert = driver.findElement(By.id("confirm"));
		dismissalert.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		
		WebElement namealert = driver.findElement(By.id("prompt"));
		namealert.click();
		Alert alert3= driver.switchTo().alert();
		alert3.sendKeys("Arshad Mohamed");
		alert3.accept();
		
		//sweetalert-it's not an alert but similar to alert
		WebElement modernalert = driver.findElement(By.id("modern"));
		modernalert.click();
		
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		driver.close();
		
		
		
		
		
	}

}
