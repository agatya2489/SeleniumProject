package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);//opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //open in another window
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		
	}

}
