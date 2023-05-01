package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1111");
		
		driver.switchTo().defaultContent();
		
		//frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("3333");
		
		//inner frame
		driver.switchTo().frame(0); //Don't prefer for multiple inner frames we don't the index
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click(); //select first radio button in frame
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
