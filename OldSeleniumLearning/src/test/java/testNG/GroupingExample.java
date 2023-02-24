package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	//oneplus and oppo only run test.
	
	@Test(groups={"apple"})
	public void apple1(){
		System.out.println("Apple testing");
	}
	@Test(groups={"apple"})
	public void apple2(){
		System.out.println("Apple testing");
	}
	@Test(groups={"oneplus"})
	public void oneplus1(){
		System.out.println("Oneplus testing");
	}
	@Test(groups={"oneplus"})
	public void oneplus2(){
		System.out.println("Oneplus testing");
	}
	@Test(groups={"redmi"})
	public void redmi1(){
		System.out.println("redmi testing");
	}
	@Test(groups={"redmi"})
	public void redmi2(){
		System.out.println("redmi testing");
	}
	@Test(groups={"oppo"})
	public void oppo1(){
		System.out.println("oppo testing");
	}
	@Test(groups={"oppo"})
	public void oppo2(){
		System.out.println("oppo testing");
	}
}
