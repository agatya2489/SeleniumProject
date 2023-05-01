package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span")); //xpath created by own
		
		System.out.println("No. of Options: "+list.size());
		
		//capture autosuggestions
		//select an options from list
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());
			
			String text=list.get(i).getText();
			if(text.equals("selenium webdriver"))
					{
				         list.get(i).click();
				         break;
					}
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
