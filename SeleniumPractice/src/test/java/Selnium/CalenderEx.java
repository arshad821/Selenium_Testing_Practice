package Selnium;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement sliderbutton =driver.findElement(By.xpath("//a[normalize-space()='Date & Time']"));
		sliderbutton.click();

		WebElement startdate =  driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		startdate.click();
		
		//learn more about coding and calender..

	}

}
