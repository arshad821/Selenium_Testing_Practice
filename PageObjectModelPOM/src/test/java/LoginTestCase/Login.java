package LoginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPageObjects;

public class Login {
	@Test
	public void login() throws InterruptedException{
		
		WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://phptravels.org/login");
		Thread.sleep(3000);
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.UserName.sendKeys("user1@php.com");
		LoginPageObjects.Password.sendKeys("Drh0O2pAJceq");
		LoginPageObjects.clicknotrobot.click();
		LoginPageObjects.LoginButton.click();
		driver.quit();
		
		
		/* LoginPageObjects.UserName(driver).sendKeys("user1@php.com");
		LoginPageObjects.Password(driver).sendKeys("Drh0O2pAJceq");
		LoginPageObjects.clicknotrobot(driver).click();
		LoginPageObjects.LoginButton(driver).click(); */
		
		
		/*WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("user@phpbrowser.com");
		
		WebElement pword = driver.findElement(By.id("inputPassword"));
		pword.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();*/
		
		
	}

}
