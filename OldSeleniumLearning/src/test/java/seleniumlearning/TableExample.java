package seleniumlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");

		//1st tassk
		List<WebElement> numofcolumns = driver.findElements(By.tagName("th"));
		int totalcolumns = numofcolumns.size();
		System.out.println(totalcolumns);

		//2nd task
		List<WebElement> numofrows = driver.findElements(By.tagName("tr"));
		int totalrows = numofrows.size();
		System.out.println(totalrows);

		//3rd task
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percentage = getpercent.getText();
		System.out.println("progress value of 'Learn to interact with Elements' is "+ percentage);

		//4th task
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberLists = new ArrayList<Integer>();

		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%", "");
			numberLists.add(Integer.parseInt(individualvalue));	 //prase int to convert int to strin 
		}
		System.out.println("Final List: "+ numberLists);

		int smallvalue = Collections.min(numberLists);
		System.out.println("Small value is : "+ smallvalue);

		String smallvalueint = Integer.toString(smallvalue)+"%";
		String finalxpath="//td[normalize-space()="+"\"" + smallvalueint + "\"" +"]"+"//following::td[1]";//escaping.
		System.out.println(finalxpath);

		WebElement checkbox = driver.findElement(By.xpath("//td[normalize-space()="+"\"" + smallvalueint + "\"" +"]"+"//following::td[1]"));
		checkbox.click();

	}}
