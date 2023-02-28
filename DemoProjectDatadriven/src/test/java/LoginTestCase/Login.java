package LoginTestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	String[][] data=null;
	WebDriver driver;


	/*String[][] data={
	{"Admin1","admin"},
	{"Admin1","dummy"},
	{"Admin1","admin"},
	{"Admin1","admin1"}
	}; */


	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException{

		data=getExcelData();

		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException{
		FileInputStream excel = new FileInputStream("C:\\Users\\2143925\\OneDrive - Cognizant\\Desktop\\TestData.xls");

		Workbook workbook = Workbook.getWorkbook(excel);

		Sheet sheet = workbook.getSheet(0);

		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String testData[][] = new String[rowCount-1][columnCount];

		for(int i=1;i<rowCount; i++){
			for(int j=0;j<columnCount; j++){
				testData[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		return testData;
	}
	@BeforeTest
	public void beforetest(){

		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	@AfterTest
	public void aftertest(){
		driver.quit();
	}

	@Test(dataProvider="loginData")
	public void login(String uname , String pword) throws InterruptedException{


		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pword);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();


	}}
