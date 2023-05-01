package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By img_logo_loc=By.xpath("//img[@alt='company-branding']");
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.name("password");
	By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Actions
	
	public void setUsername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean clickLogoPresence()
	{
		boolean status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	
	
}
