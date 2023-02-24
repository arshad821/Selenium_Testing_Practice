package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//for shadow dom xpath cant be used
//if we use xpath or css selsector it will throw error.to work with DOM we must use js executor.
public class Shadowdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement dombutton =driver.findElement(By.xpath("//a[normalize-space()='DOM']"));
		dombutton.click();

	    //this method only applicable for shadow open
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jspath = "return document.querySelector(\"#open-shadow\").shadowRoot.querySelector(\"#fname\")";
		WebElement shadowdomfname = (WebElement) js.executeScript(jspath);
		shadowdomfname.sendKeys("ARSHAD");
		
		
		//jspath cant be copied for closed shadow dom.
		//this method for closed one . for close we cant interact directly so using direct js executor..
		String element = "document.querySelector(\'my-web-component\').myRoot.querySelector(\'#lname\').value=\'Arsh\'";
		js.executeScript(element);
		
	}

}
//if we dont know the object where dom is attached we cant automate...
