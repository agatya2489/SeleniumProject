package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//clicking on the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		
		//find total no of options
		System.out.println("Total no of Options: "+options.size());
		
		//print all options from dropdown
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		
//		for (WebElement opt : options) {
//			System.out.println(opt.getText());
//		}
		
		//to select the options from dropdown
		
//		for(int i=0;i<options.size();i++)
//		{
//			String option=options.get(i).getText();
//			if(options.equals("Java") || options.equals("Python"))
//			{
//				options.get(i).click();
//				//break;
//			}
//		}
		
		for (WebElement opt : options) {
			String text=opt.getText();
			if(text.equals("Java") || text.equals("Python"))
			{
				opt.click();
			}
		}
		
		

		
		
		
		
	}

}
