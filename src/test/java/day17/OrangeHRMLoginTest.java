package day17;
//1) Launch browser
//2) open url
//	https://opensource-demo.orangehrmlive.com/
//3) Provide username  - Admin
//4) Provide password  - admin123
//5) Click on Login button 
//6) Verify the title of dashboard page   
//	Exp title : OrangeHRM
//7) close browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//OR
		//WebDriverManager.chromedriver().setup();
		//OR
		
		//1. Launch WebBrowser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2. open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//for full window - chaining method
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//3. provide user name - Admin
		//WebElement txtUsername= driver.findElement(By.name("username"));
		//txtUsername.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4. provide password -admin1234
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5. click on the login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(7000);
		
		//6. verify the title of the dashboard page
		//Title validation
//	    String act_title=driver.getTitle();
//		String exp_title="OrangeHRM";
//		
//		if(act_title.equals(exp_title))
//		{
//			System.out.println("Test Passed");
//		}
//		else
//		{
//			System.out.println("Test Not Passed");
//		}
		
		//Label Validation
		String act_label="";
		
		try
		{
			act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(Exception e)
		{
			
		}
		
		String exp_label="Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//7. close browser
		//driver.close();
		driver.quit();
	
		
	}

}
