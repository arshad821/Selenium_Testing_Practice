package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchyExample {
  @Test
  public void test() {
	  System.out.println("I am Test");
  }
  @Test
  public void test2() {
	  System.out.println("I am Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am bfr methd");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am aftr methd");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am bfr cls");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am aftr cls");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am bfr test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am aftr test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am bfr suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am aftr suite");
  }

}
