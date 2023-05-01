package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select specific checkbox
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//Total no of checkbox
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		System.out.println("Total no. of ChekBoxes: "+checkboxes.size()); //7
		
		//select all the check boxes
		//Approach 1
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//			
//		}
		
		//Approach 2
//		for (WebElement chkbox : checkboxes)
//		{
//			chkbox.click();
//			
//		}
		
		//select last two checkboxes
		//total no of checkboxes - how many checkboxes to be started = starting index
		//7-2=5
//		for(int i=4;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
//		
//		//select first 2 checkboxes
		//approach 1
//		for(int i=0;i<2;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//approach 2
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			if (i < 2) {
//				checkboxes.get(i).click();
//			}
//		}
		
		//clear/uncheck checkboxes
		//Approach 1
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
//		
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			if(checkboxes.get(i).isSelected()) {
//			checkboxes.get(i).click();
//			}
//		}
		
		//Approach 2
		for (WebElement chkbx : checkboxes) {
			if(chkbx.isSelected()) {
				chkbx.click();
			}
		}	
		
	}

}
