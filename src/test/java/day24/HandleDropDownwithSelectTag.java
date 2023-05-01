package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));		
		Select drpCountry= new Select(drpCountryEle);
		
		//1. selecting an option from drop down
		//drpCountry.selectByVisibleText("USA");
		
		//drpCountry.selectByValue("4"); //use this if only Value attribute is available
		
		drpCountry.selectByIndex(3); //france
		
		//2. find total options in dropdown
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("Total no of Options: "+options.size());
		
		//3. print options in console window
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}	
		
	}

}
