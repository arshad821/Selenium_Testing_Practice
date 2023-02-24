package testNG;

import org.testng.annotations.Test;

public class DriveAcar {
	//priority keyword is used to execute in order.
	@Test(priority=0)
	public void startcar(){
		System.out.println("Start the car");
	}
	@Test(priority=1)
	public void putfirstgear(){
		System.out.println("put first giear in the car");
	}
	@Test(priority=2)
	public void secondgear(){
		System.out.println("put second gear");
	}
	@Test(priority=3)
	public void thirdgear(){
		System.out.println("put 3rd gear");
	}
}
