package pomexampl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestPf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com");
		Loginpagepf lpf= new Loginpagepf(driver);
		Thread.sleep(15000);

		lpf.menuuser().click();
		lpf.username().sendKeys("kirank");
		lpf.password().sendKeys("0123456kK");
		Thread.sleep(5000);

		lpf.sigin().click();
	
	}

}
