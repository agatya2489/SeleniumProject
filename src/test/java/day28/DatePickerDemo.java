package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); //switch to frame
		
		//Approach 1 handling the date picker
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("6/22/2022");
		
		
		//Approach 2
		
		String year="2015";
		String month="August";
		String date="15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //will open the date picker
		
		//select month and year
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button for Future Date
	     	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous button Past Date
		}
		
		//select date
	    List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")); //capture all the dates
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
//		for(int i=0;i<alldates.size();i++)
//		{
//			if(alldates.get(i).getText().equals(date))
//			{
//				alldates.get(i).click();
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
