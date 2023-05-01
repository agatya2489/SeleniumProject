package day37;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount = 10)//test repeats 10 times
	void test()
	{
		System.out.println("testing....");
	}
	
}
