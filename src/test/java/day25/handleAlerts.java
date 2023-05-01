package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		//Alert---if we having single button on alert window then use this
		//driver.switchTo().alert().accept();
		
	    //for alert---if we having chioces like Ok,Close then use this 
		//Alert alertwindow=driver.switchTo().alert();
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText()); //get message of alert window
		
		//alertwindow.accept(); //this will close alert window using OK button
		alertwindow.dismiss(); //this will close alert window by using CLOSE button
		
		
		
		
		
		
		
		
		
		
	}

}
