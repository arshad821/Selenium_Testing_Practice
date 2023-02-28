package LoginTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.updateProfilePageObjects;


public class UpdateProfile {
	@Test
	public void login() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\THALILA\\Desktop\\driver\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		Thread.sleep(3000);

		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.UserName.sendKeys("user1@php.com");
		LoginPageObjects.Password.sendKeys("Drh0O2pAJceq");
		LoginPageObjects.clicknotrobot.click();
		LoginPageObjects.LoginButton.click();
		
		PageFactory.initElements(driver, updateProfilePageObjects.class);
		updateProfilePageObjects.update.click();;
		updateProfilePageObjects.phonenum.sendKeys("12345667880");
		updateProfilePageObjects.city.sendKeys("Kings Land");
		updateProfilePageObjects.save.click();
		
		
		/*WebElement update= driver.findElement(By.xpath("//*[@id='main-body']/div/div[1]/div[1]/div[1]/div/div[3]/a"));
		update.click();
		WebElement phonenum= driver.findElement(By.id("inputPhone"));
		phonenum.sendKeys("123456789");
		WebElement city = driver.findElement(By.id("inputCity"));
		city.sendKeys("Kings Land");
		WebElement save = driver.findElement(By.xpath("//*[@id='main-body']/div/div[1]/div[2]/form/div[4]/input[1]"));
		save.click();*/
	}}
