package seleniumlearning;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = null;

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div/div/div/a[1]"));
		download1.click();
		Thread.sleep(3000);
		
		File filelocation = new File("C:\\Users\\THALILA\\Downloads");
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			if(file.getName().equals("Download Excel"))
			{
				System.out.println("Its avail");
				break;
			}
			else{
				System.out.println("Not avail");
				break;
			}
		}

	}

}
