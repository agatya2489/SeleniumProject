package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopuporAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//https://the-internet.herokuapp.com/basic_auth  //actual url
		//https://aadmin:admin@the-internet.herokuapp.com/basic_auth

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations!"))
		{
			System.out.println("Successful Login");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
