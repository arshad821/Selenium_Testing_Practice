package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement framebox =driver.findElement(By.xpath("//a[normalize-space()='Inner HTML']"));
		framebox.click();
		
		//first frame
		driver.switchTo().frame("firstFr"); //frame name
		WebElement firstname =driver.findElement(By.name("fname"));
		firstname.sendKeys("Mohamed");
		WebElement lastname =driver.findElement(By.name("lname"));
		lastname.sendKeys("Arshad");
		
		//switching to nested frame
		driver.switchTo().frame(0); //second frame -> it is in first positon of 2nd frame
		WebElement email =driver.findElement(By.name("email"));
		email.sendKeys("arshadarsh07@gmail.com");
		
		//switching again to parent frame
		driver.switchTo().parentFrame();
		WebElement lastname2 =driver.findElement(By.name("lname"));
		lastname2.sendKeys(" Kaleeth");

		//switching to main frame
		driver.switchTo().defaultContent();
		WebElement refervideo =	driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"));
		refervideo.click();


		driver.close();
	}

}
