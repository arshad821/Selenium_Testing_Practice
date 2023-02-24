package Selnium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyDownAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplodDownlod {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement dombutton =driver.findElement(By.xpath("//a[normalize-space()='File management']"));
		dombutton.click();
		
		WebElement choosefile = driver.findElement(By.xpath("//span[@class='file-label']"));
		choosefile.click();
		Thread.sleep(1000);
		
		//window controls begin here
		StringSelection Stringslection = new StringSelection("C:\\Users\\2143925\\OneDrive - Cognizant\\Documents\\SFDC.pptx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Stringslection, null);
		
		//if it hapen webdriver means we can use action.
		//its happening in window so Robot class
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();


	}

}
