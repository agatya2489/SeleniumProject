package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1) find total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // 7 --preferred
		// int rows=driver.findElements(By.tagName("tr")).size(); //8 --preferred only
		// if u have one single table

		System.out.println("No. of rows: " + rows);

		// 2) find total number of columns
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		// int cols=driver.findElements(By.tagName("th")).size(); //preferred only if u
		// have one single table

		System.out.println("No. of Columns: " + cols); // 4

		// 3) Read specific row and column data
//		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
//		
//		System.out.println(value);

		// 4) Read data from all the rows and column

		//System.out.println("Book Name" + "     " + "Author" + "    " + "Subject" + "       " + "Price");

		for (int r = 2; r <= rows; r++) 
		{
			for (int c = 1; c <= cols; c++) 
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}

		// 5) Print book names whose author is Amit
		for (int r = 2; r <= rows; r++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
           
			if(author.equals("Amit"))
			{
				String booknm=driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
				System.out.println(author+"  "+booknm);
			}
		}

		// 6) Find sum of prices of all the books

		int sum=0;
		for(int r=2;r<=rows;r++)
		{
		    String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		    sum=sum+Integer.parseInt(price);
		}
		      System.out.println("Total Price= "+sum);
		
	}

}
