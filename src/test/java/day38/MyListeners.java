package day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{

	public void onTestStart(ITestResult result)
	{
		System.out.println("on test start....");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("on test success....");
	}
	
	public void onTestFailures(ITestResult result)
	{
		System.out.println("on test failure....");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("on test skipped.........");
	}
	
	public void onFinish(ITestContext context) 
	{
		System.out.println("on test finish.........");
	}
	
}
