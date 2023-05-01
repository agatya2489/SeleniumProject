package day28;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		// driver.manage().window().maximize();

		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Boston");

		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("London");

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("No. of rows in table: " + rows);

		int columns = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("No. of columns in table: " + columns);

		// capture prices then store in array

		String priceArr[]=new String[rows];  //0---4
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" +r+ "]/td[6]")).getText();
			priceArr[r-1]=price; //adding price into an array
			
		}
		
		//sort price then find lower price value
		for (String arrValue : priceArr) {
			System.out.println(arrValue);
		}
		
		Arrays.sort(priceArr); //this will able to sort strings, so no need to convert to number
		String lowestPrice=priceArr[0];
		System.out.println("Lower Price: "+lowestPrice);
		
		//find record in table having lower price
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr[\" +r+ \"]/td[6]")).getText();
			
			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr[\"+r+\"]/td[1]//input")).click();
				break;
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
