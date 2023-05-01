package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithElementsUsingJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor) driver; //type casting
		//JavascriptExecutor js=driver;
		
		
		//First Name -inputbox
		WebElement inputbox=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//Radio button
		WebElement male_rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();", male_rd);
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();", chkbox);
		
		//button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();", button);

		
		
		
		
	}

}


