package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1LocatorPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		//search box
		driver.findElement(By.id("small-searchterms")).sendKeys("HTC");
		Thread.sleep(2000);
		
		//search button
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		
		//link text & partial linktext
		driver.findElement(By.partialLinkText("HTC One M8 Android L 5.0 Lollipop")).click();
		
		//Finding number of sliders on home page
		List<WebElement> slider=driver.findElements(By.className("nivo-imageLink"));
		System.out.println("No. of Sliders:"+slider.size());
		
		//Find Total number of images in home page
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images:"+images.size());
		
		//Find total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		//add to cart
		driver.findElement(By.id("add-to-cart-button-18")).click();
		
		//shopping cart
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(1500);
		
		//terms of service
		driver.findElement(By.name("termsofservice")).click();
		Thread.sleep(1500);
		
		//checkout
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(1500);
		
		//register
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		
		//gender selection
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(1500);
		
		//Enter first name
		driver.findElement(By.name("FirstName")).sendKeys("Admin");
		Thread.sleep(1500);
		
		//Enter last name
		driver.findElement(By.name("LastName")).sendKeys("@dmin");
		Thread.sleep(1500);
		
		//Date
		driver.findElement(By.name("DateOfBirthDay")).sendKeys("26");
		Thread.sleep(1500);
		
		//Month
		driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
		Thread.sleep(1500);
		
		//Year
		driver.findElement(By.name("DateOfBirthYear")).sendKeys("2018");
		Thread.sleep(1500);
		
		//Entering Email
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin123@nopCommerce");
		Thread.sleep(1500);
		
		//Entering Company Name
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("DeccanLogiTech");
		Thread.sleep(1500);
		
		//Newsletter
		driver.findElement(By.name("Newsletter")).click();
		Thread.sleep(1500);
		
		//Password
		driver.findElement(By.id("Password")).sendKeys("admin123");
		Thread.sleep(1500);
		
		//Confirming Password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("admin123");
		Thread.sleep(1500);
		
		//Click on Register
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(3000);
		
		
	}

}
