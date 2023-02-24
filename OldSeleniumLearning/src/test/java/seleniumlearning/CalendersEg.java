package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendersEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

			driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

			WebElement calender = driver.findElement(By.id("datepicker"));
			//calender.sendKeys("08/10/2022" +Keys.ENTER);
			calender.click();

			WebElement nextbutton = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
			nextbutton.click();

			WebElement selectdate = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a"));
			selectdate.click();


	}

}
