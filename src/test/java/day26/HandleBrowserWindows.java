package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//captures id's of browser window
		
		Set<String> windowIDs=driver.getWindowHandles(); //currently store 2 window id's
		
		//Approach 1 -- for two windows-- using list collection
//		//converted set ------>> list
//		List<String> windowsList= new ArrayList(windowIDs); //retrieve single value by using get method
//		
//		String parentWindowID=windowsList.get(0);
//		String childWindowID=windowsList.get(1);
//		
//		
//		//switch to child window
//		driver.switchTo().window(childWindowID);
//		
//		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//		
//		//switch to parent window
//		driver.switchTo().window(parentWindowID);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		
		
		//Approach 2 -- for multiple windows
//		//switching
//		for (String winID : windowIDs) {
//			String title = driver.switchTo().window(winID).getTitle();
//		
//			if (title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
//				
//				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//
//			}
//			}
		
		//closing specific browser windows based on our choice
		for (String winid : windowIDs) {
			String title=driver.switchTo().window(winid).getTitle();
			
			if (title.equals("OrangeHRM")) {
				driver.close();
			}
		
		
		
		}
		
		
	}

}
