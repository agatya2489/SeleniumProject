package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//getTitle
		System.out.println("Title of the page: "+driver.getTitle());
		
		//getURL
		System.out.println("Current URL:"+driver.getCurrentUrl());
		
		//getPageSource
//		System.out.println("PageSource:"+driver.getPageSource());
//		String ps=driver.getPageSource();
//		System.out.println(ps.contains("html"));
		
		//getWindowHandle -always generate different id
	//	System.out.println(driver.getWindowHandle()); //CDwindow-2F8E4BEA660F1D04BFF1D6B06D43A43B
		
		//getWindowHandles --get multiple browser windows
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens new browser windows
		
		Set<String> windowids=driver.getWindowHandles();
		
		for (String winid : windowids) {
			System.out.println(winid); //CDwindow-697BD0203C3EE9CE172EEEF37B44F2D8
			                           //CDwindow-32EDD103794645D1AD4FA9D701A39749
			
		}
		
	}

}
