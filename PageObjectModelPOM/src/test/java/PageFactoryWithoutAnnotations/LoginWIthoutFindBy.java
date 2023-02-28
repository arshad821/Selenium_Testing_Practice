package PageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWIthoutFindBy {
 // this website wont work becoz there is no id to locate element...
	
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public  static WebElement btnLogin;
	
	@Test
	public void login(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver,LoginWIthoutFindBy.class);
		txtUsername.sendKeys("Admin1");
		txtPassword.sendKeys("admin");
		btnLogin.click();
		
	}

}
