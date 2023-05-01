package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
	
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(oslo, norway).perform();
		
		WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden=driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stockholm, sweden).perform();
		
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedstates=driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(washington, unitedstates).perform();
		
		WebElement copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(copenhagen, denmark).perform();
		
		WebElement seoul=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southkorea=driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(seoul, southkorea).perform();
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();

		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(madrid, spain).perform();
		
	}

}
