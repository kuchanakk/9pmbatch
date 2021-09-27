package pomexampl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(15000);
		lp.menuuser().click();
		lp.username().sendKeys("kirank");
		lp.password().sendKeys("0123456kK");
		Thread.sleep(5000);
		lp.sigin().click();
		

	}

}
