package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	void test()
	{
//		int x=10;
//		int y=15;
//		
//		if(x==y)
//		{
//			System.out.println("Test Passed");
//		}
//		
//		else
//		{
//			System.out.println("Test Failed");
//		}
//		
//		Assert.assertEquals(x, y);
//		
//		//Assert.assertTrue(true);
//		Assert.assertTrue(false);
		
		
		int a=10;
		int b=20;
		
		//Assert.assertEquals(actual, expected, description);
		//Assert.assertEquals(a>b, true, "a is not greater than b");
		
		
		String s1="abc";
		String s2="abc1";
		
		//Assert.assertEquals(s1, s2, "String 0are not equal");
		
		Assert.assertNotEquals(s1, s2);
		
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}
		
		
	}	
	
}
