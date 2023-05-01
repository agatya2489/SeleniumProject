package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		//CSS with tag & id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");		
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		
		//tag & class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//tag & attribute
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("[placeholder = 'Search store']")).sendKeys("MacBook");
		
		//tag, class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text[placeholder = 'Search store']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text[type='text']")).sendKeys("MacBook");
		
		
		
		
	}

}
