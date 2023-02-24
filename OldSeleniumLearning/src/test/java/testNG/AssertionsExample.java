package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name = "Arshad";
	boolean value = true;
	@Test
	public void CheckEqual(){
		Assert.assertEquals(name, "Arshad");
		Assert.assertTrue(value, "This shouldnot true");
	}

}
