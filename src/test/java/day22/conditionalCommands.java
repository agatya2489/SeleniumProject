package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class conditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed()
		//Approach 1
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of Logo:"+logo.isDisplayed());
		
		//Approach 2
//		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println(status);
		
		//isDisplayed()  isEnabled()
		//Approach 1
		WebElement searchBox=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		System.out.println("Display Status: "+searchBox.isDisplayed());
		System.out.println("Enabled Status: "+searchBox.isEnabled());
		
		
		//Approach 2
//		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
//		System.out.println(status);
		
		//isSelected()
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		System.out.println("Before Selection....");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		//After selection of male radio button 
		System.out.println("After selection of male radio button...");
		male_rd.click();
		
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
		
		//After selection of female radio button 
		System.out.println("After selection of female radio button...");
		female_rd.click();
		
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true
	
	}

}
