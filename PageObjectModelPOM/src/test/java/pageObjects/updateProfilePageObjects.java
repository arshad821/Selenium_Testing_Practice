package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class updateProfilePageObjects {
	@FindBy(xpath="//*[@id='main-body']/div/div[1]/div[1]/div[1]/div/div[3]/a")
	public static WebElement update;
	@FindBy(id="inputPhone")
	public static WebElement phonenum;
	@FindBy(id="inputCity")
	public static WebElement city;
	@FindBy(xpath="//*[@id='main-body']/div/div[1]/div[2]/form/div[4]/input[1]")
	public static WebElement save;
	
	/*public static WebElement update(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='main-body']/div/div[1]/div[1]/div[1]/div/div[3]/a"));
	}
	public static WebElement phonenum(WebDriver driver){
		return driver.findElement(By.id("inputPhone"));
	}
	public static WebElement city(WebDriver driver){
		return driver.findElement(By.id("inputCity"));
	}
	public static WebElement save(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='main-body']/div/div[1]/div[2]/form/div[4]/input[1]"));
	}  */

	
}
