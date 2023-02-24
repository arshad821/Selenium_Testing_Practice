package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageInteraction {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 

		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		
		//1st work
		WebElement image1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		image1.click();
		
		WebElement imagebox = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a"));
		imagebox.click();
		//2nd work
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		//naturalwidth = 0 its broken image.
		if(brokenimage.getAttribute("naturalWidth").equals("0")){
			System.out.println("It is broken image");
		}
		
		
	}}
