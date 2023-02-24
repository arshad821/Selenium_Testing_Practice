package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement radiobox =driver.findElement(By.xpath("//a[normalize-space()='Toggle']"));
		radiobox.click();

		WebElement firstbtn =driver.findElement(By.id("yes"));
		firstbtn.click();

		WebElement secondbtn =driver.findElement(By.id("two"));
		secondbtn.click();
		System.out.println(secondbtn.isSelected());

		WebElement bugbtn = driver.findElement(By.id("bug"));
		bugbtn.click();
		if(bugbtn.getAttribute("name").equalsIgnoreCase("bug")) {
			System.out.println("Bug has beeen and clicked the " + bugbtn.getAttribute("name") );
		}
		else {
			System.out.println("no bug found");
		}

		WebElement findbtn = driver.findElement(By.id("notfoo"));
		String check = 	findbtn.getAttribute("checked");
		//System.out.println(check);
		if(check.equalsIgnoreCase("true")) {
			System.out.println("This radiobtn selected");
		}

		WebElement disabledbtn = driver.findElement(By.id("maybe"));
		System.out.println("is this Buttonn enabled : "+disabledbtn.isEnabled());

		WebElement checkedbox = driver.findElement(By.xpath("//label[normalize-space()='Remember me']//input[@type='checkbox']"));
		System.out.println("Is this checkbox selected: " + checkedbox.isSelected());



	}
}
