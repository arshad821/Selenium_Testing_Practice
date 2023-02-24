package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomTestDataForms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/test");

		WebElement sliderbutton =driver.findElement(By.xpath("//a[normalize-space()='All in One']"));
		sliderbutton.click();

		Faker faker = new Faker();
		String ffname =		faker.address().city();//name is no correct
		System.out.println(ffname);

		String lfname =		faker.food().toString();//name is no correct
		System.out.println(lfname);

		String mail=	faker.internet().emailAddress();
		System.out.println(mail);

		String adr =	faker.address().toString();
		System.out.println(adr);

		String adr2 = 	faker.address().city();
		System.out.println(adr2);

		String sta =	faker.address().state();
		System.out.println(sta);

		String pin	 = faker.address().zipCode();
		System.out.println(pin);


		WebElement fname =	driver.findElement(By.id("firstname"));
		fname.sendKeys(ffname);

		WebElement lname =	driver.findElement(By.id("lasttname"));
		lname.sendKeys(lfname);

		WebElement emailid =	driver.findElement(By.id("email"));
		emailid.clear();
		emailid.sendKeys(mail);

		WebElement phonecode = driver.findElement(By.xpath("//body//app-root//div[2]//div[2]//div[1]//div[1]//div[1]//select[1]"));
		Select select = new Select(phonecode);
		select.selectByValue("91");

		WebElement phonenum =	driver.findElement(By.id("Phno"));
		phonenum.sendKeys("1636727283");

		WebElement addr1 =	driver.findElement(By.id("Addl1"));
		addr1.sendKeys(adr);

		WebElement addr2 =	driver.findElement(By.id("Addl2"));
		addr2.sendKeys(adr2);

		WebElement state =	driver.findElement(By.id("state"));
		state.sendKeys(sta);

		WebElement pincode =	driver.findElement(By.id("postalcode"));
		pincode.sendKeys(pin);

		WebElement countryname = driver.findElement(By.
				xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select"));
		Select select1 = new Select(countryname);
		select1.selectByVisibleText("India");
		
		WebElement radio = driver.findElement(By.id("male"));
		radio.click();
		boolean radiobtn = radio.isSelected();
		
		
		WebElement Date = driver.findElement(By.id("Date"));
		Date.sendKeys("03082000");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
