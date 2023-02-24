package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	@Test(enabled=true) //if we give false all test case wont run.
	public void highschool(){
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highschool")
	public void highersecondary(){
		System.out.println("Higher secondary School");
	}
	@Test(dependsOnMethods="highersecondary")
	public void Engineering(){
		System.out.println("college");
	}
}
