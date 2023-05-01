package day35.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	void XYZ()
	{
		System.out.println("This is XYZ from class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("This is After test method");
	}
	
}
