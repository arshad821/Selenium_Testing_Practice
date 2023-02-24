package Selnium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement windowbox =driver.findElement(By.xpath("//a[normalize-space()='Tabs']"));
		windowbox.click();

		String mainwindow = driver.getWindowHandle();

		WebElement homewindowbtn =driver.findElement(By.id("home"));
		homewindowbtn.click();

		Set<String> windows = 	driver.getWindowHandles();
		for (String newwindow : windows) {
			if(!newwindow.equals(mainwindow)) {
				driver.switchTo().window(newwindow);//Goto the newly opened tab
				System.out.println("Child window url : " + driver.getCurrentUrl());
				driver.close();//closing new window
			}
		}
		driver.switchTo().window(mainwindow);
		System.out.println("Main window url : " + driver.getCurrentUrl());
		//driver.close();//closing main window

		//another method to switch btw windows
		WebElement multiplewindowbtn =driver.findElement(By.id("multi"));
		multiplewindowbtn.click();
		Set<String> windows2 =	driver.getWindowHandles();
		List<String> Windowslist = new ArrayList<String>(windows2);
		driver.switchTo().window(Windowslist.get(2));
		System.out.println("3rd window url: " +  driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(Windowslist.get(1));
		System.out.println("2nd window url: " +  driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(Windowslist.get(0));
		System.out.println("1st window url: " +  driver.getCurrentUrl());
		driver.close();
	}

}
