package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObjects {
	//username,pw,submitbutn 
    @FindBy(how=How.ID,using="inputEmail")
	public static WebElement UserName;
	@FindBy(id="inputPassword")
    public static WebElement Password;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	public static WebElement clicknotrobot;
	@FindBy(id="login")
	public static WebElement LoginButton;
	
	
	
	
	
	/*  public static WebElement UserName(WebDriver driver){ //by putting static without object we can acess classes
		return driver.findElement(By.id("inputEmail"));
	}

	public static WebElement Password(WebDriver driver){
		return driver.findElement(By.id("inputPassword"));
	}

	public static WebElement LoginButton(WebDriver driver){
		return driver.findElement(By.id("login"));
	}

	public static WebElement clicknotrobot(WebDriver driver){
		return driver.findElement(By.id("recaptcha-anchor"));
	}  */

}
