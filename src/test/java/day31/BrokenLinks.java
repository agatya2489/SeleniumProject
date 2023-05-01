package day31;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links: "+links.size());//48
		
		int brokenlinks=0;
		
		for (WebElement linkEle : links) 
		{
			String hrefAttvalue=linkEle.getAttribute("href");
			
			//pre-requisite for checking broken links
			if(hrefAttvalue==null || hrefAttvalue.isEmpty())
			{
				System.out.println("href attributes value is Empty");
				continue;
			}
			//checking link is broken or not
			URL linkurl=new URL(hrefAttvalue);//convert String----> url format
			
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();//send request to server - open, connect
			
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefAttvalue+"  "+"===> Broken Link");
				brokenlinks++;
			}
			else
			{
				System.out.println(hrefAttvalue+"  "+"===> Not Broken Link");
			}
		
		}
		System.out.println("Total no. of Broken links: "+brokenlinks);
		
		
	}

}
