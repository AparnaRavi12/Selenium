package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class calculator {
	int a=10,b=20,c;
	
	@Test
	  public void add() {
		c=a+b;
		Assert.assertEquals(30, c);
	}
	@Test
	public void subract() {
		c=a-b;
		Assert.assertEquals(-10, c);
	}
	@Test
	public void multiply() {
		c=a*b;
		Assert.assertEquals(200, c);
}
	@Test(priority=3)
	public void divide() {
		c=a/b;
		Assert.assertEquals(0, c);
	}
}
