package pomexampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	
	static By muser=By.id("menuUser");
	static By user=By.name("username");
	static By pwd=By.name("password");
	//By sigin=By.id("sign_in_btnundefined");
	
	
	public static WebElement menuuser() {
		
		return driver.findElement(muser);
		
	}
	
	
	
	public static WebElement username() {
		
		return driver.findElement(user);
	}
	
	
	public static WebElement password() {
		
		return driver.findElement(pwd);
	}
	
	public static WebElement sigin() 		{
	
		return driver.findElement(By.id("sign_in_btnundefined"));
	
}
	
	
}
