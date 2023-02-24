package Selnium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaywithElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement elementbox =driver.findElement(By.xpath("//a[normalize-space()='Find Elements']"));
		elementbox.click();

		driver.findElement(By.name("username")).sendKeys("ortonikc" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.className("is-rounded"));
		System.out.println(image.isDisplayed());
		boolean imagepresent =	image.isDisplayed();
		Assert.assertTrue(imagepresent, "There is image");

		String username = driver.findElement(By.xpath("//p[@class='title is-4']")).getText();  
		System.out.println("Username of this Git Page is:" + username);

		String place =driver.findElement(By.xpath("//p[@class='subtitle is-6']")).getText();
		System.out.println("Location is: " + place);

		String youtube=driver.findElement(By.xpath("//span[contains(text(),'Youtuber @letcode_with_koushik')]")).getText();
		System.out.println("Youtube Channel Details is: " + youtube);

		String publicrep = driver.findElement(By.xpath("(//span[@class='tag is-info'])[1]")).getText();
		System.out.println("Public Repository: " + publicrep);

		List<WebElement> listoflinks =driver.findElements(By.xpath("//*[@class='content']/ol/li/a"));
		int linklist =	listoflinks.size();
		System.out.println("These are the links : " + linklist );
		for (WebElement links : listoflinks) {
			System.out.println(links.getText());
		}
		
		Assert.assertNotEquals(publicrep, linklist);

		driver.close();

	}

}





