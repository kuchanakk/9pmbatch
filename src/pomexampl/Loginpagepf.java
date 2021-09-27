package pomexampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepf {
	
	
	WebDriver driver;
	
	public Loginpagepf(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@Findby(att="value") static Webelemnt name;
	@FindBy(id="menuUser") static WebElement muser;
	@FindBy(name="username") static WebElement uname;
	@FindBy(name="password") static WebElement pwd;
	@FindBy(id="sign_in_btnundefined") static WebElement sign;
	
	
public static WebElement menuuser() {
		
		return muser;
		
	}
	
	
	
	public static WebElement username() {
		
		return uname;
	}
	
	
	public static WebElement password() {
		
		return pwd;
	}
	
	public static WebElement sigin() 		{
	
		return sign;
	
}
	
	

}
