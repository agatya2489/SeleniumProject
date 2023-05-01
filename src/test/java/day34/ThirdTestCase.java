package day34;

import org.testng.annotations.Test;

public class ThirdTestCase {

	@Test(priority=0)
	void test1()
	{
	System.out.println("Test 1");	
	}
	
	@Test(priority=0)
	void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(priority=0)
	void test3()
	{
		System.out.println("Test 3");
	}
	
}
