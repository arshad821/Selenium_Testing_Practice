package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInteract2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 

		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); 
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		//1st task
		WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		homepagelink.click();

		//driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a")).click();
		//2nd task
		driver.navigate().back();
		WebElement wheretogolink = driver.findElement(By.partialLinkText("Find where am"));
		String where = wheretogolink.getAttribute("href");
		System.out.println("The link is going to"+ where);

		//3rd task
		WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();

		String errorpage = driver.getTitle();
		if(errorpage.contains("404")){
			System.out.println("it is broken link");
		}
		else{
			System.out.println("it is not broken link");
		}
		driver.navigate().back();

		//4th task
		homepagelink.click();
		driver.navigate().back();
		//5th task
		List<WebElement> countlink = driver.findElements(By.tagName("a"));
		int numoflinks = countlink.size();
		System.out.println(numoflinks);
		
	}
}