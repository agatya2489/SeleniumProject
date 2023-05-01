package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=driver;
		
		//1) Scroll down page by pixel
//		js.executeScript("window.scrollBy(0,3000)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));//3000
		
		//2) scroll down the page till the element is present
//		WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", flag);
//		System.out.println(js.executeScript("return window.pageYOffset;")); //4960.7998046875

//		//3) scroll down till the end of the page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
