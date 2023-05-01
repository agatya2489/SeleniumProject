package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1) Launch browser
//2) open url
//	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
//3) Provide username  - admin@yourstore.com
//4) Provide password  - admin
//5) Click on Login button 
//6) Verify the title of dashboard page   
//	Exp title : Dashboard / nopCommerce administration
//7) Verify Dashboad

public class nopcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement txtemailbox=driver.findElement(By.name("Email"));
		txtemailbox.clear();
		Thread.sleep(5000);
		txtemailbox.sendKeys("admin123@me.com");
		
		WebElement txtpassword=driver.findElement(By.name("Password"));
		txtpassword.clear();
		Thread.sleep(5000);
		txtpassword.sendKeys("admin123");
		
		
		
		
		
		
	}

}
