package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println("Before maximizing window:"+logo.getLocation());//(276, 81)
		
		driver.manage().window().maximize();
		System.out.println("After maximizing window:"+logo.getLocation());//(476, 98)
		
		driver.manage().window().minimize();
		System.out.println("After minimizing window:"+logo.getLocation());//(476, 98)
		
		driver.manage().window().fullscreen();
		System.out.println("After full screen window:"+logo.getLocation());//(476, 158)
		
		Point p=new Point(100, 100);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 100x100:"+logo.getLocation());//(277, 82)
		
		p=new Point(50, 50);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 50x50:"+logo.getLocation());//(278, 48)
	
	}

}
