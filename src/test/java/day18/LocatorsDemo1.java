package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		driver.findElement(By.id("dropdown-class-example")).sendKeys("option1");
		
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("NO THANKS")).click();
//		Thread.sleep(50000);
		
		driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.partialLinkText("Home")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
