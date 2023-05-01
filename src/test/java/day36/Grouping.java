package day36;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class Grouping {

	@Test(priority=1, groups= {"sanity", "regression"})
	void loginByEmail()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=4, groups= {"sanity", "regression"})
	void signupbyemail()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=7, groups= {"sanity", "regression"})
	void paymentinrupees()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("This is Login by Email...");
	}
	
	@Test(priority=9, groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is Login by Email...");
	}
	
}
