package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommandsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		//driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); //amazon
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); //flipkart
		
		driver.navigate().refresh(); //refresh the page
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
