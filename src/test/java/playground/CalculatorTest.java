package playground;

import junit.framework.Assert;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest()
	{
		Calculator calc = new Calculator();
		Assert.assertEquals(2, calc.add(1, 1));
	}
	
}
